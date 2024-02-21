package Back_End;
import java.util.*;
import java.io.FileWriter;
import java.io.IOException;
import javax.swing.JTextArea;

class Vertex {
    public String label;

    public Vertex(String lab){
        label = lab;
    }
}

public class Adj_Mat_Graph {
    private final int MAX_VERTS = 30;
    private int nVerts;
    private Vertex vertexList[];
    private int adjMat[][];
    private int[] shortestPath;
    private boolean[] visited;

    public Adj_Mat_Graph() {
        vertexList = new Vertex[MAX_VERTS];
        adjMat = new int[MAX_VERTS][MAX_VERTS];
        nVerts = 0;
        shortestPath = new int[MAX_VERTS];
        visited = new boolean[MAX_VERTS];

        for (int i = 0; i < MAX_VERTS; i++) {
            for (int j = 0; j < MAX_VERTS; j++) {
                adjMat[i][j] = 0;
            }
        }
    }

    public void addVertex(String label) {
        vertexList[nVerts++] = new Vertex(label);
    }

    public void addEdge(int start, int end, int weight) {
        adjMat[start][end] = weight;
    }

    public void displayVertex(int v) {
        System.out.print(vertexList[v].label + " ");
    }

    public void displayEdges() {
        for (int i = 0; i < nVerts; i++) {
            for (int j = 0; j < nVerts; j++) {
                if (adjMat[i][j] > 0) {
                    System.out.println("Edge from " + vertexList[i].label + " to " + vertexList[j].label + " with weight " + adjMat[i][j]);
                }
            }
        }
    }

    public void dijkstra(int startVertex) {
        Arrays.fill(shortestPath, Integer.MAX_VALUE);
        Arrays.fill(visited, false);

        shortestPath[startVertex] = 0;

        for (int i = 0; i < nVerts - 1; i++) {
            int u = findMinDistanceVertex();

            if (u == -1) {
                break;
            }

            visited[u] = true;

            for (int v = 0; v < nVerts; v++) {
                if (!visited[v] && adjMat[u][v] != 0 && shortestPath[u] != Integer.MAX_VALUE
                        && shortestPath[u] + adjMat[u][v] < shortestPath[v]) {
                    shortestPath[v] = shortestPath[u] + adjMat[u][v];
                }
            }
        }
    }


    public int findMinDistanceVertex() {
        int minDistance = Integer.MAX_VALUE;
        int minVertex = -1;

        for (int v = 0; v < nVerts; v++) {
            if (!visited[v] && shortestPath[v] < minDistance) {
                minDistance = shortestPath[v];
                minVertex = v;
            }
        }

        return minVertex;
    }

    public void displayShortestPaths() {
        System.out.println("Shortest paths from the start vertex:");
        for (int v = 0; v < nVerts; v++) {
            System.out.println("To vertex " + vertexList[v].label + ": " + shortestPath[v]);
        }
    }


    private List<Integer> getConnectedNodes(int currentVertex, boolean[] visited) {
        List<Integer> connectedNodes = new ArrayList<>();
        for (int v = 0; v < nVerts; v++) {
            if (adjMat[currentVertex][v] > 0 && !visited[v]) {
                connectedNodes.add(v);
            }
        }
        return connectedNodes;
    }

    private List<Integer> findDirectPath(int startVertex, int endVertex) {
        if (adjMat[startVertex][endVertex] > 0) {
            List<Integer> path = new ArrayList<>();
            path.add(startVertex);
            path.add(endVertex);
            return path;
        }

        return null;
    }

    private boolean isReversePath(int startVertex, int endVertex) {
        return adjMat[endVertex][startVertex] > 0;
    }

    public String[] detectRoadDirection(int startVertex, int endVertex) {
        boolean[] visited = new boolean[MAX_VERTS];
        Queue<Integer> queue = new LinkedList<>();
        queue.add(startVertex);
        visited[startVertex] = true;

        List<Integer> directPath = findDirectPath(startVertex, endVertex);
        boolean isReversePath = isReversePath(startVertex, endVertex);

        if (directPath != null) {
            if (isReversePath) {
                return new String[]{"Perhatian: Rute dari " + vertexList[startVertex].label + " ke " + vertexList[endVertex].label + " melawan arus.\n"};
            } else {
                return new String[]{"Bergerak dari " + vertexList[startVertex].label + " langsung menuju " + vertexList[endVertex].label, "\nAnda telah mencapai lokasi tujuan."};
            }
        }

        List<String> result = new ArrayList<>();
        while (!queue.isEmpty()) {
            int currentVertex = queue.poll();

            List<Integer> connectedNodes = getConnectedNodes(currentVertex, visited);
            for (int nextVertex : connectedNodes) {
                if (!visited[nextVertex]) {
                    visited[nextVertex] = true;
                    queue.add(nextVertex);

                    List<Integer> directPathFromNext = findDirectPath(nextVertex, endVertex);
                    if (directPathFromNext != null) {
                        result.add("Bergerak dari " + vertexList[startVertex].label + "\n");
                        for (int vertex : directPathFromNext) {
                            result.add("Bergerak menuju " + vertexList[vertex].label+ "\n");
                        }
                        result.add("Anda telah tiba di " + vertexList[endVertex].label);
                        return result.toArray(new String[0]);
                    }
                }
            }
        }   

        if (isReversePath)  return new String[]{"Perhatian: Rute dari " + vertexList[startVertex].label + " ke " + vertexList[endVertex].label + " melawan arus."};
        else return new String[]{""};
        
    } 

    public static String generateDOT(Adj_Mat_Graph graph) {
        StringBuilder dot = new StringBuilder();
        dot.append("digraph WeightedDirectedGraph {\n");

        for (int i = 0; i < graph.nVerts; i++) {
            dot.append("  ").append(i).append(" [label=\"").append(graph.vertexList[i].label).append("\"];\n");
        }

        for (int i = 0; i < graph.nVerts; i++) {
            for (int j = 0; j < graph.nVerts; j++) {
                if (graph.adjMat[i][j] > 0) {
                    dot.append("  ").append(i).append(" -> ").append(j).append(" [label=\"").append(graph.adjMat[i][j]).append("\"];\n");
                }
            }
        }

        dot.append("}\n");

        return dot.toString();
    }

    public static void saveDOTFile(String filePath, String dotString) {
        try {
            FileWriter writer = new FileWriter(filePath);
            writer.write(dotString);
            writer.close();
            System.out.println("DOT file saved successfully: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public int getIndexByLabel(String label) {
        for (int i = 0; i < nVerts; i++) {
            if (vertexList[i].label.equals(label)) {
                return i;
            }
        }
        return -1;
    }
}


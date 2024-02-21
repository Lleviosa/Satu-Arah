package GUI.Dashboard;

import Menu.PanduanForm;
import Menu.RuteForm;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.Color;
import javax.swing.UIManager;

public class Dashboard extends javax.swing.JFrame {
    Color closeClickedColor, defaultCloseColor, clickedColor, defaultColor;

    public Dashboard() {
        initComponents();
        defaultCloseColor = new Color(0, 0, 0);
        closeClickedColor = new Color(255,0,0);
        clickedColor = new Color(204,153,0);
        defaultColor = new Color(255,215,0);
        
        menu1Panel.setBackground(defaultColor);
        menu2Panel.setBackground(defaultColor);
        menu3Panel.setBackground(defaultColor);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logoLabel = new javax.swing.JLabel();
        titleLabel = new javax.swing.JLabel();
        closePanel = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        satuArahLabel1 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        menu1Panel = new javax.swing.JPanel();
        menu2Panel = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        menu3Panel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        whitePanel = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 0, 0));
        jPanel1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel1MouseClicked(evt);
            }
        });
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/Dashboard/traffic_black_24dp 1.png"))); // NOI18N
        logoLabel.setText(" nne");
        jPanel1.add(logoLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 110, 120));

        titleLabel.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        titleLabel.setForeground(new java.awt.Color(255, 255, 255));
        titleLabel.setText("Dashboard");
        jPanel1.add(titleLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 40, -1, -1));

        closePanel.setBackground(new java.awt.Color(0, 0, 0));
        closePanel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                closePanelMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                closePanelMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                closePanelMouseExited(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                closePanelMouseEntered(evt);
            }
        });
        closePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("X");
        closePanel.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 0, -1, -1));

        jPanel1.add(closePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(1340, 0, 40, 40));

        satuArahLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        satuArahLabel1.setForeground(new java.awt.Color(255, 255, 255));
        satuArahLabel1.setText("SatuArah");
        jPanel1.add(satuArahLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 40, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1380, -1));

        jPanel2.setBackground(new java.awt.Color(255, 215, 0));
        jPanel2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jPanel2MouseClicked(evt);
            }
        });

        menu1Panel.setBackground(new java.awt.Color(255, 215, 0));
        menu1Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu1PanelMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu1PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu1PanelMouseEntered(evt);
            }
        });

        menu2Panel.setBackground(new java.awt.Color(255, 215, 0));
        menu2Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu2PanelMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu2PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu2PanelMouseEntered(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/gps_50px.png"))); // NOI18N
        jLabel3.setText("Rute");

        javax.swing.GroupLayout menu2PanelLayout = new javax.swing.GroupLayout(menu2Panel);
        menu2Panel.setLayout(menu2PanelLayout);
        menu2PanelLayout.setHorizontalGroup(
            menu2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        menu2PanelLayout.setVerticalGroup(
            menu2PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout menu1PanelLayout = new javax.swing.GroupLayout(menu1Panel);
        menu1Panel.setLayout(menu1PanelLayout);
        menu1PanelLayout.setHorizontalGroup(
            menu1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, menu1PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(menu2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        menu1PanelLayout.setVerticalGroup(
            menu1PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menu1PanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(menu2Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        menu3Panel.setBackground(new java.awt.Color(255, 215, 0));
        menu3Panel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                menu3PanelMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                menu3PanelMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                menu3PanelMouseEntered(evt);
            }
        });

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/GUI/book_50px.png"))); // NOI18N
        jLabel4.setText("Panduan");

        javax.swing.GroupLayout menu3PanelLayout = new javax.swing.GroupLayout(menu3Panel);
        menu3Panel.setLayout(menu3PanelLayout);
        menu3PanelLayout.setHorizontalGroup(
            menu3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
        );
        menu3PanelLayout.setVerticalGroup(
            menu3PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(menu3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(menu1Panel, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addComponent(menu3Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 120, 160, 640));

        whitePanel.setBackground(new java.awt.Color(255, 255, 255));
        whitePanel.setPreferredSize(new java.awt.Dimension(1181, 684));

        javax.swing.GroupLayout whitePanelLayout = new javax.swing.GroupLayout(whitePanel);
        whitePanel.setLayout(whitePanelLayout);
        whitePanelLayout.setHorizontalGroup(
            whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1220, Short.MAX_VALUE)
        );
        whitePanelLayout.setVerticalGroup(
            whitePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 640, Short.MAX_VALUE)
        );

        getContentPane().add(whitePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 120, 1220, 640));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closePanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePanelMousePressed
        closePanel.setBackground(closeClickedColor);
    }//GEN-LAST:event_closePanelMousePressed

    private void closePanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePanelMouseClicked
        closePanel.setBackground(closeClickedColor);
        System.exit(0);
    }//GEN-LAST:event_closePanelMouseClicked

    private void closePanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePanelMouseEntered
        closePanel.setBackground(closeClickedColor);
    }//GEN-LAST:event_closePanelMouseEntered

    private void closePanelMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_closePanelMouseExited
        closePanel.setBackground(defaultCloseColor);
    }//GEN-LAST:event_closePanelMouseExited

    private void menu1PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1PanelMouseClicked
        
    }//GEN-LAST:event_menu1PanelMouseClicked

    private void menu1PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1PanelMouseEntered
        menu1Panel.setBackground(clickedColor);
        menu2Panel.setBackground(defaultColor);
        menu3Panel.setBackground(defaultColor);
    }//GEN-LAST:event_menu1PanelMouseEntered

    private void menu1PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu1PanelMousePressed
        menu1Panel.setBackground(clickedColor);
        menu2Panel.setBackground(defaultColor);
        menu3Panel.setBackground(defaultColor);
    }//GEN-LAST:event_menu1PanelMousePressed

    private void menu2PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2PanelMouseClicked
        menu1Panel.setBackground(defaultColor);
        menu2Panel.setBackground(clickedColor);
        menu3Panel.setBackground(defaultColor);
        RuteForm menu1 = new RuteForm();
        whitePanel.removeAll();
        whitePanel.add(menu1).setVisible(true);
        titleLabel.setText("Rekomendasi");
    }//GEN-LAST:event_menu2PanelMouseClicked

    private void menu2PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2PanelMouseEntered
        menu1Panel.setBackground(defaultColor);
        menu2Panel.setBackground(clickedColor);
        menu3Panel.setBackground(defaultColor);
    }//GEN-LAST:event_menu2PanelMouseEntered

    private void menu2PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu2PanelMousePressed
        menu1Panel.setBackground(defaultColor);
        menu2Panel.setBackground(clickedColor);
        menu3Panel.setBackground(defaultColor);
    }//GEN-LAST:event_menu2PanelMousePressed

    private void menu3PanelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3PanelMouseClicked
        menu1Panel.setBackground(defaultColor);
        menu2Panel.setBackground(defaultColor);
        menu3Panel.setBackground(clickedColor);
        PanduanForm menu1 = new PanduanForm();
        whitePanel.removeAll();
        whitePanel.add(menu1).setVisible(true);
        titleLabel.setText("Panduan");
    }//GEN-LAST:event_menu3PanelMouseClicked

    private void menu3PanelMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3PanelMouseEntered
        menu1Panel.setBackground(defaultColor);
        menu2Panel.setBackground(defaultColor);
        menu3Panel.setBackground(clickedColor);
    }//GEN-LAST:event_menu3PanelMouseEntered

    private void menu3PanelMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_menu3PanelMousePressed
        menu1Panel.setBackground(defaultColor);
        menu2Panel.setBackground(defaultColor);
        menu3Panel.setBackground(clickedColor);
    }//GEN-LAST:event_menu3PanelMousePressed

    private void jPanel2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel2MouseClicked
        titleLabel.setText("Dashboard");
        menu1Panel.setBackground(defaultColor);
        menu2Panel.setBackground(defaultColor);
        menu3Panel.setBackground(defaultColor);
    }//GEN-LAST:event_jPanel2MouseClicked

    private void jPanel1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jPanel1MouseClicked
        titleLabel.setText("Dashboard");
        menu1Panel.setBackground(defaultColor);
        menu2Panel.setBackground(defaultColor);
        menu3Panel.setBackground(defaultColor);
    }//GEN-LAST:event_jPanel1MouseClicked


    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel(new FlatLightLaf());
        } catch (Exception ex) {
            System.err.println("Failed to initialize LaF");
        }
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel closePanel;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel logoLabel;
    private javax.swing.JPanel menu1Panel;
    private javax.swing.JPanel menu2Panel;
    private javax.swing.JPanel menu3Panel;
    private javax.swing.JLabel satuArahLabel1;
    private javax.swing.JLabel titleLabel;
    private javax.swing.JPanel whitePanel;
    // End of variables declaration//GEN-END:variables
}

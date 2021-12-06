
public class DashboardFrame extends javax.swing.JFrame {

    /**
     * Creates new form DashboardFrame
     */
    public DashboardFrame() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jMakeOrderButton = new javax.swing.JButton();
        jViewOrdersButton = new javax.swing.JButton();
        jViewProductsButton = new javax.swing.JButton();
        jLogoutButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(25, 25, 25));
        jPanel1.setPreferredSize(new java.awt.Dimension(319, 220));

        jMakeOrderButton.setBackground(new java.awt.Color(25, 25, 25));
        jMakeOrderButton.setForeground(new java.awt.Color(255, 255, 255));
        jMakeOrderButton.setText("Make Order");
        jMakeOrderButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMakeOrderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMakeOrderButtonActionPerformed(evt);
            }
        });

        jViewOrdersButton.setBackground(new java.awt.Color(25, 25, 25));
        jViewOrdersButton.setForeground(new java.awt.Color(255, 255, 255));
        jViewOrdersButton.setText("View Orders");
        jViewOrdersButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jViewOrdersButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewOrdersButtonActionPerformed(evt);
            }
        });

        jViewProductsButton.setBackground(new java.awt.Color(25, 25, 25));
        jViewProductsButton.setForeground(new java.awt.Color(255, 255, 255));
        jViewProductsButton.setText("View Products");
        jViewProductsButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jViewProductsButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jViewProductsButtonActionPerformed(evt);
            }
        });

        jLogoutButton.setBackground(new java.awt.Color(25, 25, 25));
        jLogoutButton.setForeground(new java.awt.Color(255, 255, 255));
        jLogoutButton.setText("Logout");
        jLogoutButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLogoutButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jLogoutButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jViewProductsButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jMakeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jViewOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jMakeOrderButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jViewOrdersButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jViewProductsButton, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLogoutButton, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(39, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMakeOrderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMakeOrderButtonActionPerformed
        this.setVisible(false);
        MakeOrderFrame m = new MakeOrderFrame();
        m.setVisible(true);
    }//GEN-LAST:event_jMakeOrderButtonActionPerformed

    private void jLogoutButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jLogoutButtonActionPerformed
        this.setVisible(false);
        AdminLoginFrame f = new AdminLoginFrame();
        f.setVisible(true);
    }//GEN-LAST:event_jLogoutButtonActionPerformed

    private void jViewProductsButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewProductsButtonActionPerformed
        this.setVisible(false);
        ProductsFrame p = new ProductsFrame();
        p.setVisible(true);
    }//GEN-LAST:event_jViewProductsButtonActionPerformed

    private void jViewOrdersButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jViewOrdersButtonActionPerformed
        this.setVisible(false);
        OrdersFrame o = new OrdersFrame();
        o.setVisible(true);
    }//GEN-LAST:event_jViewOrdersButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DashboardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DashboardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DashboardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DashboardFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DashboardFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jLogoutButton;
    private javax.swing.JButton jMakeOrderButton;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jViewOrdersButton;
    private javax.swing.JButton jViewProductsButton;
    // End of variables declaration//GEN-END:variables
}

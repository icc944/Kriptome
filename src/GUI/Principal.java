package GUI;

/**

 * @author Issac
 */
public class Principal extends javax.swing.JFrame {

    /**
     * Creates new form Principal
     */
    public Principal() {
        setTitle("Kriptome");
        initComponents();

        pw_password.addActionListener(e->btn_ingress.doClick());
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_A = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        lbl_input = new javax.swing.JLabel();
        pw_password = new javax.swing.JPasswordField();
        btn_ingress = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel_A.setBackground(new java.awt.Color(153, 153, 153));

        lbl_title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_title.setText("Welcome");

        lbl_author.setFont(new java.awt.Font("Segoe UI", 0, 8)); // NOI18N
        lbl_author.setText("By ICC");

        lbl_input.setText("Secret Key:");

        pw_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pw_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pw_passwordActionPerformed(evt);
            }
        });

        btn_ingress.setText("Ingress");
        btn_ingress.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ingressActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout JPanel_ALayout = new javax.swing.GroupLayout(JPanel_A);
        JPanel_A.setLayout(JPanel_ALayout);
        JPanel_ALayout.setHorizontalGroup(
            JPanel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ALayout.createSequentialGroup()
                .addGroup(JPanel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ALayout.createSequentialGroup()
                        .addGap(77, 77, 77)
                        .addComponent(btn_ingress, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_ALayout.createSequentialGroup()
                        .addGap(86, 86, 86)
                        .addComponent(lbl_title))
                    .addGroup(JPanel_ALayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(pw_password, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(JPanel_ALayout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lbl_input))
                    .addGroup(JPanel_ALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_author)))
                .addGap(248, 248, 248))
        );
        JPanel_ALayout.setVerticalGroup(
            JPanel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ALayout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addComponent(lbl_input)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pw_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(7, 7, 7)
                .addComponent(btn_ingress)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addComponent(lbl_author))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_A, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_A, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pw_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pw_passwordActionPerformed
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_pw_passwordActionPerformed

    private void btn_ingressActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ingressActionPerformed
        // TODO add your handling code here:
        System.out.println(pw_password.getPassword());
    }//GEN-LAST:event_btn_ingressActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel JPanel_A;
    private javax.swing.JButton btn_ingress;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_input;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPasswordField pw_password;
    // End of variables declaration//GEN-END:variables
}

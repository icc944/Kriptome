package GUI;
public class Ingress extends javax.swing.JFrame {

    public Ingress() {
        setTitle("Kriptome");
        final String srecret_key_str;
        initComponents();
        pw_password.addActionListener(e->btn_ingress.doClick());
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        IngressPanel = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        lbl_input = new javax.swing.JLabel();
        pw_password = new javax.swing.JPasswordField();
        btn_ingress = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        IngressPanel.setBackground(new java.awt.Color(153, 153, 153));

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

        javax.swing.GroupLayout IngressPanelLayout = new javax.swing.GroupLayout(IngressPanel);
        IngressPanel.setLayout(IngressPanelLayout);
        IngressPanelLayout.setHorizontalGroup(
            IngressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngressPanelLayout.createSequentialGroup()
                .addGroup(IngressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(IngressPanelLayout.createSequentialGroup()
                        .addGroup(IngressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(IngressPanelLayout.createSequentialGroup()
                                .addGap(77, 77, 77)
                                .addComponent(btn_ingress, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(IngressPanelLayout.createSequentialGroup()
                                .addGap(86, 86, 86)
                                .addComponent(lbl_title))
                            .addGroup(IngressPanelLayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(pw_password, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(IngressPanelLayout.createSequentialGroup()
                                .addGap(95, 95, 95)
                                .addComponent(lbl_input)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(IngressPanelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_author)))
                .addGap(248, 248, 248))
        );
        IngressPanelLayout.setVerticalGroup(
            IngressPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(IngressPanelLayout.createSequentialGroup()
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
            .addComponent(IngressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(IngressPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel IngressPanel;
    private javax.swing.JButton btn_ingress;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_input;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPasswordField pw_password;
    // End of variables declaration//GEN-END:variables
}

package GUI;
import OwnerScripts.*;
import javax.swing.JFileChooser;

public class Principal extends javax.swing.JFrame {
    public Principal() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JPanel_A = new javax.swing.JPanel();
        lbl_title = new javax.swing.JLabel();
        lbl_author = new javax.swing.JLabel();
        lbl_input = new javax.swing.JLabel();
        pw_password = new javax.swing.JPasswordField();
        btn_next = new javax.swing.JButton();
        btn_fileChooser = new javax.swing.JButton();
        lbl_filename = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        JPanel_A.setBackground(new java.awt.Color(0, 0, 0));

        lbl_title.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lbl_title.setForeground(new java.awt.Color(255, 255, 255));
        lbl_title.setText("Welcome to KryptoMe");

        lbl_author.setForeground(new java.awt.Color(200, 200, 200));
        lbl_author.setText("By ICC");

        lbl_input.setForeground(new java.awt.Color(255, 255, 255));
        lbl_input.setText("Secret Key:");

        pw_password.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        pw_password.addInputMethodListener(new java.awt.event.InputMethodListener() {
            public void caretPositionChanged(java.awt.event.InputMethodEvent evt) {
            }
            public void inputMethodTextChanged(java.awt.event.InputMethodEvent evt) {
                pw_passwordInputMethodTextChanged(evt);
            }
        });
        pw_password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pw_passwordActionPerformed(evt);
            }
        });
        pw_password.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                pw_passwordKeyPressed(evt);
            }
        });

        btn_next.setBackground(new java.awt.Color(32, 32, 32));
        btn_next.setForeground(new java.awt.Color(255, 255, 255));
        btn_next.setText("OPEN");
        btn_next.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btn_next.setEnabled(false);
        btn_next.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_nextActionPerformed(evt);
            }
        });

        btn_fileChooser.setBackground(new java.awt.Color(32, 32, 32));
        btn_fileChooser.setForeground(new java.awt.Color(255, 255, 255));
        btn_fileChooser.setText("Choose File");
        btn_fileChooser.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(102, 102, 102)));
        btn_fileChooser.setEnabled(false);
        btn_fileChooser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_fileChooserActionPerformed(evt);
            }
        });

        lbl_filename.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout JPanel_ALayout = new javax.swing.GroupLayout(JPanel_A);
        JPanel_A.setLayout(JPanel_ALayout);
        JPanel_ALayout.setHorizontalGroup(
            JPanel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ALayout.createSequentialGroup()
                .addGroup(JPanel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(JPanel_ALayout.createSequentialGroup()
                        .addGroup(JPanel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(JPanel_ALayout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(lbl_title))
                            .addGroup(JPanel_ALayout.createSequentialGroup()
                                .addGap(114, 114, 114)
                                .addComponent(lbl_input))
                            .addGroup(JPanel_ALayout.createSequentialGroup()
                                .addGap(42, 42, 42)
                                .addComponent(pw_password, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btn_fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 27, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ALayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(lbl_author)))
                .addContainerGap())
            .addGroup(JPanel_ALayout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, JPanel_ALayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_filename, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104))
        );
        JPanel_ALayout.setVerticalGroup(
            JPanel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(JPanel_ALayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lbl_title)
                .addGap(18, 18, 18)
                .addComponent(lbl_input)
                .addGap(12, 12, 12)
                .addGroup(JPanel_ALayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(pw_password, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_fileChooser, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_filename, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(btn_next, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lbl_author)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_A, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(JPanel_A, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pw_passwordInputMethodTextChanged(java.awt.event.InputMethodEvent evt) {//GEN-FIRST:event_pw_passwordInputMethodTextChanged

    }//GEN-LAST:event_pw_passwordInputMethodTextChanged

    private void pw_passwordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pw_passwordActionPerformed
        // TODO add your handling code here:
        this.requestFocusInWindow();
    }//GEN-LAST:event_pw_passwordActionPerformed

    private void pw_passwordKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_pw_passwordKeyPressed
        if (pw_password.getPassword().length >= 10){
            btn_fileChooser.setEnabled(true);
        }else{
            btn_fileChooser.setEnabled(false);
        }
    }//GEN-LAST:event_pw_passwordKeyPressed

    private void btn_nextActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_nextActionPerformed
        System.out.println(Globals.file_name);
        String secret_key_str = new String(pw_password.getPassword());
        //new Management(secret_key_str).setVisible(true);
        //this.dispose();
    }//GEN-LAST:event_btn_nextActionPerformed

    private void btn_fileChooserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_fileChooserActionPerformed
        btn_next.setEnabled(true);

        Globals.fileChooser.setFileFilter(new javax.swing.filechooser.FileNameExtensionFilter("Archivos de texto (*.json)", "json"));
        int seleccion = Globals.fileChooser.showOpenDialog(null);
        if (seleccion == JFileChooser.APPROVE_OPTION) {
            java.io.File json_file = Globals.fileChooser.getSelectedFile();
            lbl_filename.setText(json_file.getName());

        }
    }//GEN-LAST:event_btn_fileChooserActionPerformed

    public static void main(String args[]) {
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
    private javax.swing.JButton btn_fileChooser;
    private javax.swing.JButton btn_next;
    private javax.swing.JLabel lbl_author;
    private javax.swing.JLabel lbl_filename;
    private javax.swing.JLabel lbl_input;
    private javax.swing.JLabel lbl_title;
    private javax.swing.JPasswordField pw_password;
    // End of variables declaration//GEN-END:variables
}

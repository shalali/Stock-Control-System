/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stock;

/**
 *
 * @author Milu
 */
public class LoginMain extends javax.swing.JFrame {

    /**
     * Creates new form LoginMain
     */
    public LoginMain() {
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
        java.awt.GridBagConstraints gridBagConstraints;

        pnlTop5 = new javax.swing.JPanel();
        pnlTop12 = new javax.swing.JPanel();
        pnlTop15 = new javax.swing.JPanel();
        pnlTop16 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        txtUserID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnLogin = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        txtUserIDSignUp = new javax.swing.JTextField();
        txtNewPass = new javax.swing.JPasswordField();
        txtNewPassAgain = new javax.swing.JPasswordField();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        btnSignUp = new javax.swing.JButton();
        txtName = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel14 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setExtendedState(6);
        setLocationByPlatform(true);
        getContentPane().setLayout(new java.awt.GridBagLayout());

        pnlTop5.setBackground(new java.awt.Color(204, 255, 204));
        pnlTop5.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTop12.setBackground(new java.awt.Color(153, 204, 0));
        pnlTop12.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlTop5.add(pnlTop12, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 401, 190, 10));

        pnlTop15.setBackground(new java.awt.Color(153, 204, 0));
        pnlTop15.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        pnlTop16.setBackground(new java.awt.Color(153, 204, 0));
        pnlTop16.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        pnlTop15.add(pnlTop16, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 430, 190, 10));

        pnlTop5.add(pnlTop15, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 231, 140, 10));

        jLabel6.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel6.setText("Username");
        pnlTop5.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 30, 110, 20));

        txtUserID.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        pnlTop5.add(txtUserID, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, 159, 30));

        jLabel4.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel4.setText("Password");
        pnlTop5.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, 100, 20));

        btnLogin.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        btnLogin.setText("Login");
        btnLogin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnLogin.setBorderPainted(false);
        pnlTop5.add(btnLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 110, 160, 30));
        pnlTop5.add(txtPassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 70, 160, 30));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 1;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 180;
        gridBagConstraints.ipady = -251;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(8, 313, 0, 330);
        getContentPane().add(pnlTop5, gridBagConstraints);

        jLabel10.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel10.setText("Login to Shop");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = 46;
        gridBagConstraints.ipady = 10;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 710, 0, 0);
        getContentPane().add(jLabel10, gridBagConstraints);

        jPanel1.setBackground(new java.awt.Color(153, 255, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txtUserIDSignUp.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        txtUserIDSignUp.setForeground(new java.awt.Color(0, 204, 102));
        txtUserIDSignUp.setToolTipText("");
        jPanel1.add(txtUserIDSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 101, 160, 30));

        txtNewPass.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jPanel1.add(txtNewPass, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 141, 160, 30));

        txtNewPassAgain.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jPanel1.add(txtNewPassAgain, new org.netbeans.lib.awtextra.AbsoluteConstraints(412, 181, 160, 30));

        jLabel11.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel11.setText("Password");
        jPanel1.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 151, 110, 20));

        jLabel8.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel8.setText("Re-enter Password");
        jPanel1.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(192, 191, 190, 20));

        btnSignUp.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        btnSignUp.setText("Sign Up");
        btnSignUp.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnSignUp.setBorderPainted(false);
        btnSignUp.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSignUpActionPerformed(evt);
            }
        });
        jPanel1.add(btnSignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(422, 241, 150, -1));

        txtName.setFont(new java.awt.Font("Calibri", 3, 18)); // NOI18N
        jPanel1.add(txtName, new org.netbeans.lib.awtextra.AbsoluteConstraints(414, 62, 160, 30));

        jLabel16.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel16.setText("Name");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(314, 72, 80, 20));

        jLabel9.setFont(new java.awt.Font("Calibri", 0, 24)); // NOI18N
        jLabel9.setText("Username");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(282, 111, 110, 20));

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 4;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.ipadx = 176;
        gridBagConstraints.ipady = 43;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 313, 104, 330);
        getContentPane().add(jPanel1, gridBagConstraints);
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 2;
        gridBagConstraints.ipadx = 748;
        gridBagConstraints.ipady = 30;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(20, 313, 0, 0);
        getContentPane().add(jSeparator1, gridBagConstraints);

        jLabel14.setFont(new java.awt.Font("Calibri", 2, 18)); // NOI18N
        jLabel14.setText("Please sign up if you are not a member");
        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 2;
        gridBagConstraints.gridwidth = 3;
        gridBagConstraints.gridheight = 2;
        gridBagConstraints.ipadx = 470;
        gridBagConstraints.ipady = -3;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(40, 313, 0, 330);
        getContentPane().add(jLabel14, gridBagConstraints);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSignUpActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSignUpActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnSignUpActionPerformed

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
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginMain.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginMain().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnLogin;
    public javax.swing.JButton btnSignUp;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    public javax.swing.JPanel pnlTop12;
    public javax.swing.JPanel pnlTop15;
    public javax.swing.JPanel pnlTop16;
    public javax.swing.JPanel pnlTop5;
    public javax.swing.JTextField txtName;
    public javax.swing.JPasswordField txtNewPass;
    public javax.swing.JPasswordField txtNewPassAgain;
    public javax.swing.JPasswordField txtPassword;
    public javax.swing.JTextField txtUserID;
    public javax.swing.JTextField txtUserIDSignUp;
    // End of variables declaration//GEN-END:variables
}

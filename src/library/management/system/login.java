
package library.management.system;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class login extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(login.class.getName());

    private final int studentId;

    public login(int studentId) {
        initComponents();
        this.studentId = studentId;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuserid = new javax.swing.JTextField();
        txtpassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        btnregistration = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close icon.png"))); // NOI18N
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 50, 49));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 140, 40));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Password");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 420, 120, 40));

        txtuserid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtuserid.addActionListener(this::txtuseridActionPerformed);
        getContentPane().add(txtuserid, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 360, 190, 30));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 420, 190, 30));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Login");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 230, 130, 70));

        jButton2.setBackground(new java.awt.Color(204, 0, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Login now");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 510, 140, 50));

        btnregistration.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnregistration.setForeground(new java.awt.Color(255, 0, 0));
        btnregistration.setText("New Registration");
        btnregistration.setBorderPainted(false);
        btnregistration.setContentAreaFilled(false);
        btnregistration.setFocusPainted(false);
        btnregistration.addActionListener(this::btnregistrationActionPerformed);
        getContentPane().add(btnregistration, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 640, -1, 30));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Don't have an account ?");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 620, -1, -1));

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/login page.jpg"))); // NOI18N
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(-40, 0, 1320, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        String username = txtuserid.getText().trim();
        String password = new String(txtpassword.getPassword());

        if (username.equals("") || password.equals("")) {

            JOptionPane.showMessageDialog( this,
                    "Please enter username and password");
            return;
        }
        try {
            Connection con = Connect.Connection();
            PreparedStatement pat = con.prepareStatement
        ( "SELECT * FROM users WHERE username = ? AND password = ?" );

            pat.setString(1, username);
            pat.setString(2, password);

            ResultSet rs = pat.executeQuery();

            if (rs.next()) {
                String role = rs.getString("role");

                if (role.equalsIgnoreCase("ADMIN")) {

                    JOptionPane.showMessageDialog(this, 
                            "Admin Login Successful");

                    new Home(studentId).setVisible(true);
                    this.dispose();

                } else if (role.equalsIgnoreCase("STUDENT")) {

                    JOptionPane.showMessageDialog( this, 
                            "Student Login Successful" );

        String studentId = rs.getString("id");
        new studentdashboard(Integer.parseInt(studentId)).setVisible(true);
        this.dispose();
              }

            } else {

                JOptionPane.showMessageDialog( this,
                        "Invalid username or password" );
            }

            rs.close();
            pat.close();
            con.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog(this, "Login Error: " );
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void txtuseridActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuseridActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuseridActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int yes = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close this application", "Exit", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);

        if (yes == JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnregistrationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnregistrationActionPerformed
        StudentRegistration registration = new StudentRegistration();
        registration.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btnregistrationActionPerformed

    public static void main(String args[]) {
     
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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(() -> new login(1).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnregistration;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtuserid;
    // End of variables declaration//GEN-END:variables
}

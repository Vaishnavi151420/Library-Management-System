
package library.management.system;

import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.*;

public class StudentRegistration extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
  java.util.logging.Logger.getLogger(StudentRegistration.class.getName());

    public StudentRegistration() {
        initComponents();
    }

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnclose = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtsem = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        btnsave = new javax.swing.JButton();
        txtbranch = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close icon.png"))); // NOI18N
        btnclose.addActionListener(this::btncloseActionPerformed);
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 50, 50));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/studentregicon.png"))); // NOI18N
        jLabel1.setText("  Student Registration");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 50, 540, 120));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Student Name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, -1, 36));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Student Id");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 240, 107, 36));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Branch");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 390, 107, 36));

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel7.setText("Course");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 340, 107, 36));

        txtid.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtid.addActionListener(this::txtidActionPerformed);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 240, 210, 30));

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtname.addActionListener(this::txtnameActionPerformed);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 290, 210, 30));

        txtsem.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtsem.addActionListener(this::txtsemActionPerformed);
        getContentPane().add(txtsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 440, 210, 30));

        txtcourse.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtcourse.addActionListener(this::txtcourseActionPerformed);
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 340, 210, 30));

        btnsave.setBackground(new java.awt.Color(255, 102, 102));
        btnsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsave.setForeground(new java.awt.Color(255, 255, 255));
        btnsave.setText("Save");
        btnsave.addActionListener(this::btnsaveActionPerformed);
        getContentPane().add(btnsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 560, 100, 41));

        txtbranch.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtbranch.addActionListener(this::txtbranchActionPerformed);
        getContentPane().add(txtbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 390, 210, 30));

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel8.setText("Semester");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 440, 107, 36));

        jLabel9.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel9.setText("Password");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 500, 107, 36));

        txtpassword.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtpassword, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 500, 210, 36));

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/loginbg.png"))); // NOI18N
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-20, -10, 1300, 750));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        login l = new login(0);
        l.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_btncloseActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtidActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtsemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsemActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtsemActionPerformed

    private void txtcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcourseActionPerformed

    private void btnsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsaveActionPerformed

        if (txtid.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Student ID is required");
            txtid.requestFocus();

        } else if (txtname.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Student Name is required");
            txtname.requestFocus();

        } else if (txtcourse.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Course is required");
            txtcourse.requestFocus();

        } else if (txtbranch.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Branch is required");
            txtbranch.requestFocus();

        } else if (txtsem.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, "Semester is required");
            txtsem.requestFocus();

        } else if (txtpassword.getPassword().length == 0) {
            JOptionPane.showMessageDialog(this, "Password is required");
            txtpassword.requestFocus();

        } else {

            try {
                int studentId;
                try {

                    studentId = Integer.parseInt(txtid.getText().trim());
                } catch (NumberFormatException e) {
                    JOptionPane.showMessageDialog(this,
                            "Student ID must contain numbers only");

                    txtid.requestFocus();
                    return;
                }
                Connection con = Connect.Connection();
                
                PreparedStatement pat = con.prepareStatement(
                        "INSERT INTO student "
                        + "(id, name, course, branch, semester) "
                        + "VALUES (?, ?, ?, ?, ?)");

              
                pat.setInt(1, studentId);
                pat.setString( 2,txtname.getText().trim());
                pat.setString(3,txtcourse.getText().trim());
                pat.setString( 4,txtbranch.getText().trim());
                pat.setString(5,txtsem.getText().trim());

                pat.executeUpdate();

                PreparedStatement userPat = con.prepareStatement(
                        "INSERT INTO users "
                        + "(id, username, password, role) "
                        + "VALUES (?, ?, ?, ?)");

                userPat.setInt( 1, studentId );              
                userPat.setString(2,txtname.getText().trim());
                userPat.setString(3,new String(txtpassword.getPassword()));
                userPat.setString( 4, "STUDENT" );
                userPat.executeUpdate();

                JOptionPane.showMessageDialog(this,"Registration Successful!");
            
                txtid.setText("");
                txtname.setText("");
                txtcourse.setText("");
                txtbranch.setText("");
                txtsem.setText("");
                txtpassword.setText("");
                
                pat.close();
                userPat.close();
                con.close();

                login l = new login(studentId);
                l.setVisible(true);

                this.dispose();

            } catch (SQLException ex) {

                JOptionPane.showMessageDialog(
                        this,
                        "Registration Error: "
                );
            }
        }
    }//GEN-LAST:event_btnsaveActionPerformed

    private void txtbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbranchActionPerformed

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

        java.awt.EventQueue.invokeLater(() -> 
                new StudentRegistration().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JButton btnsave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtbranch;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JPasswordField txtpassword;
    private javax.swing.JTextField txtsem;
    // End of variables declaration//GEN-END:variables
}

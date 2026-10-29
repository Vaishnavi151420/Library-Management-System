package library.management.system;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class NewStudent extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(NewStudent.class.getName());
    public NewStudent() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtid = new javax.swing.JTextField();
        txtname = new javax.swing.JTextField();
        txtcourse = new javax.swing.JTextField();
        txtbranch = new javax.swing.JTextField();
        txtsem = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/newstudenticon.jpg"))); // NOI18N
        jLabel1.setText("  Add New Student Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 60, 630, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Student Id");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 270, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Student name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 320, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Semester");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 470, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Course");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 370, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Branch");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 420, -1, -1));

        txtid.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtid.addActionListener(this::txtidActionPerformed);
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 270, 200, -1));

        txtname.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtname.addActionListener(this::txtnameActionPerformed);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 320, 200, -1));

        txtcourse.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtcourse.addActionListener(this::txtcourseActionPerformed);
        getContentPane().add(txtcourse, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 370, 200, -1));

        txtbranch.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtbranch.addActionListener(this::txtbranchActionPerformed);
        getContentPane().add(txtbranch, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 420, 200, -1));

        txtsem.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        getContentPane().add(txtsem, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 200, -1));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close icon.png"))); // NOI18N
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(880, 0, 50, 50));

        jButton2.setBackground(new java.awt.Color(255, 102, 102));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setText("Save");
        jButton2.addActionListener(this::jButton2ActionPerformed);
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 530, 100, 40));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-160, -10, 1090, 790));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtbranchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtbranchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtbranchActionPerformed

    private void txtcourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcourseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcourseActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        if (txtid.getText().trim().equals("")) {
             JOptionPane.showMessageDialog(this, "Student ID is required");
            txtid.requestFocus();

        } else if (txtname.getText().trim().equals("")) {
         JOptionPane.showMessageDialog(this,"Student Name is required");
            txtname.requestFocus();

        } else if (txtcourse.getText().trim().equals("")) {
              JOptionPane.showMessageDialog( this, "Course is required");
            txtcourse.requestFocus();

        } else if (txtbranch.getText().trim().equals("")) {
              JOptionPane.showMessageDialog(this,"Branch is required");
            txtbranch.requestFocus();

        } else if (txtsem.getText().trim().equals("")) {
              JOptionPane.showMessageDialog( this,"Semester is required");
            txtsem.requestFocus();
        } else {

            try {
                int studentId = Integer.parseInt(
                        txtid.getText().trim());

                Connection con = Connect.Connection();
                String studentSql
                        = "INSERT INTO student "
                        + "(id, name, course, branch, semester) "
                        + "VALUES (?, ?, ?, ?, ?)";

                PreparedStatement studentPat
                        = con.prepareStatement(studentSql);

                studentPat.setInt(1, studentId);
                studentPat.setString(2, txtname.getText().trim());
                studentPat.setString(3, txtcourse.getText().trim());
                studentPat.setString(4, txtbranch.getText().trim());
                studentPat.setString(5, txtsem.getText().trim());

                studentPat.executeUpdate();

                String userSql
                        = "INSERT INTO users "
                        + "(id, username, password, role) "
                        + "VALUES (?, ?, ?, ?)";

                PreparedStatement userPat
                        = con.prepareStatement(userSql);

                userPat.setInt(1, studentId);
                userPat.setString(2, txtname.getText().trim());
                userPat.setString(3, "1234");
                 userPat.setString(4, "STUDENT");
                userPat.executeUpdate();

                JOptionPane.showMessageDialog( this,
                        """
                        Student Added Successfully!
                        Username: """ + txtname.getText().trim()
                        + "\nPassword: 1234");

                txtid.setText("");
                txtname.setText("");
                txtcourse.setText("");
                txtbranch.setText("");
                txtsem.setText("");

                studentPat.close();
                userPat.close();
                con.close();

       } catch (NumberFormatException ex) {
           JOptionPane.showMessageDialog(this,
                   "Student ID must contain numbers only");

            txtid.requestFocus();

       } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this,
                    "Student Registration Error: ");
            }}
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtidActionPerformed

    }//GEN-LAST:event_txtidActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new NewStudent().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtbranch;
    private javax.swing.JTextField txtcourse;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtsem;
    // End of variables declaration//GEN-END:variables
}

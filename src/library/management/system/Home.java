package library.management.system;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;

public class Home extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger = 
            java.util.logging.Logger.getLogger(Home.class.getName());
    private final int studentId;

    public Home(int studentId) {
        this.studentId = studentId;
        initComponents();
        loadDashboardData();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lblTotalStudents = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        lblTotalBooks = new javax.swing.JLabel();
        btnnewStudent = new javax.swing.JButton();
        btndetails = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close icon.png"))); // NOI18N
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1230, 0, 50, 50));

        jButton3.setBackground(new java.awt.Color(102, 204, 255));
        jButton3.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton3.setText("Add Book");
        jButton3.addActionListener(this::jButton3ActionPerformed);
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 220, 210, 50));

        jButton4.setBackground(new java.awt.Color(102, 204, 255));
        jButton4.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton4.setText("Issue Book");
        jButton4.addActionListener(this::jButton4ActionPerformed);
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 320, 210, 50));

        jButton5.setBackground(new java.awt.Color(102, 204, 255));
        jButton5.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        jButton5.setText("Return Book");
        jButton5.addActionListener(this::jButton5ActionPerformed);
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 410, 210, 50));

        jButton6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/log out icon.jpg"))); // NOI18N
        jButton6.addActionListener(this::jButton6ActionPerformed);
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 570, 110, 100));

        jPanel1.setBackground(new java.awt.Color(153, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("No of Students");
        jPanel1.add(jLabel2);

        lblTotalStudents.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalStudents.setText("0");
        jPanel1.add(lblTotalStudents);

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 30, 130, 82));

        jPanel2.setBackground(new java.awt.Color(102, 255, 255));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Total Books");
        jPanel2.add(jLabel4);

        lblTotalBooks.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblTotalBooks.setText("0");
        jPanel2.add(lblTotalBooks);

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 30, 110, 82));

        btnnewStudent.setBackground(new java.awt.Color(102, 204, 255));
        btnnewStudent.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnnewStudent.setText("Add New Student");
        btnnewStudent.addActionListener(this::btnnewStudentActionPerformed);
        getContentPane().add(btnnewStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 130, 210, 50));

        btndetails.setBackground(new java.awt.Color(102, 204, 255));
        btndetails.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btndetails.setText("Details");
        btndetails.addActionListener(this::btndetailsActionPerformed);
        getContentPane().add(btndetails, new org.netbeans.lib.awtextra.AbsoluteConstraints(960, 500, 210, 50));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/home page.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 740));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    private void loadDashboardData() {
        try {

            Connection con = Connect.Connection();
            PreparedStatement studentPat = con.prepareStatement(
                    "SELECT COUNT(*) FROM student");

            ResultSet studentRs = studentPat.executeQuery();
            if (studentRs.next()) {
                int totalStudents = studentRs.getInt(1);
                lblTotalStudents.setText(String.valueOf(totalStudents));
            }

            PreparedStatement bookPat = con.prepareStatement(
                    "SELECT COUNT(*) FROM book");

            ResultSet bookRs = bookPat.executeQuery();

            if (bookRs.next()) {
                int totalBooks = bookRs.getInt(1);
                lblTotalBooks.setText(String.valueOf(totalBooks));}
           
            studentRs.close();
            studentPat.close();

            bookRs.close();
            bookPat.close();
            con.close();

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( this,
                    "Dashboard Error: "
            );}}
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        new AddBook().setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed


    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        new IssueBook().setVisible(true);
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        int yes = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to Logout from this application", 
                "Logout", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (yes == JOptionPane.YES_OPTION) {
            new login(studentId).setVisible(true);
        }
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        new ReturnBook().setVisible(true);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        int yes = JOptionPane.showConfirmDialog(this,
                "Are you sure you want to close this application", 
                "Exit", JOptionPane.YES_NO_OPTION, 
                JOptionPane.QUESTION_MESSAGE);

        if (yes == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnnewStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnnewStudentActionPerformed
        new NewStudent().setVisible(true);
    }//GEN-LAST:event_btnnewStudentActionPerformed

    private void btndetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndetailsActionPerformed
        new Details().setVisible(true);
    }//GEN-LAST:event_btndetailsActionPerformed

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

        java.awt.EventQueue.invokeLater(() -> new Home(1).setVisible(true));
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndetails;
    private javax.swing.JButton btnnewStudent;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel lblTotalBooks;
    private javax.swing.JLabel lblTotalStudents;
    // End of variables declaration//GEN-END:variables
}

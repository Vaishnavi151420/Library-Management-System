package library.management.system;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;

public class IssueBook extends javax.swing.JFrame {
    Connection con = Connect.Connection();
    PreparedStatement pat = null;
    ResultSet rs = null;

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(IssueBook.class.getName());
    public IssueBook() {
        initComponents();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Date d = new Date();
        txtissuedate.setText(sdf.format(d));
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jlabel2 = new javax.swing.JLabel();
        jlabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtbookid = new javax.swing.JTextField();
        txtstudentid = new javax.swing.JTextField();
        txtbookname = new javax.swing.JTextField();
        txtissuedate = new javax.swing.JTextField();
        txtduedate = new javax.swing.JTextField();
        txtissue = new javax.swing.JButton();
        btnsearch = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/issuelogo.png"))); // NOI18N
        jLabel1.setText("    Issue Book");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 30, 545, 160));

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close icon.png"))); // NOI18N
        jButton1.addActionListener(this::jButton1ActionPerformed);
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 50, 50));

        jlabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabel2.setText("Book Id");
        getContentPane().add(jlabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 230, -1, -1));

        jlabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jlabel3.setText("Student Id");
        getContentPane().add(jlabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Book Name");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 350, -1, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Issue Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 410, -1, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Due Date");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 470, -1, -1));

        txtbookid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtbookid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 230, 220, 30));

        txtstudentid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtstudentid, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 290, 220, 30));

        txtbookname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtbookname, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 220, 30));

        txtissuedate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtissuedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 410, 220, 30));

        txtduedate.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtduedate, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 470, 220, 30));

        txtissue.setBackground(new java.awt.Color(255, 102, 102));
        txtissue.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtissue.setForeground(new java.awt.Color(255, 255, 255));
        txtissue.setText("Issue");
        txtissue.addActionListener(this::txtissueActionPerformed);
        getContentPane().add(txtissue, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 550, 100, 42));

        btnsearch.setBackground(new java.awt.Color(255, 102, 102));
        btnsearch.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btnsearch.setForeground(new java.awt.Color(255, 255, 255));
        btnsearch.setText("Search");
        btnsearch.addActionListener(this::btnsearchActionPerformed);
        getContentPane().add(btnsearch, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 230, 111, -1));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-120, -30, 1070, 770));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtissueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtissueActionPerformed
        if (txtbookid.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this, 
                    "Please enter Book ID and search it");
            txtbookid.requestFocus();
            return;
        }

        if (txtstudentid.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Please enter Student ID");
            txtstudentid.requestFocus();
            return;
        }

        if (txtduedate.getText().trim().equals("")) {
            JOptionPane.showMessageDialog(this,
                    "Please enter Due Date");
            txtduedate.requestFocus();
            return;
        }

  try {
  pat = con.prepareStatement(
 "UPDATE book SET status=?, issuedate=?, duedate=?, studentid=? WHERE id=?");

            pat.setString(1, "ISSUED");
            pat.setString(2, txtissuedate.getText());
            pat.setString(3, txtduedate.getText());
            pat.setString(4, txtstudentid.getText());
            pat.setString(5, txtbookid.getText());

       int updated = pat.executeUpdate();

        if (updated > 0) {
         JOptionPane.showMessageDialog(this, "Book Issued Successfully");

                txtbookid.setText("");
                txtbookname.setText("");
                txtstudentid.setText("");
                txtissuedate.setText("");
                txtduedate.setText("");
            } else {
                JOptionPane.showMessageDialog(this, "Book ID not found");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog( this, "Issue Error: ");}
    }//GEN-LAST:event_txtissueActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void btnsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnsearchActionPerformed

        if (txtbookid.getText().trim().equals("")) {
         JOptionPane.showMessageDialog( this, 
                 "Please enter Book ID and search it" );
            txtbookid.requestFocus();
            return;
        }

        try {
            pat = con.prepareStatement("SELECT * FROM book WHERE id=?" );
            pat.setString(1, txtbookid.getText());
            rs = pat.executeQuery();

            if (rs.next()) {
                txtbookname.setText(rs.getString("name"));
                String status = rs.getString("status");
                
         if ("ISSUED".equalsIgnoreCase(status)) {
         JOptionPane.showMessageDialog( this,"This book is already issued.");
                    txtissue.setEnabled(false);
                } else {
                    txtissue.setEnabled(true);
                }

            } else {
                JOptionPane.showMessageDialog( this, "Book ID not found" );
                txtbookname.setText("");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(this, 
                    "Search Error: " + ex.getMessage());
        }
    }//GEN-LAST:event_btnsearchActionPerformed

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
        java.awt.EventQueue.invokeLater(() -> new IssueBook().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnsearch;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jlabel2;
    private javax.swing.JLabel jlabel3;
    private javax.swing.JTextField txtbookid;
    private javax.swing.JTextField txtbookname;
    private javax.swing.JTextField txtduedate;
    private javax.swing.JButton txtissue;
    private javax.swing.JTextField txtissuedate;
    private javax.swing.JTextField txtstudentid;
    // End of variables declaration//GEN-END:variables
}

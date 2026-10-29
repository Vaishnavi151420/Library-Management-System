package library.management.system;
import java.sql.Connection;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Myissuedbooks extends javax.swing.JFrame {
    
    private static final java.util.logging.Logger logger = 
            java.util.logging.Logger.getLogger(Myissuedbooks.class.getName());
    private final int studentId;

    public Myissuedbooks(int studentId) {
            initComponents();  
        this.studentId = studentId;
         loadIssuedBooks();
    }
    private void loadIssuedBooks() {

        DefaultTableModel model
                = (DefaultTableModel) tblissuedbooks.getModel();
        model.setRowCount(0);

        try {

            Connection con = Connect.Connection();
            String sql
                    = "SELECT id, name, publisher, issuedate, duedate, status "
                    + "FROM book "
                    + "WHERE studentid=? AND status='ISSUED'";
            PreparedStatement pat = con.prepareStatement(sql);

            pat.setString(1, String.valueOf(studentId));
            ResultSet rs = pat.executeQuery();

            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("id"),
                    rs.getString("name"),
                    rs.getString("publisher"),
                    rs.getString("issuedate"),
                    rs.getString("duedate"),
                    rs.getString("status")
                });
            }

            rs.close();
            pat.close();
            con.close();

        } catch (SQLException ex) {

            JOptionPane.showMessageDialog( this,
                    "Error loading issued books: ");}
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnclose = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblissuedbooks = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/issuelogo.png"))); // NOI18N
        jLabel1.setText("My Issued Books");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(37, 51, 508, -1));

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close icon.png"))); // NOI18N
        btnclose.addActionListener(this::btncloseActionPerformed);
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(904, 0, 45, 48));

        tblissuedbooks.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "BookId", "Bookname", "Publisher", "Issue date", "Due date", "Status"
            }
        ));
        tblissuedbooks.setAlignmentX(1.0F);
        tblissuedbooks.setAlignmentY(1.0F);
        tblissuedbooks.setRowHeight(30);
        tblissuedbooks.setShowHorizontalLines(true);
        jScrollPane1.setViewportView(tblissuedbooks);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 220, 776, 340));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-130, 0, 1080, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
       dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
        } catch (ReflectiveOperationException | javax.swing.UnsupportedLookAndFeelException ex) {
            logger.log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> new Myissuedbooks(0).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblissuedbooks;
    // End of variables declaration//GEN-END:variables
}

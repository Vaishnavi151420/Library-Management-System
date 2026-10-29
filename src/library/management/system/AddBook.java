package library.management.system;
import javax.swing.JOptionPane;
import java.sql.*;

public class AddBook extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(AddBook.class.getName());
    public AddBook() {
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
        txtpublisher = new javax.swing.JTextField();
        txtprice = new javax.swing.JTextField();
        txtyear = new javax.swing.JTextField();
        txtsave = new javax.swing.JButton();
        btnclose = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI", 3, 36)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/bookicon.png"))); // NOI18N
        jLabel1.setText("  Add Book Details");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 50, 467, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel2.setText("Book ID");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 230, -1, -1));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel3.setText("Book name");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 290, -1, -1));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel4.setText("Publisher");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 350, -1, 24));

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel5.setText("Price");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 410, 65, 24));

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel6.setText("Publisher Year");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 470, -1, -1));

        txtid.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtid, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 230, 220, 30));

        txtname.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtname.addActionListener(this::txtnameActionPerformed);
        getContentPane().add(txtname, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 290, 220, 30));

        txtpublisher.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtpublisher, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 350, 220, 30));

        txtprice.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        getContentPane().add(txtprice, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 410, 220, 30));

        txtyear.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtyear.addActionListener(this::txtyearActionPerformed);
        getContentPane().add(txtyear, new org.netbeans.lib.awtextra.AbsoluteConstraints(480, 470, 220, 30));

        txtsave.setBackground(new java.awt.Color(255, 102, 102));
        txtsave.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        txtsave.setForeground(new java.awt.Color(255, 255, 255));
        txtsave.setText("Save");
        txtsave.addActionListener(this::txtsaveActionPerformed);
        getContentPane().add(txtsave, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 550, 100, 40));

        btnclose.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/close icon.png"))); // NOI18N
        btnclose.addActionListener(this::btncloseActionPerformed);
        getContentPane().add(btnclose, new org.netbeans.lib.awtextra.AbsoluteConstraints(900, 0, 50, 50));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/All Page Backgraound.jpg"))); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(-180, -50, 1130, 810));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtyearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtyearActionPerformed

    }//GEN-LAST:event_txtyearActionPerformed

    private void txtnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnameActionPerformed

    private void txtsaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsaveActionPerformed
        if (txtid.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            txtid.requestFocus();
        } else if (txtname.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            txtname.requestFocus();
        } else if (txtpublisher.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            txtpublisher.requestFocus();
        } else if (txtprice.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            txtprice.requestFocus();
        } else if (txtyear.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "All fields are required");
            txtyear.requestFocus();
        } else {

            try {
                Connection con = Connect.Connection();
                PreparedStatement pat = con.prepareStatement(
                          "INSERT INTO Book" + 
                        " (id ,name,publisher,price,year,status)"+
                        " values(?,?,?,?,?,?)");
                
                pat.setString(1, txtid.getText());
                pat.setString(2, txtname.getText());
                pat.setString(3, txtpublisher.getText());
                pat.setString(4, txtprice.getText());
                pat.setString(5, txtyear.getText());
                pat.setString(6,"NOT-ISSUED");
                pat.executeUpdate();

                JOptionPane.showMessageDialog(this, "Record Saved");

                txtid.setText("");
                txtname.setText("");
                txtpublisher.setText("");
                txtprice.setText("");
                txtyear.setText("");
            } catch (SQLException ex) {
                System.getLogger(AddBook.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }}
    }//GEN-LAST:event_txtsaveActionPerformed

    private void btncloseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btncloseActionPerformed
        dispose();
    }//GEN-LAST:event_btncloseActionPerformed

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
        //</editor-fold> /
        java.awt.EventQueue.invokeLater(() -> 
                new AddBook().setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnclose;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtid;
    private javax.swing.JTextField txtname;
    private javax.swing.JTextField txtprice;
    private javax.swing.JTextField txtpublisher;
    private javax.swing.JButton txtsave;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}

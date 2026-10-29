
package library.management.system;

public class L2 extends javax.swing.JFrame {

    private static final java.util.logging.Logger logger =
            java.util.logging.Logger.getLogger(L2.class.getName());

    private final int studentId;

    public L2(int studentId) {

        this.studentId = studentId;

        initComponents();

        Thread t = new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i = 1; i <= 100; i++) {
                    try {
                        jProgressBar1.setValue(i);
                        Thread.sleep(50);
                        if(jProgressBar1.getString().equals("100%"))
                            new login(studentId).setVisible(true);
                        if(jProgressBar1.getString().equals("50%")){
                            lbl.setText("Loading Modules.....");
                            
                        }
                        if(jProgressBar1.getString().equals("25%")){
                           lbl.setText("Connecting Database....");
                            //jLabel1.setForeground(Color.WHITE);
                            }
                        if(jProgressBar1.getString().equals("95%"))
                            lbl.setText("Launching Aplication....");
                    } catch (InterruptedException ex){
                    }
                }
            }
        });

        t.start();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jProgressBar1 = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        lbl = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jProgressBar1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 450, 720, 30));

        jPanel1.setBackground(new java.awt.Color(0, 153, 0));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jPanel1.add(lbl, new org.netbeans.lib.awtextra.AbsoluteConstraints(520, 410, 170, 40));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/Picsart_23-10-30_17-47-04-022.jpg"))); // NOI18N
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 630, 400));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 720, 450));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

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

        java.awt.EventQueue.invokeLater(() -> new L2(3).setVisible(true));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JProgressBar jProgressBar1;
    private javax.swing.JLabel lbl;
    // End of variables declaration//GEN-END:variables
}

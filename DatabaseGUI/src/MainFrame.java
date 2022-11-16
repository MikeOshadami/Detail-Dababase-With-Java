
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Lenovo
 */
public class MainFrame extends javax.swing.JFrame {

    private void connect() {
        String hostname = "localhost";
        String sqlInstanceName = "LAPTOP-43HAT1M2"; //computer name 
        String sqlDatabase = "University";  //sql server database name
        String sqlUser = "123";
        String sqlPassword = "123"; //passwrod sa account
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        //jdbc:sqlserver://localhost:1433;instance=COMPUTERBERRY;databaseName=Database;
        String connectURL = "jdbc:sqlserver://" + hostname + ":1433"
                + ";instance=" + sqlInstanceName + ";databaseName=" + sqlDatabase + ";encrypt=true;trustServerCertificate=true";

        try {
            Connection conn = DriverManager.getConnection(connectURL, sqlUser, sqlPassword);
        } catch (SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
        System.out.println("Connect to database successful!!");
    }

    /**
     * Creates new form MainFrame
     */
    public MainFrame() {
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

        btnCabang = new javax.swing.JButton();
        btnPembeli = new javax.swing.JButton();
        btnPesanan = new javax.swing.JButton();
        btnMenu = new javax.swing.JButton();
        btnKasir = new javax.swing.JButton();
        btnPembayaran = new javax.swing.JButton();
        btnPesananMenu = new javax.swing.JButton();
        btnPengantar = new javax.swing.JButton();
        btnKeranjangBelanja = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnCabang.setText("Cabang");
        btnCabang.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCabangActionPerformed(evt);
            }
        });

        btnPembeli.setText("Pembeli");
        btnPembeli.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembeliActionPerformed(evt);
            }
        });

        btnPesanan.setText("Pesanan");
        btnPesanan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesananActionPerformed(evt);
            }
        });

        btnMenu.setText("Menu");
        btnMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMenuActionPerformed(evt);
            }
        });

        btnKasir.setText("Kasir");
        btnKasir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnKasirActionPerformed(evt);
            }
        });

        btnPembayaran.setText("Pembayaran");
        btnPembayaran.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPembayaranActionPerformed(evt);
            }
        });

        btnPesananMenu.setText("Pesanan Menu");
        btnPesananMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesananMenuActionPerformed(evt);
            }
        });

        btnPengantar.setText("Pengantar");
        btnPengantar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPengantarActionPerformed(evt);
            }
        });

        btnKeranjangBelanja.setText("Keranjang Belanja");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnPesananMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnCabang, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnPembeli, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnKasir, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPengantar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(btnKeranjangBelanja, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnPembayaran, javax.swing.GroupLayout.Alignment.LEADING))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(btnPesanan, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(43, 43, 43))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(84, 84, 84)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPembeli)
                    .addComponent(btnCabang)
                    .addComponent(btnPesanan))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnKasir)
                    .addComponent(btnMenu)
                    .addComponent(btnPembayaran))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPengantar)
                    .addComponent(btnPesananMenu)
                    .addComponent(btnKeranjangBelanja))
                .addContainerGap(124, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCabangActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCabangActionPerformed
        try {
            CabangFrame konek = new CabangFrame();
            konek.setVisible(true);
            konek.tampilkanData();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CabangFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnCabangActionPerformed

    private void btnPembeliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembeliActionPerformed
        PembeliFrame konek = new PembeliFrame();
        konek.setVisible(true);
        try {
            konek.tampilkanData();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(MainFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnPembeliActionPerformed

    private void btnMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMenuActionPerformed
        try {
            MenuFrame konek = new MenuFrame();
            konek.setVisible(true);
            konek.tampilkanData();
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CabangFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_btnMenuActionPerformed

    private void btnKasirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnKasirActionPerformed
        try {
            KasirFrame konek = new KasirFrame();
            konek.setVisible(true);
            konek.tampilkanData();
//                    Date date = konek.DateChooserTglLahir.getDate();
//                    java.sql.Date sqlDate = new java.sql.Date(date.getTime());
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(CabangFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnKasirActionPerformed

    private void btnPesananMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesananMenuActionPerformed

    }//GEN-LAST:event_btnPesananMenuActionPerformed

    private void btnPengantarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPengantarActionPerformed

    }//GEN-LAST:event_btnPengantarActionPerformed

    private void btnPembayaranActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPembayaranActionPerformed
//        PembayaranFrame frame1 = new PembayaranFrame();
//        frame1.setVisible(true);
//        this.dispose();
    }//GEN-LAST:event_btnPembayaranActionPerformed

    private void btnPesananActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesananActionPerformed
        PesananFrame frame1 = new PesananFrame();
        frame1.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnPesananActionPerformed

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
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                MainFrame frameUtama = new MainFrame();
                frameUtama.setVisible(true);

            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCabang;
    private javax.swing.JButton btnKasir;
    private javax.swing.JButton btnKeranjangBelanja;
    private javax.swing.JButton btnMenu;
    private javax.swing.JButton btnPembayaran;
    private javax.swing.JButton btnPembeli;
    private javax.swing.JButton btnPengantar;
    private javax.swing.JButton btnPesanan;
    private javax.swing.JButton btnPesananMenu;
    // End of variables declaration//GEN-END:variables
}

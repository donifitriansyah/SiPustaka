/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package Menu;

import java.awt.event.KeyEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Doni Fitriansyah
 */
public class KelolaDataPenerbit extends javax.swing.JDialog {

    boolean modeSimpan;
    boolean dataDitemukan;
    boolean namaDitemukan;
    boolean situsDitemukan;
    DefaultTableModel model;
    Connection koneksi;
    Statement perintah;
    ResultSet rs;

    /**
     * Creates new form KelolaDatapenerbit
     */
    public KelolaDataPenerbit(java.awt.Frame parent, boolean modal) {
        super(parent, modal);

        initComponents();
        model = (DefaultTableModel) tblData.getModel();
        modeSimpan = true;
        dataDitemukan = false;
        namaDitemukan = false;
        situsDitemukan = false;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost/sipustaka";
            String user = "root";
            String password = "";
            koneksi = DriverManager.getConnection(url, user, password);
            perintah = koneksi.createStatement();
        } catch (ClassNotFoundException e) {
            System.err.println("JDBC Driver tidak ditemukan");
        } catch (SQLException e) {
            System.err.println("Gagal koneksi atau menciptakan objek statement");
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        dateChooser1 = new com.raven.datechooser.DateChooser();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnBatal = new javax.swing.JButton();
        btnUbah = new javax.swing.JButton();
        txtSearch = new javax.swing.JTextField();
        btnBaru = new javax.swing.JButton();
        btnSimpan = new javax.swing.JButton();
        btnHapus = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtID = new javax.swing.JTextField();
        txtNama = new javax.swing.JTextField();
        txtSitus = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();

        dateChooser1.setDateFormat("yyyy-MM-dd");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Menu Petugas");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setIconImage(null);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(255, 204, 0));
        jPanel1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel1.setForeground(new java.awt.Color(255, 204, 0));

        jLabel1.setFont(new java.awt.Font("Poppins", 1, 24)); // NOI18N
        jLabel1.setText("Kelola Data Penerbit");

        btnBatal.setText("Batal");
        btnBatal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBatalActionPerformed(evt);
            }
        });

        btnUbah.setText("Ubah");
        btnUbah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUbahActionPerformed(evt);
            }
        });

        txtSearch.setText("Search");
        txtSearch.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txtSearchMouseClicked(evt);
            }
        });
        txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSearchKeyTyped(evt);
            }
        });

        btnBaru.setText("Baru");
        btnBaru.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBaruActionPerformed(evt);
            }
        });

        btnSimpan.setText("Simpan");
        btnSimpan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSimpanActionPerformed(evt);
            }
        });

        btnHapus.setText("Hapus");
        btnHapus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHapusActionPerformed(evt);
            }
        });

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Penerbit", "Nama Penerbit", "Situs Penerbit"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblData.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblDataMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblData);

        jLabel2.setText("Kode Penerbit");

        jLabel3.setText("Nama Penerbit");

        jLabel4.setText("Situs Penerbit");

        txtID.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txtIDKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtIDKeyTyped(evt);
            }
        });

        txtNama.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtNamaKeyTyped(evt);
            }
        });

        txtSitus.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtSitusKeyTyped(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI", 3, 12)); // NOI18N
        jLabel9.setText(" \"Tekan tombol Enter untuk melanjutkan.\"");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(31, 31, 31)
                        .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel1)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel9))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNama)
                                    .addComponent(txtSitus, javax.swing.GroupLayout.PREFERRED_SIZE, 331, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 896, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(31, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtNama, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtSitus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3)
                        .addGap(21, 21, 21)
                        .addComponent(jLabel4)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 37, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaru, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSimpan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHapus, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBatal, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnUbah, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSimpanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSimpanActionPerformed
        namaDitemukan = cariNamaPenerbit(txtNama.getText());
        situsDitemukan = cariSitusPenerbit(txtSitus.getText());
        if (txtNama.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan lengkapi data nama penerbit!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            txtNama.requestFocus();
        } else if (txtSitus.getText().equals("")) {
            JOptionPane.showMessageDialog(this, "Silahkan lengkapi data situs penerbit!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
            txtSitus.requestFocus();
        } else {
            if (modeSimpan) {
                dataDitemukan = cariData(txtID.getText());
                if (dataDitemukan) {
                    JOptionPane.showMessageDialog(this, "Data gagal ditambahkan, " + "karena kode penerbit " + txtID.getText() + " telah ada di tabel", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                } else if (namaDitemukan) {
                    JOptionPane.showMessageDialog(this, "Data gagal ditambahkan, " + "karena nama penerbit " + txtNama.getText() + " telah digunakan", "Informasi", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (situsDitemukan) {
                    JOptionPane.showMessageDialog(this, "Data gagal ditambahkan, " + "karena situs penerbit " + txtSitus.getText() + " telah digunakan", "Informasi", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    try {

                        perintah.execute("INSERT INTO penerbit VALUES('"
                                + txtID.getText() + "','"
                                + txtNama.getText() + "','"
                                + txtSitus.getText() + "')"
                        );
                        JOptionPane.showMessageDialog(this, "Data berhasil ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        tampilData();
                    } catch (SQLException e) {
                        JOptionPane.showMessageDialog(this, "Data gagal ditambahkan", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        e.printStackTrace();

                    }
                }
            } else { // mode update
                if ((tblData.getSelectedRow() == -1) && (dataDitemukan == false)) {
                    JOptionPane.showMessageDialog(this, "Silahkan pilih baris yang akan diubah!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                } else if (namaDitemukan) {
                    JOptionPane.showMessageDialog(this, "Data gagal diupdate, " + "karena nama penerbit " + txtNama.getText() + " telah digunakan", "Informasi", JOptionPane.ERROR_MESSAGE);
                    return;
                } else if (situsDitemukan) {
                    JOptionPane.showMessageDialog(this, "Data gagal diupdate, " + "karena situs penerbit " + txtSitus.getText() + " telah digunakan", "Informasi", JOptionPane.ERROR_MESSAGE);
                    return;
                } else {
                    try {
                        perintah.execute("UPDATE penerbit SET "
                                + "nama_penerbit = '" + txtNama.getText() + "', "
                                + "situs = '" + txtSitus.getText() + "' "
                                + "WHERE kode_penerbit = '" + txtID.getText() + "'");
                        JOptionPane.showMessageDialog(this, "Data berhasil diubah", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                        tampilData();
                    } catch (SQLException e) {
                        System.err.println("Query Error");
                        e.printStackTrace();

                    }
                }
            }

            bersihData();
            txtID.setEnabled(false);
            txtNama.setEnabled(false);
            txtSitus.setEnabled(false);
            btnBaru.requestFocus();
            btnBaru.setEnabled(true);
            btnSimpan.setEnabled(false);
            btnUbah.setEnabled(false);
            btnHapus.setEnabled(false);
            btnBatal.setEnabled(false);
        }
    }//GEN-LAST:event_btnSimpanActionPerformed

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        bersihData();
        tampilData();
        txtID.setEnabled(false);
        txtNama.setEnabled(false);
        txtSitus.setEnabled(false);
        btnBaru.setEnabled(true);
        btnBaru.requestFocus();
        btnSimpan.setEnabled(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBatal.setEnabled(false);
    }//GEN-LAST:event_formWindowOpened

    private void txtIDKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyReleased

        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            if (txtID.getText().trim().isEmpty()) {
                JOptionPane.showMessageDialog(this, "Silahkan isi kode penerbit terlebih dahulu!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                txtID.requestFocus();
                return;
            }
            dataDitemukan = cariData(txtID.getText());
            if (dataDitemukan == true) {
                int pilihan;
                pilihan = JOptionPane.showConfirmDialog(this, "Kode penerbit " + txtID.getText() + " sudah ada! " + "Apakah anda ingin mengubah/menghapus data ?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
                if (pilihan == 0) {
                    try {
                        txtNama.setText(rs.getString("nama_penerbit"));
                        txtSitus.setText(rs.getString("situs"));
                        txtID.setEnabled(false);
                        txtNama.setEnabled(false);
                        txtSitus.setEnabled(false);
                        btnBaru.setEnabled(false);
                        btnSimpan.setEnabled(false);
                        btnHapus.setEnabled(false);
                        btnUbah.requestFocus();
                        btnUbah.setEnabled(true);
                        btnBatal.setEnabled(true);
                    } catch (SQLException e) {
                        System.err.println("Query Error");
                        e.printStackTrace();
                    }
                } else {
                    txtID.setText("");
                    txtID.requestFocus();
                }
            } else {
                txtID.setEnabled(false);
                txtNama.setEnabled(true);
                txtSitus.setEnabled(true);
                txtNama.requestFocus();
                btnSimpan.setEnabled(true);
                btnBatal.setEnabled(true);
            }
        }
    }//GEN-LAST:event_txtIDKeyReleased

    private void btnBaruActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBaruActionPerformed
        bersihData();
        txtID.setEnabled(true);
        txtID.requestFocus();
        txtNama.setEnabled(false);
        txtSitus.setEnabled(false);
        btnSimpan.setEnabled(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBaru.setEnabled(false);
        btnBatal.setEnabled(true);
        modeSimpan = true;
    }//GEN-LAST:event_btnBaruActionPerformed

    private void btnBatalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBatalActionPerformed
        // TODO add your handling code here:
        bersihData();
        txtID.setEnabled(false);
        txtNama.setEnabled(false);
        txtSitus.setEnabled(false);
        btnBaru.requestFocus();
        btnBaru.setEnabled(true);
        btnSimpan.setEnabled(false);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBatal.setEnabled(false);

    }//GEN-LAST:event_btnBatalActionPerformed

    private void txtNamaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtNamaKeyTyped
        char c = evt.getKeyChar();
        if (!(Character.isLetter(c) || c == KeyEvent.VK_SPACE)) {
            evt.consume();
        }
    }//GEN-LAST:event_txtNamaKeyTyped

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        if (tblData.getSelectedRow() >= 0) {
            txtID.setText(model.getValueAt(tblData.getSelectedRow(), 0).toString());
            txtNama.setText(model.getValueAt(tblData.getSelectedRow(), 1).toString());
            txtSitus.setText(model.getValueAt(tblData.getSelectedRow(), 2).toString());

            btnBaru.setEnabled(false);
            btnSimpan.setEnabled(false);
            btnUbah.setEnabled(true);
            btnHapus.setEnabled(true);
            btnUbah.requestFocus();
            btnBatal.setEnabled(true);
        }
    }//GEN-LAST:event_tblDataMouseClicked

    private void btnUbahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUbahActionPerformed
        txtID.setEnabled(false);
        txtNama.setEnabled(true);
        txtSitus.setEnabled(true);
        txtNama.requestFocus();
        btnBaru.setEnabled(false);
        btnSimpan.setEnabled(true);
        btnUbah.setEnabled(false);
        btnHapus.setEnabled(false);
        btnBatal.setEnabled(true);

        modeSimpan = false;
    }//GEN-LAST:event_btnUbahActionPerformed

    private void txtIDKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtIDKeyTyped
        if (txtID.getText().length() >= 10) {
            evt.consume();
        }
    }//GEN-LAST:event_txtIDKeyTyped

    private void btnHapusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHapusActionPerformed
        if ((tblData.getSelectedRow() == -1) && (dataDitemukan == false)) {
            JOptionPane.showMessageDialog(this, "Silahkan pilih baris data yang akan dihapus!", "Informasi", JOptionPane.INFORMATION_MESSAGE);
        } else {
            int pilihan;
            pilihan = JOptionPane.showConfirmDialog(this, "Apakah anda yakin akan menghapus data?", "Konfirmasi", JOptionPane.YES_NO_OPTION);
            if (pilihan == 0) {
                try {
                    perintah.execute("DELETE FROM penerbit " + "WHERE kode_penerbit = '" + txtID.getText() + "'");
                    JOptionPane.showMessageDialog(this, "Data berhasil dihapus", "Informasi", JOptionPane.INFORMATION_MESSAGE);
                    tampilData();
                } catch (SQLException e) {
                    JOptionPane.showMessageDialog(this, "Data Gagal Dihapus karena terhubung dengan data lain", "Informasi", JOptionPane.ERROR_MESSAGE);
                }
                bersihData();
                btnBaru.requestFocus();
                btnBaru.setEnabled(true);
                btnSimpan.setEnabled(false);
                btnUbah.setEnabled(false);
                btnHapus.setEnabled(false);
                btnBatal.setEnabled(false);

            }
        }
    }//GEN-LAST:event_btnHapusActionPerformed

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        String keyword = txtSearch.getText();

        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        try {
            String sql = "SELECT * FROM penerbit WHERE kode_penerbit LIKE ? OR nama_penerbit LIKE ? OR situs LIKE ? ";
            try (PreparedStatement st = koneksi.prepareStatement(sql)) {
                st.setString(1, "%" + keyword + "%");
                st.setString(2, "%" + keyword + "%");
                st.setString(3, "%" + keyword + "%");
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("kode_penerbit"),
                        rs.getString("nama_penerbit"),
                        rs.getString("situs"),});
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void txtSitusKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSitusKeyTyped
        if (txtSitus.getText().length() >= 45) {
            evt.consume();
        }
    }//GEN-LAST:event_txtSitusKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaru;
    private javax.swing.JButton btnBatal;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnSimpan;
    private javax.swing.JButton btnUbah;
    private com.raven.datechooser.DateChooser dateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtID;
    private javax.swing.JTextField txtNama;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtSitus;
    // End of variables declaration//GEN-END:variables

    private void bersihData() {
        txtID.setText("");
        txtNama.setText("");
        txtSitus.setText("");
    }

    private void tampilData() {
        try {
            rs = perintah.executeQuery("SELECT * FROM penerbit");
            model.setRowCount(0);
            model.fireTableDataChanged();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("kode_penerbit"),
                    rs.getString("nama_penerbit"),
                    rs.getString("situs"),});
            }
        } catch (SQLException e) {
            System.err.println("Query Error");
            e.printStackTrace();
        }
    }

    private boolean cariData(String data) {
        if (!txtID.getText().equals("")) {
            try {
                rs = perintah.executeQuery("SELECT * FROM penerbit "
                        + "WHERE kode_penerbit = '" + data + "'");

                if (rs.next()) {
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException e) {
                System.err.println("Query Error");
                e.printStackTrace();
            }
        }
        return false;
    }

    private boolean cariNamaPenerbit(String data) {
        if (!txtNama.getText().equals("")) {
            try {
                rs = perintah.executeQuery("SELECT * FROM penerbit WHERE kode_penerbit!='" + txtID.getText() + "' AND nama_penerbit LIKE BINARY '" + txtNama.getText() + "'");
                if (rs.next()) {
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException e) {
                System.err.println("Query Error");
                e.printStackTrace();
            }
        }
        return false;
    }

    private boolean cariSitusPenerbit(String data) {
        if (!txtNama.getText().equals("")) {
            try {
                rs = perintah.executeQuery("SELECT * FROM penerbit WHERE kode_penerbit!='" + txtID.getText() + "' AND situs LIKE BINARY '" + txtSitus.getText() + "'");
                if (rs.next()) {
                    return true;
                } else {
                    return false;
                }
            } catch (SQLException e) {
                System.err.println("Query Error");
                e.printStackTrace();
            }
        }
        return false;
    }

}

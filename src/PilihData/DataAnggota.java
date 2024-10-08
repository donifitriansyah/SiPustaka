/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package PilihData;

import java.awt.Dialog;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.table.DefaultTableModel;
import java.sql.PreparedStatement;

/**
 *
 * @author Doni Fitriansyah
 */
public class DataAnggota extends javax.swing.JDialog {

    String kodeAnggota;
    String nama;
    String email;
    String telepon;
    String jenisKelamin;
    DefaultTableModel model;
    Connection koneksi;
    Statement perintah;
    ResultSet rs;

    public String getKodeAnggota() {
        return kodeAnggota;
    }

    public String getNama() {
        return nama;
    }

    public String getEmail() {
        return email;
    }

    public String getTelepon() {
        return telepon;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    /**
     * Creates new form DataPenerbit
     */
    public DataAnggota(Dialog parent, boolean modal) {
        super(parent, modal);
        initComponents();
        setLocationRelativeTo(null);
        model = (DefaultTableModel) tblData.getModel();
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

        jLabel1 = new javax.swing.JLabel();
        txtSearch = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblData = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Poppins Medium", 0, 18)); // NOI18N
        jLabel1.setText("Pilih Data Anggota");

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

        jLabel2.setFont(new java.awt.Font("Poppins Medium", 2, 10)); // NOI18N
        jLabel2.setText("*Silahkan klik anggota yang tersedia didalam tabel");

        tblData.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Kode Anggota (NIM)", "Nama", "Email", "Telepon", "Jenis Kelamin", "Tanggal Bergabung"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 957, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtSearchMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txtSearchMouseClicked
        txtSearch.setText("");
    }//GEN-LAST:event_txtSearchMouseClicked

    private void txtSearchKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyTyped
        String keyword = txtSearch.getText();

        DefaultTableModel model = (DefaultTableModel) tblData.getModel();
        model.setRowCount(0);
        try {
            String sql = "SELECT * FROM anggota WHERE kode_anggota LIKE ? OR nama_anggota LIKE ? OR email LIKE ? OR telepon LIKE ? OR jenis_kelamin LIKE ? OR tgl_join LIKE ?";
            try (PreparedStatement st = koneksi.prepareStatement(sql)) {
                st.setString(1, "%" + keyword + "%");
                st.setString(2, "%" + keyword + "%");
                st.setString(3, "%" + keyword + "%");
                st.setString(4, "%" + keyword + "%");
                st.setString(5, "%" + keyword + "%");
                st.setString(6, "%" + keyword + "%");
                ResultSet rs = st.executeQuery();
                while (rs.next()) {
                    model.addRow(new Object[]{
                        rs.getString("kode_anggota"),
                        rs.getString("nama_anggota"),
                        rs.getString("email"),
                        rs.getString("telepon"),
                        rs.getString("jenis_kelamin"),
                        rs.getString("tgl_join")
                    });
                }

            } catch (SQLException e) {
                e.printStackTrace();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }//GEN-LAST:event_txtSearchKeyTyped

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        tampilData();
    }//GEN-LAST:event_formWindowOpened

    private void tblDataMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblDataMouseClicked
        if (tblData.getSelectedRow() >= 0) {
            kodeAnggota = model.getValueAt(tblData.getSelectedRow(), 0).toString();
            nama = model.getValueAt(tblData.getSelectedRow(), 1).toString();
            email = model.getValueAt(tblData.getSelectedRow(), 2).toString();
            telepon = model.getValueAt(tblData.getSelectedRow(), 3).toString();
            jenisKelamin = model.getValueAt(tblData.getSelectedRow(), 4).toString();
            dispose();
        }
    }//GEN-LAST:event_tblDataMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblData;
    private javax.swing.JTextField txtSearch;
    // End of variables declaration//GEN-END:variables

    public void tampilData() {
        try {
            rs = perintah.executeQuery("SELECT * FROM anggota");
            model.setRowCount(0);
            model.fireTableDataChanged();
            while (rs.next()) {
                model.addRow(new Object[]{
                    rs.getString("kode_anggota"),
                    rs.getString("nama_anggota"),
                    rs.getString("email"),
                    rs.getString("telepon"),
                    rs.getString("jenis_kelamin"),
                    rs.getString("tgl_join")
                });
            }
        } catch (SQLException e) {
            System.err.println("Query Error");
            e.printStackTrace();
        }
    }
}

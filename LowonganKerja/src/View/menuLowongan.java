/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package View;

import Model.BerkasLamaran;
import Model.Lowongan;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.util.Date;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ISMA
 */
public class menuLowongan extends javax.swing.JFrame {

    /**
     * Creates new form menuLowongan
     */
    public menuLowongan() {
        initComponents();
    }
    
    public String getNamaLowongan() {
        return namaLowonganfield.getText();
    }

    public String getDeadline() {
        return tgl.getText();
    }

    public JButton getAdd() {
        return btnAdd;
    }

    public void setNamaLowongan(String namaLowongan) {
        this.namaLowonganfield.setText(namaLowongan);
    }
    
    public void addListener(ActionListener e){
        btnAdd.addActionListener(e);
        btnLihat.addActionListener(e);
        btnHapus.addActionListener(e);
        btnLogOut.addActionListener(e);
        btnLogOut1.addActionListener(e);
        btnLogOut2.addActionListener(e);
        btnLogOut3.addActionListener(e);
    }

    public JButton getBtnLihat() {
        return btnLihat;
    }

    public JButton getBtnHapus() {
        return btnHapus;
    }

    public JTable getTblHapus() {
        return tblHapus;
    }
    public JTable getTblPelamar(){
        return tblPelamar;
    }

    public JTable getTblLowongan() {
        return tblLowongan;
    }
    public JButton getBtnLogOut(){
        return btnLogOut2;
    }
    public JButton getBtnLogOut1(){
        return btnLogOut;
    }
    public JButton getBtnLogOut2(){
        return btnLogOut1;
    }
    public JButton getBtnLogOut3(){
        return btnLogOut3;
    }
    public void viewAll2(List<Lowongan> low){
        String[] judul={
            "idLowongan","Nama Lowongan","DeadLine"
        };
        String[][] data=new String[low.size()][3];
        for(int i=0;i<low.size();i++){
            Lowongan l=low.get(i);
            data[i][0]=String.valueOf(l.getIdLowongan());
            data[i][1]=String.valueOf(l.getNama());
            data[i][2]=String.valueOf(l.getDeadline());
        }
        tblHapus.setModel(new DefaultTableModel(data,judul));
    }
    
    public void viewAll3(List<BerkasLamaran> berkas){
        String[] judul={
            "Nama Pelamar","No Hp","Email","Skill","Pengalaman","Pendidikan"
        };
        String[][] data=new String[berkas.size()][6];
        for(int i=0;i<berkas.size();i++){
            BerkasLamaran b=berkas.get(i);
            data[i][0]=String.valueOf(b.getNama());
            data[i][1]=String.valueOf(b.getNoHp());
            data[i][2]=String.valueOf(b.getEmail());
            data[i][3]=String.valueOf(b.getSkill());
            data[i][4]=String.valueOf(b.getPengalaman());
            data[i][5]=String.valueOf(b.getPendidikan());            
        }
        tblPelamar.setModel(new DefaultTableModel(data,judul));
    }
    
    public void viewAll(List<Lowongan> low){
        String[] judul={
            "idLowongan","Nama Lowongan","DeadLine"
        };
        String[][] data=new String[low.size()][3];
        for(int i=0;i<low.size();i++){
            Lowongan l=low.get(i);
            data[i][0]=String.valueOf(l.getIdLowongan());
            data[i][1]=String.valueOf(l.getNama());
            data[i][2]=String.valueOf(l.getDeadline());
        }
        tblLowongan.setModel(new DefaultTableModel(data,judul));
    }
    public int getSelected2(){
        return tblHapus.getSelectedRow();
    }
    public int getSelected(){
        return tblLowongan.getSelectedRow();
    }
    public void addAdapter(MouseAdapter e){
        tblLowongan.addMouseListener(e);
        tblHapus.addMouseListener(e);
        tblPelamar.addMouseListener(e);
    }
    public void setTanggal(String s){
        tgl.setText(s);
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblLowongan = new javax.swing.JTable();
        btnLihat = new javax.swing.JButton();
        btnLogOut = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnHapus = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblHapus = new javax.swing.JTable();
        btnLogOut1 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        namalowongan = new javax.swing.JLabel();
        namaLowonganfield = new javax.swing.JTextField();
        deadline = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        tgl = new javax.swing.JTextField();
        btnLogOut2 = new javax.swing.JButton();
        jPanel4 = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblPelamar = new javax.swing.JTable();
        btnLogOut3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        tblLowongan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tblLowongan);

        btnLihat.setText("Lihat");

        btnLogOut.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut.setText("Log Out");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(74, 74, 74)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 542, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLogOut)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(btnLihat)
                        .addGap(314, 314, 314))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(109, 109, 109)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                .addComponent(btnLihat)
                .addGap(57, 57, 57)
                .addComponent(btnLogOut)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Daftar Lowongan", jPanel2);

        btnHapus.setText("Hapus");

        tblHapus.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(tblHapus);

        btnLogOut1.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut1.setText("Log Out");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut1)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(68, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 559, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(68, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnHapus)
                .addGap(306, 306, 306))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(112, 112, 112)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 151, Short.MAX_VALUE)
                .addComponent(btnHapus)
                .addGap(45, 45, 45)
                .addComponent(btnLogOut1)
                .addGap(25, 25, 25))
        );

        jTabbedPane1.addTab("Hapus Lowongan", jPanel3);

        namalowongan.setText("Nama Lowongan        :");

        namaLowonganfield.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                namaLowonganfieldActionPerformed(evt);
            }
        });

        deadline.setText("Deadline                    :");

        btnAdd.setText("Tambah");
        btnAdd.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAddMouseClicked(evt);
            }
        });

        btnLogOut2.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut2.setText("Log Out");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(namalowongan)
                                .addGap(72, 72, 72))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(deadline)
                                .addGap(74, 74, 74)))
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(namaLowonganfield, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
                            .addComponent(tgl))
                        .addGap(146, 146, 146))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(btnLogOut2)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(220, 220, 220)
                        .addComponent(btnAdd)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(131, 131, 131)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(namaLowonganfield)
                    .addComponent(namalowongan, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(deadline, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tgl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(168, 168, 168)
                .addComponent(btnAdd)
                .addGap(52, 52, 52)
                .addComponent(btnLogOut2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Buat Lowongan", jPanel1);

        tblPelamar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane3.setViewportView(tblPelamar);

        btnLogOut3.setFont(new java.awt.Font("Microsoft YaHei Light", 1, 12)); // NOI18N
        btnLogOut3.setText("Log Out");

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnLogOut3)
                .addContainerGap())
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 641, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(110, 110, 110)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 235, Short.MAX_VALUE)
                .addComponent(btnLogOut3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Pelamar Diterima", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void namaLowonganfieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_namaLowonganfieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_namaLowonganfieldActionPerformed

    private void btnAddMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAddMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnAddMouseClicked

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAdd;
    private javax.swing.JButton btnHapus;
    private javax.swing.JButton btnLihat;
    private javax.swing.JButton btnLogOut;
    private javax.swing.JButton btnLogOut1;
    private javax.swing.JButton btnLogOut2;
    private javax.swing.JButton btnLogOut3;
    private javax.swing.JLabel deadline;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField namaLowonganfield;
    private javax.swing.JLabel namalowongan;
    private javax.swing.JTable tblHapus;
    private javax.swing.JTable tblLowongan;
    private javax.swing.JTable tblPelamar;
    private javax.swing.JTextField tgl;
    // End of variables declaration//GEN-END:variables
}

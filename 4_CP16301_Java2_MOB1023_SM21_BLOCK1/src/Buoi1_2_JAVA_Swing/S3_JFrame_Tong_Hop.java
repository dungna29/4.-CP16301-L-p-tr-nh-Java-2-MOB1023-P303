/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Buoi1_2_JAVA_Swing;

import java.util.Vector;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DungNAPC
 */
public class S3_JFrame_Tong_Hop extends javax.swing.JFrame {
    Vector vtcData = new Vector();
    /**
     * Creates new form S3_JFrame_Tong_Hop
     */
    public S3_JFrame_Tong_Hop() {
        initComponents();
        init();//Đưa init vào contructor của class
        radioButton();
        cbcGioiTinh();
        loadTableSV();
    }
  
    void loadTableSV(){
        //Vector chứa header
        Vector vtcHeader = new Vector();
        vtcHeader.add("Mã Sinh Viên");
        vtcHeader.add("Tên");
        vtcHeader.add("Ngày Sinh");
        vtcHeader.add("Sđt");        
        //Vector chứa data
        Vector vtcRow1 = new Vector();
        vtcRow1.add("PH11555");
        vtcRow1.add("Trang");
        vtcRow1.add("09/11/1990");
        vtcRow1.add("0123");
        vtcData.add(vtcRow1);
        //Đổ dữ liệu vào bảng
        tbl_SinhVien.setModel(new DefaultTableModel(vtcData, vtcHeader));
    }
    void radioButton(){
        //Hành động giúp người dùng chỉ có thể chọn 1 trong 2 radio button
        ButtonGroup buttonGroup = new ButtonGroup();//Gọi ra đối tượng Button Group
        buttonGroup.add(rdb_Nam);
        buttonGroup.add(rdb_Nữ);
    }
    void cbcGioiTinh(){
        DefaultComboBoxModel boxModel = new DefaultComboBoxModel();
        boxModel.addElement("Nam");
        boxModel.addElement("Nữ");
        cbc_GioiTinh.setModel(boxModel);
    }
    
    void init() {
        //Tạo 1 mảng năm sinh từ năm 1600 đến hiện tại 2021 - SỬ dụng vòng lặp để làm đầy dữ liệu
        String[] arrNamSinh = new String[2021 - 1600];
        int year = 1600;
        for (int i = 0; i < 2021 - 1600; i++) {
            arrNamSinh[i] = String.valueOf(year);
            year++;
        }
        //Đổ dữ liệu vào combobox
        cbc_NamSinh.setModel(new DefaultComboBoxModel(arrNamSinh));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txt_ten = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        btn_ok = new javax.swing.JButton();
        lbl_ten = new javax.swing.JLabel();
        cbc_NamSinh = new javax.swing.JComboBox<>();
        rdb_Nam = new javax.swing.JRadioButton();
        rdb_Nữ = new javax.swing.JRadioButton();
        cbc_GioiTinh = new javax.swing.JComboBox<>();
        btn_BamVaoDay = new javax.swing.JButton();
        btn_GoiForm = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_SinhVien = new javax.swing.JTable();
        txt_msv = new javax.swing.JTextField();
        txt_tenFpoly = new javax.swing.JTextField();
        txt_ngaySinh = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        txt_ten.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(193, 13, 139, -1));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Nhập tên: ");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 16, -1, -1));

        btn_ok.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_ok.setText("OK");
        btn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_okActionPerformed(evt);
            }
        });
        getContentPane().add(btn_ok, new org.netbeans.lib.awtextra.AbsoluteConstraints(344, 12, -1, -1));

        lbl_ten.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lbl_ten.setText("123");
        getContentPane().add(lbl_ten, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 67, 219, -1));

        cbc_NamSinh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(cbc_NamSinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(417, 12, -1, -1));

        rdb_Nam.setText("Nam");
        getContentPane().add(rdb_Nam, new org.netbeans.lib.awtextra.AbsoluteConstraints(485, 17, -1, -1));

        rdb_Nữ.setText("Nữ");
        getContentPane().add(rdb_Nữ, new org.netbeans.lib.awtextra.AbsoluteConstraints(534, 17, -1, -1));

        cbc_GioiTinh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(cbc_GioiTinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(579, 11, -1, -1));

        btn_BamVaoDay.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_BamVaoDay.setText("Bấm vào đây");
        btn_BamVaoDay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_BamVaoDayActionPerformed(evt);
            }
        });
        getContentPane().add(btn_BamVaoDay, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 114, -1, -1));

        btn_GoiForm.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        btn_GoiForm.setText("Gọi sang form S2");
        btn_GoiForm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_GoiFormActionPerformed(evt);
            }
        });
        getContentPane().add(btn_GoiForm, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 169, -1, -1));

        tbl_SinhVien.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        tbl_SinhVien.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_SinhVienMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_SinhVien);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(299, 67, -1, -1));

        txt_msv.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt_msv, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 238, 92, -1));

        txt_tenFpoly.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt_tenFpoly, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 291, 92, -1));

        txt_ngaySinh.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt_ngaySinh, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 344, 92, -1));

        txt_sdt.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getContentPane().add(txt_sdt, new org.netbeans.lib.awtextra.AbsoluteConstraints(76, 397, 92, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_okActionPerformed
        String name = txt_ten.getText();//Lấy value do người dùng nhập vào ở text field
        
        int tuoi = 2021 - Integer.parseInt(cbc_NamSinh.getSelectedItem().toString());
        lbl_ten.setText("Chào bạn: " + name + "Tuổi: " + tuoi + " Năm Sinh: " + String.valueOf(cbc_NamSinh.getSelectedItem()));//Gán giá trị name cho label
        txt_ten.setText("");
        
    }//GEN-LAST:event_btn_okActionPerformed

    private void btn_BamVaoDayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_BamVaoDayActionPerformed
        //showMessageDialog hiển thị 1 cái popup thông báo
        //JOptionPane.showMessageDialog(this, "Xin chào các bạn nhé JAVA2");
        //JOptionPane.showConfirmDialog(this, "Xin chào các bạn nhé JAVA2");
        
        int getChoice = JOptionPane.showConfirmDialog(this,"Bấm vào nút nào cũng được",
                "FPT POLY",
                JOptionPane.YES_NO_CANCEL_OPTION,
                JOptionPane.INFORMATION_MESSAGE);
        if (getChoice == JOptionPane.YES_OPTION) {
            lbl_ten.setText("Bạn vừa chọn Yes");
        }else if(getChoice == JOptionPane.NO_OPTION){
            lbl_ten.setText("Bạn vừa chọn No");
        }else {
            lbl_ten.setText("Bạn vừa chọn Cancel");
        }
    }//GEN-LAST:event_btn_BamVaoDayActionPerformed

    private void btn_GoiFormActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_GoiFormActionPerformed
       new S2_JFrameButton().setVisible(true);//Mở form các bạn muốn
       this.dispose();//Đóng form hiện tại
    }//GEN-LAST:event_btn_GoiFormActionPerformed

    private void tbl_SinhVienMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_SinhVienMouseClicked
        int index = tbl_SinhVien.getSelectedRow();
        System.out.println(index);
        Vector vector = (Vector) vtcData.get(index);
        String msv = (String) vector.get(0);
        String ten = (String) vector.get(1);
        String ngaySinh = (String) vector.get(2);
        String sdt = (String) vector.get(3);
        txt_msv.setText(msv);
        txt_tenFpoly.setText(ten);
        txt_ngaySinh.setText(ngaySinh);
        txt_sdt.setText(sdt);
    }//GEN-LAST:event_tbl_SinhVienMouseClicked

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
            java.util.logging.Logger.getLogger(S3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(S3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(S3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(S3_JFrame_Tong_Hop.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new S3_JFrame_Tong_Hop().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_BamVaoDay;
    private javax.swing.JButton btn_GoiForm;
    private javax.swing.JButton btn_ok;
    private javax.swing.JComboBox<String> cbc_GioiTinh;
    private javax.swing.JComboBox<String> cbc_NamSinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lbl_ten;
    private javax.swing.JRadioButton rdb_Nam;
    private javax.swing.JRadioButton rdb_Nữ;
    private javax.swing.JTable tbl_SinhVien;
    private javax.swing.JTextField txt_msv;
    private javax.swing.JTextField txt_ngaySinh;
    private javax.swing.JTextField txt_sdt;
    private javax.swing.JTextField txt_ten;
    private javax.swing.JTextField txt_tenFpoly;
    // End of variables declaration//GEN-END:variables
}

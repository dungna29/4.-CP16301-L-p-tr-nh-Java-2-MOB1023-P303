/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BAI_1_3_BaiTapTongHop_CRUD;

import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author DungNAPC
 */
public class Main extends javax.swing.JFrame {

    //Triển khai các biến toàn cục ở đây
    ServiceStudent _ServiceStudent = new ServiceStudent();
    Student _Student;
    DefaultTableModel _DefaultTableModel;
    DefaultComboBoxModel _DefaultComboBoxModel;

    public Main() {
        initComponents();
        _ServiceStudent.get10Student();
        loadTableStudent();
        //Group Radiobtn
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(rdb_Nu);
        buttonGroup.add(rdb_Nam);
        loadCbcNamSinh();
        rdb_Nam.setSelected(true);
    }

    void loadCbcNamSinh() {
        _DefaultComboBoxModel = (DefaultComboBoxModel) cbc_NamSinh.getModel();
        cbc_NamSinh.setModel(new DefaultComboBoxModel(_ServiceStudent.getNamSinhCombobox()));
        cbc_NamSinh.setSelectedIndex(_ServiceStudent.getNamSinhCombobox().length - 1);

    }

    void loadTableStudent() {
        if (_ServiceStudent.getLstStudent().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Không DsSV để load lên bảng");
            return;
        }
        _DefaultTableModel = (DefaultTableModel) tbl_Student.getModel();
        _DefaultTableModel.setRowCount(0);
        int stt = 1;
        for (Student x : _ServiceStudent.getLstStudent()) {
            _DefaultTableModel.addRow(new Object[]{stt++, x.getMsv(),
                 x.getTen(), x.getSdt(), x.getGioiTinh() == 1 ? "Nam" : "Nữ",
                 x.getNamSinh(), 2021 - x.getNamSinh()});
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
        jScrollPane1 = new javax.swing.JScrollPane();
        tbl_Student = new javax.swing.JTable();
        btn_Them = new javax.swing.JButton();
        btn_Sua = new javax.swing.JButton();
        btn_Xoa = new javax.swing.JButton();
        txt_msv = new javax.swing.JTextField();
        txt_Ten = new javax.swing.JTextField();
        txt_sdt = new javax.swing.JTextField();
        rdb_Nam = new javax.swing.JRadioButton();
        rdb_Nu = new javax.swing.JRadioButton();
        cbc_NamSinh = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btn_Clear = new javax.swing.JButton();
        btn_Clear1 = new javax.swing.JButton();
        btn_Clear2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbl_Student1 = new javax.swing.JTable();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("Quản lý Sinh Viên UDPM 2021");

        tbl_Student.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sinh Viên", "Tên", "Số điện thoại", "Giới Tính", "Năm Sinh", "Tuổi"
            }
        ));
        tbl_Student.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_StudentMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tbl_Student);

        btn_Them.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Them.setText("Thêm");
        btn_Them.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ThemActionPerformed(evt);
            }
        });

        btn_Sua.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Sua.setText("Sửa");
        btn_Sua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_SuaActionPerformed(evt);
            }
        });

        btn_Xoa.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Xoa.setText("Xóa");
        btn_Xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_XoaActionPerformed(evt);
            }
        });

        txt_msv.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_Ten.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        txt_sdt.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        rdb_Nam.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdb_Nam.setText("Nam");

        rdb_Nu.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        rdb_Nu.setText("Nữ");

        cbc_NamSinh.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Mã Sv:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Tên: ");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setText("Sđt");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel5.setText("Ns:");

        btn_Clear.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Clear.setText("Clear");
        btn_Clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_ClearActionPerformed(evt);
            }
        });

        btn_Clear1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Clear1.setText("Thêm SV ảo vào bảng");
        btn_Clear1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Clear1ActionPerformed(evt);
            }
        });

        btn_Clear2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        btn_Clear2.setText("Save");
        btn_Clear2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_Clear2ActionPerformed(evt);
            }
        });

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jTextArea1.setText("Khi thực hiện thêm và sửa và xóa thì sẽ không\ntác động vào List ở bên Service và hiển thị 1 cái label thông báo bạn nhớ save dữ liệu nhé (Nút Save sẽ\nhiển thị khi dữ liệu bị thay đổi). Chỉ khi nào các bạn thực hiện hành động bấm save thì sẽ lưu toàn bộ\ncác sự thay đổi vào List bên Service.");
        jScrollPane2.setViewportView(jTextArea1);

        tbl_Student1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "STT", "Mã Sinh Viên", "Tên", "Số điện thoại", "Giới Tính", "Năm Sinh", "Tuổi"
            }
        ));
        tbl_Student1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tbl_Student1MouseClicked(evt);
            }
        });
        jScrollPane3.setViewportView(tbl_Student1);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel6.setText("List bên Service");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(txt_msv, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(rdb_Nam)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(rdb_Nu))
                                    .addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(cbc_NamSinh, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(txt_sdt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 125, Short.MAX_VALUE)))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Sua, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Clear1, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Xoa, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Clear2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btn_Them)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(btn_Clear, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(jScrollPane2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel6))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 188, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 490, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_Them)
                    .addComponent(txt_msv, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(btn_Clear))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_Ten, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(btn_Sua)
                    .addComponent(btn_Clear1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txt_sdt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(btn_Xoa)
                    .addComponent(btn_Clear2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(rdb_Nam)
                            .addComponent(rdb_Nu))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbc_NamSinh, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6))
                            .addComponent(jScrollPane2))
                        .addGap(11, 11, 11)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void tbl_StudentMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_StudentMouseClicked
        int index = tbl_Student.getSelectedRow();
        Student st = _ServiceStudent.getLstStudent().get(index);
        txt_msv.setText(st.getMsv());
        txt_Ten.setText(st.getTen());
        txt_sdt.setText(st.getSdt());
        for (int i = 0; i < _ServiceStudent.getNamSinhCombobox().length; i++) {
            if (st.getNamSinh() == Integer.parseInt(_ServiceStudent.getNamSinhCombobox()[i])) {
                cbc_NamSinh.setSelectedIndex(i);
                break;
            }
        }
        if (st.getGioiTinh() == 0) {
            rdb_Nu.setSelected(true);
        }
        if (st.getGioiTinh() == 1) {
            rdb_Nam.setSelected(true);
        }

    }//GEN-LAST:event_tbl_StudentMouseClicked

    private void btn_ClearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ClearActionPerformed
        txt_msv.setText("");
        txt_Ten.setText("");
        txt_sdt.setText("");
        rdb_Nam.setSelected(true);
        cbc_NamSinh.setSelectedIndex(_ServiceStudent.getNamSinhCombobox().length - 1);
    }//GEN-LAST:event_btn_ClearActionPerformed

    private void btn_ThemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_ThemActionPerformed
        //Tự triển khai check các trường hợp khác
        if (txt_Ten.getText().isBlank() && txt_Ten.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Vui lòng không để Empty");
            return;
        }
//        if (_ServiceStudent.getIndexStudent(txt_msv.getText())>=0) {
//            JOptionPane.showMessageDialog(this, "Mã sinh viên trùng");
//            txt_msv.setText("");
//            return;
//        }
//        Student student = new Student(txt_msv.getText(),
//                txt_Ten.getText(), txt_sdt.getText(), rdb_Nam.isSelected()?1:0
//                , Integer.parseInt(cbc_NamSinh.getSelectedItem().toString()));//Cách 1
        //JOptionPane.showMessageDialog(this, _ServiceStudent.addStudent(student));  //Cách 1    
        JOptionPane.showMessageDialog(this, _ServiceStudent.addStudent(new Student(txt_msv.getText(),
                txt_Ten.getText(), txt_sdt.getText(), rdb_Nam.isSelected()?1:0
                , Integer.parseInt(cbc_NamSinh.getSelectedItem().toString()))));      
        loadTableStudent();
    }//GEN-LAST:event_btn_ThemActionPerformed

    private void btn_XoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_XoaActionPerformed
        JOptionPane.showMessageDialog(this, _ServiceStudent.removeStudent(txt_msv.getText()));  
        loadTableStudent();
    }//GEN-LAST:event_btn_XoaActionPerformed

    private void btn_SuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_SuaActionPerformed
       JOptionPane.showMessageDialog(this, _ServiceStudent.editStudent(new Student(txt_msv.getText(),
                txt_Ten.getText(), txt_sdt.getText(), rdb_Nam.isSelected()?1:0
                , Integer.parseInt(cbc_NamSinh.getSelectedItem().toString()))));  
        loadTableStudent();
    }//GEN-LAST:event_btn_SuaActionPerformed

    private void btn_Clear1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Clear1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Clear1ActionPerformed

    private void btn_Clear2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_Clear2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_Clear2ActionPerformed

    private void tbl_Student1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tbl_Student1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tbl_Student1MouseClicked

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Clear;
    private javax.swing.JButton btn_Clear1;
    private javax.swing.JButton btn_Clear2;
    private javax.swing.JButton btn_Sua;
    private javax.swing.JButton btn_Them;
    private javax.swing.JButton btn_Xoa;
    private javax.swing.JComboBox<String> cbc_NamSinh;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JRadioButton rdb_Nam;
    private javax.swing.JRadioButton rdb_Nu;
    private javax.swing.JTable tbl_Student;
    private javax.swing.JTable tbl_Student1;
    private javax.swing.JTextField txt_Ten;
    private javax.swing.JTextField txt_msv;
    private javax.swing.JTextField txt_sdt;
    // End of variables declaration//GEN-END:variables
}

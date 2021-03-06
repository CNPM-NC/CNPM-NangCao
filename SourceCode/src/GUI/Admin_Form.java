/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
import javax.swing.GroupLayout;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.YES_NO_OPTION;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

/**
 *
 * @author CHINH
 */
public class Admin_Form extends javax.swing.JFrame {

    /**
     * Creates new form Admin_Form
     */
    public Admin_Form() {
        initComponents();
        this.setResizable(false); 
        ImageIcon img = new ImageIcon("src//Image//admin.png");
        this.setIconImage(img.getImage());
        this.setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new JPanel();
        jLabel1 = new JLabel();
        jButton1 = new JButton();
        jButton2 = new JButton();
        jButton3 = new JButton();
        jButton4 = new JButton();
        jButton5 = new JButton();
        jButton6 = new JButton();
        jButton7 = new JButton();
        jButton8 = new JButton();
        jMenuBar1 = new JMenuBar();
        jMenu1 = new JMenu();
        jMenuItem1 = new JMenuItem();
        jMenuItem2 = new JMenuItem();
        jMenuItem3 = new JMenuItem();
        jMenu2 = new JMenu();

        setDefaultCloseOperation(WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("H??? Th???ng Qu???n L??");
        addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent evt) {
                formWindowClosing(evt);
            }
        });

        jLabel1.setFont(new Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setForeground(new Color(102, 102, 255));
        jLabel1.setIcon(new ImageIcon(getClass().getResource("/Image/hethong.png"))); // NOI18N
        jLabel1.setText("H??? Th???ng Qu???n L??");

        jButton1.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jButton1.setIcon(new ImageIcon(getClass().getResource("/Image/Users-icon.png"))); // NOI18N
        jButton1.setText("Qu???n L?? T??i Kho???n");
        jButton1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jButton2.setIcon(new ImageIcon(getClass().getResource("/Image/nhanvien.png"))); // NOI18N
        jButton2.setText("Qu???n L?? Nh??n Vi??n");
        jButton2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jButton3.setIcon(new ImageIcon(getClass().getResource("/Image/phieunhap.png"))); // NOI18N
        jButton3.setText("Qu???n L?? Phi???u Nh???p");
        jButton3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jButton4.setIcon(new ImageIcon(getClass().getResource("/Image/sanpham.png"))); // NOI18N
        jButton4.setText("Qu???n L?? H??a ????n");
        jButton4.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jButton5.setIcon(new ImageIcon(getClass().getResource("/Image/bangluong.png"))); // NOI18N
        jButton5.setText("B???ng L????ng");
        jButton5.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton6.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jButton6.setIcon(new ImageIcon(getClass().getResource("/Image/hoadon.png"))); // NOI18N
        jButton6.setText("Qu???n L?? M??n");
        jButton6.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        jButton7.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jButton7.setIcon(new ImageIcon(getClass().getResource("/Image/dangxuat.png"))); // NOI18N
        jButton7.setText("????ng Xu???t");
        jButton7.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });

        jButton8.setFont(new Font("Times New Roman", 1, 14)); // NOI18N
        jButton8.setIcon(new ImageIcon(getClass().getResource("/Image/phancong.png"))); // NOI18N
        jButton8.setText("Qu???n L?? Ph??n Ca");
        jButton8.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        GroupLayout jPanel1Layout = new GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 40, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton5, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, GroupLayout.Alignment.TRAILING, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 235, GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 234, GroupLayout.PREFERRED_SIZE)
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, GroupLayout.PREFERRED_SIZE, 43, GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton3, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton4, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton6, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton8, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton7, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5, GroupLayout.PREFERRED_SIZE, 54, GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40))
        );

        jMenu1.setIcon(new ImageIcon(getClass().getResource("/Image/hethongsys.png"))); // NOI18N
        jMenu1.setText("H??? Th???ng");

        jMenuItem1.setIcon(new ImageIcon(getClass().getResource("/Image/thongke11.png"))); // NOI18N
        jMenuItem1.setText("Th???ng K?? H??a ????n");
        jMenuItem1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuItem2.setIcon(new ImageIcon(getClass().getResource("/Image/gianhap.png"))); // NOI18N
        jMenuItem2.setText("Th???ng K?? Doanh Thu");
        jMenuItem2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem2);

        jMenuItem3.setIcon(new ImageIcon(getClass().getResource("/Image/phancong.png"))); // NOI18N
        jMenuItem3.setText("Chi Ti???t Th???ng K??");
        jMenuItem3.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem3);

        jMenuBar1.add(jMenu1);

        jMenu2.setIcon(new ImageIcon(getClass().getResource("/Image/gioithieu.png"))); // NOI18N
        jMenu2.setText("Gi???i Thi???u");
        jMenu2.addMouseListener(new MouseAdapter() {
            public void mouseClicked(MouseEvent evt) {
                jMenu2MouseClicked(evt);
            }
        });
        jMenu2.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                jMenu2ActionPerformed(evt);
            }
        });
        jMenuBar1.add(jMenu2);

        setJMenuBar(jMenuBar1);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton4ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        HoaDon_Form s=new HoaDon_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton4ActionPerformed
    public void showExit(){
            int kQ = JOptionPane.showConfirmDialog(null,
                    "B???n c?? mu???n ????ng xu???t kh??ng ?","????ng Xu???t",JOptionPane.YES_NO_OPTION);
            if(kQ == 0){
               DangNhap_Form s=new DangNhap_Form();
               s.setVisible(true);
               this.setVisible(false);
            }
        }
    private void jButton7ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
        // TODO add your handling code here:
        showExit();
    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        PhieuNhap_Form s=new PhieuNhap_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        NhanVien_Form s=new NhanVien_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        TaiKhoanNhanVien_Form s=new TaiKhoanNhanVien_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        // TODO add your handling code here:
        PhanCa_Form s=new PhanCa_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton8ActionPerformed

    private void jButton6ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        // TODO add your handling code here:
        Menu_Form s=new Menu_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton5ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        // TODO add your handling code here:
        BangLuong_Form s=new BangLuong_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jMenu2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenu2ActionPerformed
        // TODO add your handling code here:
        GioiThieu_Form s=new GioiThieu_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jMenu2ActionPerformed

    private void jMenu2MouseClicked(MouseEvent evt) {//GEN-FIRST:event_jMenu2MouseClicked
        // TODO add your handling code here:
         GioiThieu_Form s=new GioiThieu_Form();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
    }//GEN-LAST:event_jMenu2MouseClicked

    private void jMenuItem1ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
       ThongKeHoaDon s=new ThongKeHoaDon();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jMenuItem2ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed
        // TODO add your handling code here:
        ThongKeDoanhThu s=new ThongKeDoanhThu();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem2ActionPerformed

    private void jMenuItem3ActionPerformed(ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed
        // TODO add your handling code here:
        ChiTietThongKe s=new ChiTietThongKe();
        s.setVisible(true);
        s.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setVisible(false);
    }//GEN-LAST:event_jMenuItem3ActionPerformed

    private void formWindowClosing(WindowEvent evt) {//GEN-FIRST:event_formWindowClosing
        int confirm=JOptionPane.showConfirmDialog(null,"Tho??t ch????ng tr??nh?",null,YES_NO_OPTION);
        if(confirm==JOptionPane.YES_OPTION){
                System.exit(0);
        }
    }//GEN-LAST:event_formWindowClosing


    
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
            java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Admin_Form.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Admin_Form().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private JButton jButton1;
    private JButton jButton2;
    private JButton jButton3;
    private JButton jButton4;
    private JButton jButton5;
    private JButton jButton6;
    private JButton jButton7;
    private JButton jButton8;
    private JLabel jLabel1;
    private JMenu jMenu1;
    private JMenu jMenu2;
    private JMenuBar jMenuBar1;
    private JMenuItem jMenuItem1;
    private JMenuItem jMenuItem2;
    private JMenuItem jMenuItem3;
    private JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Ankit Akash
 */
import java.sql.*;
import java.sql.DriverManager;
import java.util.logging.Level;
import java.util.logging.Logger;

public class new_owner_info extends javax.swing.JFrame {
    String oid;
    public new_owner_info(String r) {
       oid=r;
        
       initComponents();
       FillCombo();
        
    }
    /**
     * Creates new form new_owner_info
     */
    public new_owner_info() {
        
        initComponents();
        
    }
    private void FillCombo(){
        Connection con=null;
        PreparedStatement stm=null;
         System.out.println("hry");   
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","14011996");      
            //System.out.println("hry"+oid);
            stm=con.prepareStatement("select * from registration where cus_id=?");
             // System.out.println("hry"+oid);
             stm.setString(1,oid);
             //System.out.println("hry");
             ResultSet rs=stm.executeQuery();
             while(rs.next())
             {
                 cmb.addItem(rs.getString(2));
                 
             }
    }catch (SQLException ex) {
            Logger.getLogger(vehicle2.class.getName()).log(Level.SEVERE, null, ex);
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

        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtFatherName = new javax.swing.JTextField();
        txtDOB = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtPhone = new javax.swing.JTextField();
        txtOid = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        btnSubmit = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAddress = new javax.swing.JTextArea();
        cmb = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();

        setMinimumSize(new java.awt.Dimension(1980, 1080));
        getContentPane().setLayout(null);

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel3.setText("DATE OF BIRTH");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(380, 410, 254, 44);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel4.setText("FATHER'S NAME");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(380, 480, 261, 44);

        txtFatherName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtFatherName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtFatherNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtFatherName);
        txtFatherName.setBounds(1050, 480, 450, 50);

        txtDOB.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtDOB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtDOBActionPerformed(evt);
            }
        });
        getContentPane().add(txtDOB);
        txtDOB.setBounds(1050, 410, 450, 50);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel8.setText("VEHICLE ID");
        getContentPane().add(jLabel8);
        jLabel8.setBounds(380, 190, 186, 44);

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel5.setText("NEW OWNER'S INFORMATION");
        getContentPane().add(jLabel5);
        jLabel5.setBounds(558, 50, 737, 58);

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel10.setText("ADDRESS");
        getContentPane().add(jLabel10);
        jLabel10.setBounds(380, 630, 152, 44);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel1.setText("NEW OWNER ID");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(380, 270, 258, 44);

        txtPhone.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtPhone.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPhoneActionPerformed(evt);
            }
        });
        getContentPane().add(txtPhone);
        txtPhone.setBounds(1050, 560, 450, 50);

        txtOid.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtOid.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtOidActionPerformed(evt);
            }
        });
        getContentPane().add(txtOid);
        txtOid.setBounds(1050, 260, 450, 50);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel2.setText("NAME");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(380, 340, 94, 44);

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        jLabel9.setText("PHONE");
        getContentPane().add(jLabel9);
        jLabel9.setBounds(380, 560, 113, 44);

        txtName.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        txtName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNameActionPerformed(evt);
            }
        });
        getContentPane().add(txtName);
        txtName.setBounds(1050, 340, 450, 50);

        btnSubmit.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        btnSubmit.setText("SUBMIT");
        btnSubmit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSubmitActionPerformed(evt);
            }
        });
        getContentPane().add(btnSubmit);
        btnSubmit.setBounds(750, 810, 310, 90);

        txtAddress.setColumns(20);
        txtAddress.setRows(5);
        jScrollPane1.setViewportView(txtAddress);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(1050, 630, 450, 120);

        cmb.setFont(new java.awt.Font("Tahoma", 0, 36)); // NOI18N
        cmb.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbActionPerformed(evt);
            }
        });
        getContentPane().add(cmb);
        cmb.setBounds(1050, 180, 450, 50);

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/1JOSHUATUCKER0068sm.JPG"))); // NOI18N
        getContentPane().add(jLabel6);
        jLabel6.setBounds(70, 0, 1890, 1110);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtFatherNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtFatherNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtFatherNameActionPerformed

    private void txtDOBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtDOBActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtDOBActionPerformed

    private void txtOidActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtOidActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtOidActionPerformed

    private void txtNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNameActionPerformed

    private void btnSubmitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSubmitActionPerformed
        // TODO add your handling code here:
         Connection con=null;
         PreparedStatement stm=null;
         String name;
         int flag=1;
        try {
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/project?zeroDateTimeBehavior=convertToNull","root","14011996");
            stm=con.prepareStatement("insert into owner values(?,?,?,?,?,?)");
            stm.setString(1,txtName.getText());
            stm.setString(2,txtDOB.getText());
            stm.setString(3,txtOid.getText());
            stm.setString(4,txtFatherName.getText());
            stm.setString(5,txtAddress.getText());
            stm.setString(6,txtPhone.getText());
            //stm.setString(7,txtvid.getText());
            name=(String) cmb.getSelectedItem();
            //stm.setString(7,name);
            
           
           int i=stm.executeUpdate();
           if(i>0)
           {
            new veh_reg(txtOid.getText(),flag,oid,name).setVisible(true);
            this.dispose();
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(new_owner_info.class.getName()).log(Level.SEVERE, null, ex);
        }

    }//GEN-LAST:event_btnSubmitActionPerformed

    private void cmbActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbActionPerformed
            // TODO add your handling code here:
    }//GEN-LAST:event_cmbActionPerformed

    private void txtPhoneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPhoneActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPhoneActionPerformed

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
            java.util.logging.Logger.getLogger(new_owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(new_owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(new_owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(new_owner_info.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new new_owner_info().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSubmit;
    private javax.swing.JComboBox<String> cmb;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAddress;
    private javax.swing.JTextField txtDOB;
    private javax.swing.JTextField txtFatherName;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtOid;
    private javax.swing.JTextField txtPhone;
    // End of variables declaration//GEN-END:variables

}

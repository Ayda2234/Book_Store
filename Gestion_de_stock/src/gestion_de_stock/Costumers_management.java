/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */

package gestion_de_stock;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;
import com.mysql.jdbc.Statement;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author RAM COM
 */
public class Costumers_management extends javax.swing.JFrame {

    /** Creates new form Costumers_management */
    public Costumers_management() {
        initComponents();
        this.setTitle("Adding costumers ");
        Costumer();
    }
    ResultSet Rs = null,Rs1 = null;
    Connection con = null;
    Statement st = null, St1 = null;

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        name = new javax.swing.JTextField();
        email = new javax.swing.JTextField();
        adress = new javax.swing.JTextField();
        ADD = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        familyname = new javax.swing.JTextField();
        phone = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TCostumer = new javax.swing.JTable();
        REFRESH = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Watermelon Days", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(153, 51, 0));
        jLabel1.setText("Adding a custumer");

        name.setBackground(new java.awt.Color(204, 102, 0));
        name.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        name.setForeground(new java.awt.Color(255, 255, 255));

        email.setBackground(new java.awt.Color(204, 102, 0));
        email.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        email.setForeground(new java.awt.Color(255, 255, 255));
        email.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                emailActionPerformed(evt);
            }
        });

        adress.setBackground(new java.awt.Color(204, 102, 0));
        adress.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        adress.setForeground(new java.awt.Color(255, 255, 255));

        ADD.setBackground(new java.awt.Color(153, 51, 0));
        ADD.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        ADD.setForeground(new java.awt.Color(255, 255, 255));
        ADD.setText("ADD");
        ADD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDActionPerformed(evt);
            }
        });

        jButton5.setBackground(new java.awt.Color(153, 51, 0));
        jButton5.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton5.setForeground(new java.awt.Color(255, 255, 255));
        jButton5.setText("EDIT");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jButton4.setBackground(new java.awt.Color(153, 51, 0));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton4.setForeground(new java.awt.Color(255, 255, 255));
        jButton4.setText("DELETE");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        familyname.setBackground(new java.awt.Color(204, 102, 0));
        familyname.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        familyname.setForeground(new java.awt.Color(255, 255, 255));

        phone.setBackground(new java.awt.Color(204, 102, 0));
        phone.setFont(new java.awt.Font("Yu Gothic Medium", 1, 14)); // NOI18N
        phone.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setText("name");

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("family name");

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("phone_number");

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("email");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("adress");

        TCostumer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null},
                {null, null, null, null, null, null}
            },
            new String [] {
                "ID", "name", "family_name", "phone_number", "mail", "full_adress"
            }
        ));
        TCostumer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TCostumerMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TCostumer);

        REFRESH.setBackground(new java.awt.Color(102, 0, 0));
        REFRESH.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        REFRESH.setForeground(new java.awt.Color(255, 255, 255));
        REFRESH.setText("REFRESH");
        REFRESH.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                REFRESHActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel6))
                                .addGap(9, 9, 9)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(name)
                                    .addComponent(familyname)
                                    .addComponent(phone)
                                    .addComponent(email)
                                    .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(jButton4)
                                        .addGap(18, 18, 18)
                                        .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 99, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addComponent(REFRESH)
                                        .addGap(67, 67, 67)))))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 611, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(356, 356, 356)
                        .addComponent(jLabel1)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(REFRESH)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(familyname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(phone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(email, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(12, 12, 12)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(adress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addGap(35, 35, 35)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ADD, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(25, 25, 25))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
int ID;
  private void CountBnum(){
      try{
          St1 = (Statement) con.createStatement();
          Rs1 = St1.executeQuery("select Max(Bnum) from costumers");
          Rs1.next();
          ID = Rs1.getInt((1)+1);
      
      }catch(Exception e){}
 
  }
    
    private void Costumer() {
        try {
            
            con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ihm?zeroDateTimeBehavior=convertToNull", "root", "");
            st = (Statement) con.createStatement();
            Rs = st.executeQuery("select * from costumers");
            TCostumer.setModel(DbUtils.resultSetToTableModel(Rs));
        } catch (Exception e) {
        }
    }
    private void emailActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_emailActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_emailActionPerformed

    private void ADDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDActionPerformed
        if (name.getText().isEmpty() || familyname.getText().isEmpty() ||phone.getText().isEmpty()|| email.getText().isEmpty() || adress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing information");
        } else {
            try {
                CountBnum();
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ihm?zeroDateTimeBehavior=convertToNull", "root", "");
                PreparedStatement Pst = (PreparedStatement) con.prepareStatement(" insert into costumers values(?,?,?,?,?,?)");
                Pst.setInt(1,ID);
                Pst.setString(2, name.getText());
                Pst.setString(3, familyname.getText());
                Pst.setInt(4, Integer.valueOf(phone.getText()));
                Pst.setString(5, email.getText());
                Pst.setString(6, adress.getText());
                
                int row = Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, " costumer added ");
                con.close();
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);

            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_ADDActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
         if (name.getText().isEmpty() || familyname.getText().isEmpty() ||phone.getText().isEmpty()|| email.getText().isEmpty() || adress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing information");
        } else {
            try {
                int ID = (int)TCostumer.getModel().getValueAt(TCostumer.getSelectedRow(), 0);
                CountBnum();
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ihm?zeroDateTimeBehavior=convertToNull", "root", "");
                PreparedStatement Pst = (PreparedStatement) con.prepareStatement(" UPDATE costumers SET name= ? , family_name = ? , phone_number = ? , mail = ? ,full_adress = ? where ID = " + ID);
              //  Pst.setInt(6,ID); 
                Pst.setString(1, name.getText());
                Pst.setString(2, familyname.getText());
                Pst.setInt(3, Integer.valueOf(phone.getText()));
                Pst.setString(4, email.getText());
                Pst.setString(5, adress.getText());
                int row = Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, " costumer's information updated ");
                con.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);

            }
        }        // TODO add your handling code here:
    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
       if (name.getText().isEmpty() || familyname.getText().isEmpty() ||phone.getText().isEmpty()|| email.getText().isEmpty() || adress.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Missing information");
        } else {
            try {
                CountBnum();
                con = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/ihm?zeroDateTimeBehavior=convertToNull", "root", "");
                PreparedStatement Pst = (PreparedStatement) con.prepareStatement(" delete from costumers where ID = ?");
                Pst.setInt(1,key);
                /*  Pst.setString(5, name.getText());
                Pst.setString(4, (String) category.getSelectedItem());
                Pst.setInt(3, Integer.valueOf(quantity.getText()));
                Pst.setInt(2, Integer.valueOf(price.getText()));*/
                int row = Pst.executeUpdate();
                JOptionPane.showMessageDialog(this, " costumer deleted ");
                con.close();

            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(this, ex);

            }}
    }//GEN-LAST:event_jButton4ActionPerformed
int key = 0 ;
    private void TCostumerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TCostumerMouseClicked
        DefaultTableModel model = (DefaultTableModel) TCostumer.getModel();
        int index = TCostumer.getSelectedRow();
        key = Integer.valueOf(model.getValueAt(index, 0).toString());
        name.setText(model.getValueAt(index, 1).toString());
        familyname.setText(model.getValueAt(index, 2).toString());
        phone.setText(model.getValueAt(index, 3).toString());       
        email.setText(model.getValueAt(index, 4).toString());
        adress.setText(model.getValueAt(index, 5).toString());// TODO add your handling code here:
    }//GEN-LAST:event_TCostumerMouseClicked

    private void REFRESHActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_REFRESHActionPerformed
Costumer();        // TODO add your handling code here:
    }//GEN-LAST:event_REFRESHActionPerformed

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
            java.util.logging.Logger.getLogger(Costumers_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Costumers_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Costumers_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Costumers_management.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Costumers_management().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADD;
    private javax.swing.JToggleButton REFRESH;
    private javax.swing.JTable TCostumer;
    private javax.swing.JTextField adress;
    private javax.swing.JTextField email;
    private javax.swing.JTextField familyname;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField name;
    private javax.swing.JTextField phone;
    // End of variables declaration//GEN-END:variables

}
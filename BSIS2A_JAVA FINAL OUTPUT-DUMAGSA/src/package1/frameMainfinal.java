/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package package1;

import java.awt.Color;
import java.sql.*;
import javax.swing.JOptionPane;
import java.sql.Statement;
import java.sql.ResultSet;


public class frameMainfinal extends javax.swing.JFrame {
    static Connection connection;
    static String url;
    static Statement st;
    static ResultSet rs;

    /**
     *
     * @param id
     * @param name
     * @return
     * @throws SQLException
     * @throws ClassNotFoundException
     */
    public int search(String id,String name)
   throws SQLException, ClassNotFoundException{
    Class.forName("com.mysql.cj.jdbc.Driver");
    url="jdbc:mysql://localhost:3306/db";
    connection = DriverManager.getConnection
    (url, "root","buhaycolegio@2024");
    st = connection.createStatement();
    rs=st.executeQuery
    ("Select * From reg Where id= '"+id+"'  "
      + "and fname = '" +name+ "'");
            if(rs!=null){
                return 1;
            }
            else{
                return 0;
            }

     }

    /**
     * Creates new form frameMain
     */
    public frameMainfinal() {
        initComponents();
        frameMainfinal.this.setLocation(400,180);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        ex3 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        labelA = new javax.swing.JLabel();
        labelB = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        labelPass = new javax.swing.JLabel();
        textUserId = new javax.swing.JTextField();
        textUserName = new javax.swing.JTextField();
        textLastName = new javax.swing.JTextField();
        textUserAddress = new javax.swing.JTextField();
        textContactNumber = new javax.swing.JTextField();
        textEmailAddress = new javax.swing.JTextField();
        textPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setForeground(new java.awt.Color(204, 204, 255));

        jPanel1.setBackground(new java.awt.Color(153, 0, 102));

        jButton1.setFont(new java.awt.Font("Rage Italic", 0, 18)); // NOI18N
        jButton1.setText("save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        ex3.setFont(new java.awt.Font("Brush Script MT", 0, 18)); // NOI18N
        ex3.setText("exit");
        ex3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ex3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ex3, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(18, 18, 18)
                .addComponent(ex3)
                .addGap(134, 134, 134))
        );

        jPanel2.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setFont(new java.awt.Font("Rage Italic", 0, 22)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(102, 0, 102));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Create Customer Account");

        jLabel2.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel2.setText("Your ID:");

        labelA.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        labelA.setText("First Name:");

        labelB.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        labelB.setText("Last Name:");

        jLabel5.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel5.setText("Address:");

        jLabel6.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel6.setText("Contact No.");

        jLabel7.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        jLabel7.setText("Email:");

        labelPass.setFont(new java.awt.Font("Segoe Print", 0, 11)); // NOI18N
        labelPass.setText("Password:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelA, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelPass, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(labelB, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(textUserId, javax.swing.GroupLayout.DEFAULT_SIZE, 193, Short.MAX_VALUE)
                    .addComponent(textUserName)
                    .addComponent(textLastName)
                    .addComponent(textUserAddress)
                    .addComponent(textContactNumber)
                    .addComponent(textEmailAddress)
                    .addComponent(textPassword))
                .addContainerGap(60, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(textUserId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelA)
                    .addComponent(textUserName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(labelB)
                    .addComponent(textLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(textUserAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(textContactNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(textEmailAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelPass)
                    .addComponent(textPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @SuppressWarnings("null")
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        labelA.setForeground(Color.black);
    labelB.setForeground(Color.black);
    textPassword.setForeground(Color.black);
    int check = 0;
    try {
        check = search(textUserId.getText(), textUserName.getText());
    } catch (SQLException ex) {
        // Handle SQLException
    } catch (ClassNotFoundException ex) {
        // Handle ClassNotFoundException
    }

    if (check == 1) {
        try {
            if (textPassword.getText().length() < 5) {
                JOptionPane.showMessageDialog(null, "Password must be at least 5 characters long", "System Message", JOptionPane.INFORMATION_MESSAGE);
                textPassword.setForeground(Color.red);
                return;
            }

            if (textUserId.getText().length() < 4) {
                JOptionPane.showMessageDialog(null, "ID must be at least 4 digits long", "System Message", JOptionPane.INFORMATION_MESSAGE);
                labelA.setForeground(Color.red);
                return;
            }

            if (textContactNumber.getText().length() != 11) {
                JOptionPane.showMessageDialog(null, "Contact number must be exactly 11 digits long", "System Message", JOptionPane.INFORMATION_MESSAGE);
                jLabel6.setForeground(Color.red);
                return;
            }
            if (textPassword.getText() == null ? "" == null : textPassword.getText().equals("")) {
                // Handle the case where the password is empty
                JOptionPane.showMessageDialog(null, "Password must contain value", "System Message", JOptionPane.INFORMATION_MESSAGE);
                textUserAddress.setText(null);
                textUserId.setText(null);
                textUserName.setText(null);
                textContactNumber.setText(null);
                textLastName.setText(null);
                textPassword.setText(null);
                textEmailAddress.setText(null);
                textPassword.setForeground(Color.red);
            } else if ((textUserId.getText() == null ? "" == null : textUserId.getText().equals("")) || 
                       (textUserName.getText() == null ? "" == null : textUserName.getText().equals(""))) {
                // Handle the case where ID and Name are required
                JOptionPane.showMessageDialog(null, "ID and Name is Required", "System Message", JOptionPane.ERROR_MESSAGE);
                labelB.setForeground(Color.red);
                labelA.setForeground(Color.red);
            } else {
                // Insert the record into the database
                st.executeUpdate("Insert into reg("
                        + "Id,fname,lname,address,mobileno,email,"
                        + "password" + ") VALUES ('"
                        + textUserId.getText() + "','"
                        + textUserName.getText() + "','"
                        + textLastName.getText() + "','"
                        + textUserAddress.getText() + "','"
                        + textContactNumber.getText() + "','"
                        + textEmailAddress.getText() + "','"
                        + textPassword.getText() + "')");
                
                // Display success message
                JOptionPane.showMessageDialog(null, "Record Created", "System Message", JOptionPane.INFORMATION_MESSAGE);

                // Create an instance of the HomePage JFrame and make it visible
                HomePage homePage = new HomePage();
                homePage.setVisible(true);

                // Hide the current frame
                frameMainfinal.this.setVisible(false);

                // Clear the text fields
                textUserId.setText("");
                textUserName.setText("");
              
            }
        } catch (SQLException ex) {
            // Handle SQLException when the record already exists
            JOptionPane.showMessageDialog(null, "Record Already Exist", "System Message", JOptionPane.ERROR_MESSAGE);
            textUserAddress.setText(null);
            textUserId.setText(null);
            textUserName.setText(null);
            textContactNumber.setText(null);
            textLastName.setText(null);
            textEmailAddress.setText(null);
            textPassword.setText(null);
        }
    }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ex3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ex3ActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ex3ActionPerformed

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
            java.util.logging.Logger.getLogger(frameMainfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(frameMainfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(frameMainfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frameMainfinal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable(){
            @Override
            public void run() {
                new frameMainfinal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ex3;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel labelA;
    private javax.swing.JLabel labelB;
    private javax.swing.JLabel labelPass;
    private javax.swing.JTextField textContactNumber;
    private javax.swing.JTextField textEmailAddress;
    private javax.swing.JTextField textLastName;
    private javax.swing.JPasswordField textPassword;
    private javax.swing.JTextField textUserAddress;
    private javax.swing.JTextField textUserId;
    private javax.swing.JTextField textUserName;
    // End of variables declaration//GEN-END:variables
}

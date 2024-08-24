/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hiring;

import java.sql.*;
import java.awt.*;
import java.awt.print.PrinterException;
import java.lang.reflect.AccessFlag.Location;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.text.*;
import net.proteanit.sql.DbUtils;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.jar.Attributes.Name;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author EL10_gazy
 */
public class COMPANYY_Frame extends javax.swing.JFrame {

    private Connection con;
    private CompanyBLL companyBLL;
    private Statement st;

    public COMPANYY_Frame(Connection con, CompanyBLL companyBLL) {
        this.con = con;
        this.companyBLL = companyBLL;
    }

    public COMPANYY_Frame(CompanyBLL companyBLL) {
        this();
        this.companyBLL = companyBLL;

    }

    public COMPANYY_Frame() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        close = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        urltxt = new javax.swing.JTextField();
        companyreftxt = new javax.swing.JTextField();
        locationtxt = new javax.swing.JTextField();
        NAMEtxt = new javax.swing.JTextField();
        MAILtxt = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTablelCompany = new javax.swing.JTable();
        SHOWCOMMPBYREF = new javax.swing.JButton();
        UPDATECOMPANY = new javax.swing.JButton();
        ADDCOMPANY = new javax.swing.JButton();
        DELETECOMPANY1 = new javax.swing.JButton();
        SHOWALLCOMPANIES = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(84, 142, 211));

        jLabel2.setFont(new java.awt.Font("Stencil", 1, 36)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Company");

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 2, 36)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));

        jButton1.setBackground(new java.awt.Color(84, 142, 211));
        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 2, 36)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("Home");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        close.setBackground(new java.awt.Color(84, 142, 211));
        close.setFont(new java.awt.Font("Segoe UI Semibold", 2, 36)); // NOI18N
        close.setForeground(new java.awt.Color(255, 255, 255));
        close.setText("Exit ");
        close.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                closeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(592, Short.MAX_VALUE)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 268, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(268, 268, 268)
                .addComponent(jButton1)
                .addGap(92, 92, 92)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(33, 33, 33)
                    .addComponent(close)
                    .addContainerGap(1437, Short.MAX_VALUE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(64, Short.MAX_VALUE)
                .addComponent(jLabel9)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jPanel1Layout.createSequentialGroup()
                    .addGap(7, 7, 7)
                    .addComponent(close, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(16, Short.MAX_VALUE)))
        );

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1570, 70));

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(84, 142, 211));
        jLabel4.setText("URL");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 500, 180, -1));

        jLabel5.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(84, 142, 211));
        jLabel5.setText("Company_Ref");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 130, 180, -1));

        jLabel6.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(84, 142, 211));
        jLabel6.setText("Name");
        jPanel2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 210, 180, -1));

        jLabel7.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(84, 142, 211));
        jLabel7.setText("Email");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 310, 180, -1));

        jLabel8.setFont(new java.awt.Font("Segoe UI Historic", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(84, 142, 211));
        jLabel8.setText("Location");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, 180, -1));
        jPanel2.add(urltxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 500, 190, 40));
        jPanel2.add(companyreftxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 120, 190, 40));
        jPanel2.add(locationtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 400, 190, 40));
        jPanel2.add(NAMEtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 200, 190, 40));

        MAILtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MAILtxtActionPerformed(evt);
            }
        });
        jPanel2.add(MAILtxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(310, 300, 190, 40));

        jTablelCompany.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Comp_Ref", "Name", "Email", "Location", "URL"
            }
        ));
        jScrollPane1.setViewportView(jTablelCompany);

        jPanel2.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 70, 860, 520));

        SHOWCOMMPBYREF.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        SHOWCOMMPBYREF.setForeground(new java.awt.Color(84, 142, 211));
        SHOWCOMMPBYREF.setText("Search Company");
        SHOWCOMMPBYREF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOWCOMMPBYREFActionPerformed(evt);
            }
        });
        jPanel2.add(SHOWCOMMPBYREF, new org.netbeans.lib.awtextra.AbsoluteConstraints(940, 640, 250, 80));

        UPDATECOMPANY.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        UPDATECOMPANY.setForeground(new java.awt.Color(84, 142, 211));
        UPDATECOMPANY.setText("Update Company");
        UPDATECOMPANY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                UPDATECOMPANYActionPerformed(evt);
            }
        });
        jPanel2.add(UPDATECOMPANY, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 640, 240, 80));

        ADDCOMPANY.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        ADDCOMPANY.setForeground(new java.awt.Color(84, 142, 211));
        ADDCOMPANY.setText("Add Company");
        ADDCOMPANY.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ADDCOMPANYActionPerformed(evt);
            }
        });
        jPanel2.add(ADDCOMPANY, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 640, 260, 80));

        DELETECOMPANY1.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        DELETECOMPANY1.setForeground(new java.awt.Color(84, 142, 211));
        DELETECOMPANY1.setText("Delete Company");
        DELETECOMPANY1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DELETECOMPANY1ActionPerformed(evt);
            }
        });
        jPanel2.add(DELETECOMPANY1, new org.netbeans.lib.awtextra.AbsoluteConstraints(650, 640, 210, 80));

        SHOWALLCOMPANIES.setFont(new java.awt.Font("Segoe UI Semibold", 1, 18)); // NOI18N
        SHOWALLCOMPANIES.setForeground(new java.awt.Color(84, 142, 211));
        SHOWALLCOMPANIES.setText("Show All companies");
        SHOWALLCOMPANIES.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SHOWALLCOMPANIESActionPerformed(evt);
            }
        });
        jPanel2.add(SHOWALLCOMPANIES, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 640, 250, 80));

        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 1570, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void closeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_closeActionPerformed
        JFrame frame = new JFrame("Exit");
        if (JOptionPane.showConfirmDialog(frame, "Are you sure ?", "Project Exit ", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
            System.exit(0);
}    }//GEN-LAST:event_closeActionPerformed

    private void ADDCOMPANYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ADDCOMPANYActionPerformed
//        Company comp = new Company(companyreftxt.getText(), nametxt.getText(), mailtxt.getText(), locationtxt.getText(), urltxt.getText());
//        companyBLL.AddCompany(comp);
//        JOptionPane.showMessageDialog(null, "Hello Again ");

        
         // Validate ID (txtDid) field
        String companyTxt = companyreftxt.getText().trim();
        
        if ( companyTxt.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Ref Which cannot be empty");
            return; // Stop execution if ID is invalid
        } else if (companyBLL.isCompanyIdisValid(companyTxt)) {
            JOptionPane.showMessageDialog(null, "Please enter a different Ref , This Id already exists.");
            return;
        }
     
        int id = Integer.parseInt(companyTxt);
        
        
        
        
        String Name = NAMEtxt.getText();
     
         // Validate Name field
        if (!Name.matches("[a-zA-Z\\s]+") || Name.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a valid Name (alphabetical characters and spaces only and cannot be empty)");
            return; // Stop execution if name is invalid
        }
        String mail = MAILtxt.getText();
        
           if (mail.isEmpty() || !mail.contains("@")) {
            JOptionPane.showMessageDialog(null, "Please enter a valid  mail COntain \"@\"");
            return; // Stop execution if phone number is invalid
        }
           ////////
        String Location = locationtxt.getText();
           if (Location.isEmpty() ) {
            JOptionPane.showMessageDialog(null, "Please enter a Location");
            return; // Stop execution if phone number is invalid
        }
          /////
        String URL = urltxt.getText();
           if (URL.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Please enter a URL");
            return; // Stop execution if phone number is invalid
        }
      Company company = new Company(companyTxt,Name,Location ,mail,URL);
        try {
            companyBLL.AddCompany(company);
            JOptionPane.showMessageDialog(null, "Siiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiu");

//            st = con.createStatement();
//            ResultSet res = st.executeQuery("select * from tblCompany ");
//            jTablelCompany.setModel(DbUtils.resultSetToTableModel(res));

        } catch (Exception e) {
            e.printStackTrace();
        }

        companyreftxt.setText("");
        NAMEtxt.setText("");
        MAILtxt.setText("");
        locationtxt.setText("");
        urltxt.setText("");


    }//GEN-LAST:event_ADDCOMPANYActionPerformed

    private void SHOWCOMMPBYREFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOWCOMMPBYREFActionPerformed
        Company company = new Company();
        
        String Ref = companyreftxt.getText();
        try {
           
            company = companyBLL.ShowCompanyById(Ref);
            // companyreftxt.setText(company.getRef());
             NAMEtxt.setText(company.getName());  
             MAILtxt.setText(company.getEmail());
            locationtxt.setText(company.getLocation());
             urltxt.setText(company.getUrl());
        JOptionPane.showMessageDialog(null, "Messiiiiiiiiii");
        
        
        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_SHOWCOMMPBYREFActionPerformed

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
 try {
            String url = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";
            con = DriverManager.getConnection(url);
       
            st = con.createStatement();
            ResultSet res = st.executeQuery("select * from tblCompany");

            jTablelCompany.setModel(DbUtils.resultSetToTableModel(res));

        } catch (Exception e) {
            e.printStackTrace();
        }

    }//GEN-LAST:event_formWindowActivated

    private void UPDATECOMPANYActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_UPDATECOMPANYActionPerformed

        String Ref = companyreftxt.getText();
        String Name = NAMEtxt.getText();
        String mail = MAILtxt.getText();
        String Location = locationtxt.getText();
        String URL = urltxt.getText();
        Company company = new Company(Ref, Name, mail, Location, URL);

//        Applicant applicant = new Applicant();
        try {
            companyBLL.updateCompany(company);
            JOptionPane.showMessageDialog(null, " علي عيونك يعسولUpdate");
//            st = con.createStatement();
//            ResultSet res = st.executeQuery("select * from tblCompany ");
//            jTablelCompany.setModel(DbUtils.resultSetToTableModel(res));

        } catch (Exception e) {
            e.addSuppressed(e);
        }

        companyreftxt.setText("");
        NAMEtxt.setText("");
        MAILtxt.setText("");
        locationtxt.setText("");
        urltxt.setText("");

    }//GEN-LAST:event_UPDATECOMPANYActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.setVisible(false);
        Home home = new Home();
        home.setVisible(true);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void MAILtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MAILtxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_MAILtxtActionPerformed

    private void DELETECOMPANY1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DELETECOMPANY1ActionPerformed
        String Ref =companyreftxt.getText();
   
        Company company = new Company(Ref);
      try {
          companyBLL.deleteCompany(Ref);
                    JOptionPane.showMessageDialog(null, "Siiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiiu");
//         st = con.createStatement();
//        ResultSet res  =    st.executeQuery("select * from tblApplicant ");
//        jTable1Applicant.setModel(DbUtils.resultSetToTableModel(res));
            
        } catch (Exception e) {
        }
            companyreftxt.setText("");
            companyreftxt.setText("");
            MAILtxt.setText("");
            locationtxt.setText("");
            urltxt.setText("");
          
    }//GEN-LAST:event_DELETECOMPANY1ActionPerformed

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowClosed

    private void SHOWALLCOMPANIESActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SHOWALLCOMPANIESActionPerformed
        try {

            st = con.createStatement();
        ResultSet res  =    st.executeQuery("select * from tblCompany ");
        jTablelCompany.setModel(DbUtils.resultSetToTableModel(res));
            JOptionPane.showMessageDialog(null, "show all company");
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }//GEN-LAST:event_SHOWALLCOMPANIESActionPerformed

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
            java.util.logging.Logger.getLogger(COMPANYY_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(COMPANYY_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(COMPANYY_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(COMPANYY_Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new COMPANYY_Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ADDCOMPANY;
    private javax.swing.JButton DELETECOMPANY1;
    private javax.swing.JTextField MAILtxt;
    private javax.swing.JTextField NAMEtxt;
    private javax.swing.JButton SHOWALLCOMPANIES;
    private javax.swing.JButton SHOWCOMMPBYREF;
    private javax.swing.JButton UPDATECOMPANY;
    private javax.swing.JButton close;
    private javax.swing.JTextField companyreftxt;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTablelCompany;
    private javax.swing.JTextField locationtxt;
    private javax.swing.JTextField urltxt;
    // End of variables declaration//GEN-END:variables

    private void getAllCompanys() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}

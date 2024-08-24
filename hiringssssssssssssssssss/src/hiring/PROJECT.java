/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package hiring;


import java.sql.*;
import java.awt.*;
import java.awt.print.PrinterException;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.text.*;
import net.proteanit.sql.DbUtils;   

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**-
 *      
 * @author WIN(10)X64SS
 */
public class PROJECT{

    static String dburl = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";

    /**
     * @param args the command line arguments
     */ 
    

    public static void main(String[] args) {
        Connection con = null;
        try {
            con = DriverManager.getConnection(dburl);

          //  JOptionPane.showMessageDialog(null, "يارب فك الضيقه");
        } catch (SQLException e) {
            e.printStackTrace();
        }

//  
//        hiring Welcome = new hiring(dbConncetion);
//            ApplicantDAL applicantDAL= new ApplicantDAL(con);
     EmployeeDAL employeeDAL=new EmployeeDAL(con);

        hiring welcome = new hiring(con,employeeDAL);
         ApplicantDAL applicantdAL=new ApplicantDAL(con);

        welcome.setVisible(true);

        
        // TODO code application logic here
    }

}

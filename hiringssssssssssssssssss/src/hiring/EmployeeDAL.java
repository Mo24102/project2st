/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiring;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

/**
 *
 * @author DreamPC
 */
public class EmployeeDAL {
    private Connection connected;
    public EmployeeDAL (Connection con){
        this.connected=con;
    }

    private static final String DB_URL = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";

    public Employee getEmployeeById(int employeeId) {
        Employee employee = new Employee();
        try (Connection conEpmloyee = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT * FROM tblEmployee WHERE EMPLOYEE_ID = ?";
            PreparedStatement statement = conEpmloyee.prepareStatement(query);
            statement.setInt(1, employeeId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("EMPLOYEE_ID"));
                employee.setusername(resultSet.getString("EMPLOYEE_UserName"));
                employee.setpassword(resultSet.getString("EMPLOYEE_Password"));
                resultSet.close();
                statement.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return employee;
    }

    public Employee login(String username, String password) {
        String query = "SELECT * FROM tblEmployee WHERE EMPLOYEE_UserName= ? AND EMPLOYEE_Password= ?";
        Employee employee = new Employee();
        try (Connection con = DriverManager.getConnection(DB_URL)) {
            PreparedStatement statement = connected.prepareStatement(query);
            statement = con.prepareStatement(query);
            statement.setString(1, username);
            statement.setString(2, password);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                employee.setId(resultSet.getInt("EMPLOYEE_ID"));
                employee.setusername(resultSet.getString("EMPLOYEE_Username"));
                employee.setpassword(resultSet.getString("EMPLOYEE_Password"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return employee;
    }
    public Employee getEmployeeByUserName(String user)  throws SQLException{
        Employee employee = null;
            String query = "SELECT * FROM tblEmployee WHERE EMPLOYEEUserName = ?";
            PreparedStatement statement = connected.prepareStatement(query);
            statement.setString(1, user);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                employee = new Employee();
                employee.setId(resultSet.getInt("EMPLOYEE_ID"));
                employee.setusername(resultSet.getString("EMPLOYEEUserName"));
                employee.setpassword(resultSet.getString("EMPLOYEEPassword"));
                
            }
        resultSet.close();
        statement.close();
        return employee;
    }
    public boolean CheckPass(String Pass) throws SQLException{
    boolean CheckPass = false ;
    String Query = "SELECT * FROM tblEmployee WHERE EMPLOYEEPassword = ? " ;
        try (Connection con = DriverManager.getConnection(DB_URL))
                {
                    PreparedStatement statement = con.prepareStatement(Query);
                    statement.setString(1, Pass);
                    ResultSet res = statement.executeQuery();
                    if (res.next()){
                  String storedpass = res.getString("EMPLOYEEPassword");
                  CheckPass = Pass.equals(storedpass);
                    }
                }
     
    catch (SQLException e) {
        e.printStackTrace();
    }
        return CheckPass;
                }
      public boolean checkUserName(String userName) throws SQLException{
    boolean CheckUserName = false ;
    String Query = "SELECT * FROM tblEmployee WHERE EMPLOYEEUserName = ? " ;
        try (Connection con = DriverManager.getConnection(DB_URL))
                {
                    PreparedStatement statement = con.prepareStatement(Query);
                    statement.setString(1, userName);
                    ResultSet res = statement.executeQuery();
                    if (res.next()){
                  String storedUserName = res.getString("EMPLOYEEUserName");
                  CheckUserName = userName.equals(storedUserName);
                    }
                }
     
    catch (SQLException e) {
        e.printStackTrace();
    }
        return CheckUserName;
                }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiring;

import com.sun.jdi.connect.spi.Connection;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DreamPC
 */
public class EmployeeBLL {

    private EmployeeDAL employeeDAL;
    private Connection con;

    public EmployeeBLL() {
//        employeeDAL = new EmployeeDAL();
    }

    public EmployeeBLL(EmployeeDAL employeeDAL) {
        this.employeeDAL = employeeDAL;
    }

    public Employee getEmployeeById(int employeeId) {
        
            return employeeDAL.getEmployeeById(employeeId);
       
    }
    public Employee getEmploeeByUserName (String user) throws SQLException{
        return employeeDAL.getEmployeeByUserName(user);
    }

    public Employee login(String username, String password)  {
        // Perform any business validations or checks here
        // ...
        Employee emp = new Employee();
        if(username != "" && password.length() > 5){
            emp =  employeeDAL.login(username, password);
        }
//        else{
//            JOptionPane.showMessageDialog(null, "BLL Error");
//        }
       
        return emp;
    }
     public boolean checkUserName(String userName) throws SQLException{
         return employeeDAL.checkUserName(userName);
     }
       public boolean CheckPass(String Pass) throws SQLException{
           return employeeDAL.CheckPass(Pass);
       }
       

}

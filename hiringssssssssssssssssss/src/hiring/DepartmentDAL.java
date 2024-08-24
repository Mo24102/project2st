/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiring;
    import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DreamPC
 */
public class DepartmentDAL {

   private static final String DB_URL = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";

   

    public void addDepartment(Department department) {
        try (Connection condepart = DriverManager.getConnection(DB_URL)){
      String query = "INSERT INTO department (id, name, company_id) VALUES (?, ?, ?)";
        PreparedStatement statement = condepart.prepareStatement(query);
        statement.setInt(1, department.getId());
        statement.setString(2, department.getName());
        statement.setString(3, department.getCompanyId());

        statement.executeUpdate();        
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public Department getDepartmentById(int id)  {
        Department department = new Department();
        try (Connection condepart = DriverManager.getConnection(DB_URL)){
               String query = "SELECT * FROM department WHERE id = ?";
        PreparedStatement statement = condepart.prepareStatement(query);
        statement.setInt(1, id);

        ResultSet resultSet = statement.executeQuery();
        if (resultSet.next()) {
            
            department.setId(resultSet.getInt("id"));
            department.setName(resultSet.getString("name"));
            department.setCompanyId(resultSet.getString("company_id"));   
        }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return department;
    }

    public List<Department> showALlDepartments() {
        List<Department> departments = new ArrayList<>();

        try( Connection concompany = DriverManager.getConnection(DB_URL)){
            String query = "SELECT * FROM department";
        PreparedStatement statement = concompany.prepareStatement(query);

        ResultSet resultSet = statement.executeQuery();
        while (resultSet.next()) {
            Department department = new Department();
            department.setId(resultSet.getInt("id"));
            department.setName(resultSet.getString("name"));
            department.setCompanyId(resultSet.getString("company_id"));

            departments.add(department);
        }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return departments;
    }

    public void updateDepartment(Department department) {
        try ( Connection concompany = DriverManager.getConnection(DB_URL)){
             String query = "UPDATE department SET name = ?, company_id = ? WHERE id = ?";
        PreparedStatement statement = concompany.prepareStatement(query);
        statement.setString(1, department.getName());
        statement.setString(2, department.getCompanyId());
        statement.setInt(3, department.getId());

        statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteDepartment(int id) {
        try( Connection concompany = DriverManager.getConnection(DB_URL)){
            String query = "DELETE FROM department WHERE id = ?";
        PreparedStatement statement = concompany.prepareStatement(query);
        statement.setInt(1, id);

        statement.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

    


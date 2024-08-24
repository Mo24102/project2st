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

public class CompanyDAL {
    private Connection con;
    
   public CompanyDAL(Connection con){
       this.con=con;
   }

    private static final String DB_URL = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";

    public void AddCompany(Company company) {
        try (Connection concompany = DriverManager.getConnection(DB_URL)) {
            String query = "INSERT INTO tblCompany(COMPAYRef,COMPAYName,COMPAYLocation,COMPAYEmail,COMPAYURL) VALUES (?,?,?,?,?)";
            PreparedStatement statement = concompany.prepareStatement(query);
            statement.setString(1, company.getRef());
            statement.setString(2, company.getName());
            statement.setString(3, company.getLocation());
            statement.setString(4, company.getEmail());
            statement.setString(5, company.getUrl());
          //  statement.setInt(6, company.getEmployeeId());
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public List<Company> showAllCompanies() {

        List<Company> Companys = new ArrayList<>();
        try (Connection concompany = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT * FROM Company";
            PreparedStatement statement = concompany.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Company company = new Company();
                company.setRef(resultSet.getString("COMPAYRef"));
                company.setName(resultSet.getString("COMPAYName"));
                company.setLocation(resultSet.getString("COMPAYLocation"));
                company.setEmail(resultSet.getString("COMPAYEmail"));
                company.setUrl(resultSet.getString("COMPAYURL"));
                //company.setEmployeeId(resultSet.getInt("E-ID"));
                Companys.add(company);
                resultSet.close();
                statement.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

        return Companys;
    }

    public Company ShowCompanyById(String ref) {
        Company company = new Company();
        try (Connection concompany = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT * FROM tblCompany WHERE COMPAYRef = ?";
            PreparedStatement statement = concompany.prepareStatement(query);
            statement.setString(1, ref);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                company = new Company();
                company.setRef(resultSet.getString("COMPAYRef"));
                company.setName(resultSet.getString("COMPAYName"));
                company.setLocation(resultSet.getString("COMPAYLocation"));
                company.setEmail(resultSet.getString("COMPAYEmail"));
                company.setUrl(resultSet.getString("COMPAYURL"));
                //company.setEmployeeId(resultSet.getInt("E-ID"));
                resultSet.close();
                statement.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return company;
    }

    public void updateCompany(Company company)  {
        try (Connection concompany = DriverManager.getConnection(DB_URL)){
               String query = "UPDATE tblCompany SET COMPAYName = ? , COMPAYLocation= ? ,COMPAYEmail=? ,COMPAYURL =?  WHERE COMPAYRef = ?";
        PreparedStatement statement = concompany.prepareStatement(query);
        statement.setString(1, company.getName());
        statement.setString(2, company.getLocation());
        statement.setString(3, company.getEmail());
        statement.setString(4, company.getUrl());
        statement.setString(5, company.getRef());
        statement.executeUpdate();
        statement.close();
        
            
        } catch (Exception e) {
    e.printStackTrace();
        }
    }
        

    public void deleteCompany(String companyRef){
        try (Connection concompany = DriverManager.getConnection(DB_URL)){
              String query = "DELETE FROM tblCompany WHERE COMPAYRef = ?";
        PreparedStatement statement = concompany.prepareStatement(query);
        statement.setString(1, companyRef);
        statement.executeUpdate();
        statement.close();
        }catch (Exception e) {
            e.printStackTrace();
        }
    }
       public static boolean isCompanyIdisValid(String Ref) {
        boolean checker = false;
        String query = "SELECT * FROM tblCompany WHERE COMPAYRef = ?";
        try ( Connection conn = DriverManager.getConnection(DB_URL)) {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setString(1, Ref);
            ResultSet resultSet = statement.executeQuery();
            checker = resultSet.next();
            return checker;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checker;
    }

    
        

}

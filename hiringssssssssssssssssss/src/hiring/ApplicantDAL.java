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

/**
 *
 * @author DreamPC
 */
public class ApplicantDAL {
    private Connection con;
    Applicant applicant;
    
    public ApplicantDAL(Connection con){
        this.con=con;
    }

    private static final String DB_URL = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";

    public void addApplicant(Applicant applicant) throws SQLException {
        
            String query = "INSERT INTO tblApplicant (APPLICANTID, APPLICANTFullName,APPLICANTCity,APPLICANTEmail,APPLICANTJobType) VALUES (?,?,?,?,?)";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, applicant.getId());
            statement.setString(2, applicant.getName());
            statement.setString(3, applicant.getCity());
            statement.setString(4, applicant.getEmail());
//            statement.setString(5, applicant.getCv());
            statement.setString(5, applicant.getJob());
            statement.executeUpdate();
            statement.close();
        
    }
    
    public ResultSet showallApplicants() {
        ResultSet resultSet = null;
        try {
        String query = "SELECT * FROM Applicant";
            PreparedStatement statement = con.prepareStatement(query);
            resultSet = statement.executeQuery();
            return resultSet;
            } catch (Exception e) {
                
       e.printStackTrace(); } 
            return resultSet;
}
        //try {
//            String url = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";
//            concApplicant = DriverManager.getConnection(url);
//            JOptionPane.showMessageDialog(null,"a7aaaa");
//        stApplicant= concApplicant.createStatement();
//        ResultSet res = stApplicant.executeQuery("select * from tblApplicant");
//            
//            jTable1Applicant.setModel(DbUtils.resultSetToTableModel(res));
//            
//        } catch (Exception e) {
//       e.printStackTrace(); } 

//        try (Connection con = DriverManager.getConnection(DB_URL)) {
//            String query = "SELECT * FROM Applicant";
//            PreparedStatement statement = con.prepareStatement(query);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                Applicant applicant = new Applicant();
//                applicant.setId(resultSet.getInt("APPLICANT_ID"));
//                applicant.setName(resultSet.getString("APPLCIANT_Name"));
//                applicant.setPhone(resultSet.getString("APPLICANT_Mobile"));
//                applicant.setEmail(resultSet.getString("APPLICANT_Email"));
//                applicant.setCv(resultSet.getString("APPLICANT_CV"));
//                applicants.add(applicant);
//                resultSet.close();
//                statement.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//    public List<Applicant> showallApplicants() {
//        List<Applicant> applicants = new ArrayList<>();
//        //try {
////            String url = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";
////            concApplicant = DriverManager.getConnection(url);
////            JOptionPane.showMessageDialog(null,"a7aaaa");
////        stApplicant= concApplicant.createStatement();
////        ResultSet res = stApplicant.executeQuery("select * from tblApplicant");
////            
////            jTable1Applicant.setModel(DbUtils.resultSetToTableModel(res));
////            
////        } catch (Exception e) {
////       e.printStackTrace(); } 
//
//        try (Connection con = DriverManager.getConnection(DB_URL)) {
//            String query = "SELECT * FROM Applicant";
//            PreparedStatement statement = con.prepareStatement(query);
//            ResultSet resultSet = statement.executeQuery();
//            while (resultSet.next()) {
//                Applicant applicant = new Applicant();
//                applicant.setId(resultSet.getInt("APPLICANT_ID"));
//                applicant.setName(resultSet.getString("APPLCIANT_Name"));
//                applicant.setPhone(resultSet.getString("APPLICANT_Mobile"));
//                applicant.setEmail(resultSet.getString("APPLICANT_Email"));
//                applicant.setCv(resultSet.getString("APPLICANT_CV"));
//                applicants.add(applicant);
//                resultSet.close();
//                statement.close();
//            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        return applicants;
//    }

    public Applicant ShowApplicantById(int applicantId) {
        Applicant applicant = new Applicant();
        try (Connection con = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT * FROM tblApplicant WHERE APPLICANTID = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, applicantId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {

                applicant.setId(resultSet.getInt("APPLICANTID"));
                applicant.setName(resultSet.getString("APPLICANTFullName"));
                applicant.setCity(resultSet.getString("APPLICANTCity"));
                applicant.setEmail(resultSet.getString("APPLICANTEmail"));
                applicant.setJob(resultSet.getString("APPLICANTJobType"));
                
             //   applicant.setCv(resultSet.getString("APPLICANTCV"));
                resultSet.close();
                statement.close();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return applicant;
    }

    public void updateApplicant(Applicant applicant) {
        try (Connection con = DriverManager.getConnection(DB_URL)) {
            String query = "UPDATE tblApplicant SET APPLICANTFullName= ?, APPLICANTCity= ?, APPLICANTJobType= ?,APPLICANTEmail= ? ,APPLICANTCV = ?   WHERE APPLICANTID= ?";
            PreparedStatement statement = con.prepareStatement(query);
            
            
            statement.setString(1, applicant.getName());
            statement.setString(2, applicant.getCity());
            statement.setString(3, applicant.getJob());
            statement.setString(4, applicant.getEmail());
            statement.setString(5, applicant.getCv());
            statement.setInt(6, applicant.getId());
            statement.executeUpdate();
            statement.close();

        } catch (Exception e) {
            e.printStackTrace();

        }
    }

    public void deleteApplicant(int applicantId) {
        try (Connection con = DriverManager.getConnection(DB_URL)) {
            String query = "DELETE FROM tblApplicant WHERE APPLICANTID = ?";
            PreparedStatement statement = con.prepareStatement(query);
            statement.setInt(1, applicantId);
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
       public static boolean isApplicantIDValid(int id) {
        boolean checker = false;
        String query = "SELECT * FROM tblApplicant WHERE APPLICANTID = ?";
        try ( Connection conn = DriverManager.getConnection(DB_URL)) {
            PreparedStatement statement = conn.prepareStatement(query);
            statement.setInt(1, id);
            ResultSet resultSet = statement.executeQuery();
            checker = resultSet.next();
            return checker;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return checker;
    }


}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiring;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author DreamPC
 */
public class RequestDAL {

       private static final String DB_URL = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";

    
    public void enrollApplicantInJob(int applicantId, int jobId)  {
       try(Connection conrequest= DriverManager.getConnection(DB_URL)){
           String sql = "INSERT INTO Request (APPLICANT_ID, JOB_ID) VALUES (?, ?)";
         PreparedStatement statement = conrequest.prepareStatement(sql) ;
            statement.setInt(1, applicantId);
            statement.setInt(2, jobId);
            statement.executeUpdate();
       }catch(SQLException e){
           e.printStackTrace();
           
        }
    }

  public List<Request> getRequestsByApplicant(int applicantId) {
    List<Request> requests = new ArrayList<>();

    try (Connection conrequest = DriverManager.getConnection(DB_URL)) {
        String sql = "SELECT * FROM Request WHERE APPLICANT_ID = ?";
        PreparedStatement statement = conrequest.prepareStatement(sql);
        statement.setInt(1, applicantId);
        ResultSet resultSet = statement.executeQuery();

        while (resultSet.next()) {
            int id = resultSet.getInt("enrollment_id");
            int jobId = resultSet.getInt("APPLICANT_ID");

            Request request = new Request(); // Create a new Request object for each row
            // Set properties of the request object using data from the result set
            request.setId(id);
            request.setJobId(jobId);

            requests.add(request);
        }
    } catch (Exception e) {
        e.printStackTrace();
    }

    return requests;
}


public List<Request> getRequestsByJobId(int jobId) {
    List<Request> requests = new ArrayList<>();
    
    try (Connection conrequest = DriverManager.getConnection(DB_URL)) {
        String sql = "SELECT * FROM Request WHERE JOB_ID = ?";
        PreparedStatement statement = conrequest.prepareStatement(sql);
        statement.setInt(1, jobId);
        ResultSet resultSet = statement.executeQuery();
        
        while (resultSet.next()) {
            int id = resultSet.getInt("REQUEST_ID");
            int applicantId = resultSet.getInt("APPLICANT_ID");
            Request request = new Request(id, jobId, applicantId);
            requests.add(request);
        }
    } catch (SQLException e) {
        e.printStackTrace();
    }
    
    return requests;
}
 
    public void withdrAwapplicantFromJob(int applicantId, int jobId) {
        try(Connection conrequest = DriverManager.getConnection(DB_URL)){
        String sql = "DELETE FROM Request WHERE APPLICANT_ID= ? AND JOB_ID= ?";
         PreparedStatement statement = conrequest.prepareStatement(sql) ;
            statement.setInt(1, applicantId);
            statement.setInt(2, jobId);
            statement.executeUpdate();
        }catch(SQLException e ){
        e.printStackTrace();
        }
    }

}

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
public class JobDAL {

    private Connection con;

    public JobDAL(Connection con) {
        this.con = con;
    }

    private static final String DB_URL = "jdbc:ucanaccess://E:/REC-AGENCY1.accdb";

    public void addJob(Job job) {
        try ( Connection conJob = DriverManager.getConnection(DB_URL)) {
            String query = "INSERT INTO tblJob (JOBID,JOBTitle,JOBSkill,JOBAvailable,C_Name) VALUES (?,? ,?, ?, ?)";
            PreparedStatement statement = conJob.prepareStatement(query);
            statement.setInt(1, job.getJOBID());
            statement.setString(2, job.getJOBTitle());
            statement.setString(3, job.getJOBSkill());
            statement.setInt(4, job.getJOBAvailable());
            statement.setString(5, job.getC_Name());

            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public List<Job> showAllJobs() {
        List<Job> Jobs = new ArrayList<>();
        try ( Connection conJob = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT * FROM tblJob";
            PreparedStatement statement = conJob.prepareStatement(query);
            ResultSet resultSet = statement.executeQuery();
            while (resultSet.next()) {
                Job job = new Job();
                job.setJOBID(resultSet.getInt("JOBID"));
                job.setJOBTitle(resultSet.getString("JOBTitle"));
                job.setJOBSkill(resultSet.getString("JOBSkill"));
                job.setJOBAvailable(resultSet.getInt("JOBAvailable"));
                job.setC_Name(resultSet.getString("C_Name"));
               
                Jobs.add(job);
                resultSet.close();
                statement.close();

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        return Jobs;
    }

    public Job showJobById(int jobId) {
        Job job = new Job();

        try ( Connection conJob = DriverManager.getConnection(DB_URL)) {
            String query = "SELECT * FROM tblJob WHERE JOBID = ?";
            PreparedStatement statement = conJob.prepareStatement(query);
            statement.setInt(1, jobId);
            ResultSet resultSet = statement.executeQuery();

            if (resultSet.next()) {
                job = new Job();
                job.setJOBID(resultSet.getInt("JOBID"));
                job.setJOBTitle(resultSet.getString("JOBTitle"));
                job.setJOBSkill(resultSet.getString("JOBSkill"));

                job.setJOBAvailable(resultSet.getInt("JOBAvailable"));
                job.setC_Name(resultSet.getString("C_Name"));
               
            }
            resultSet.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return job;
    }

    public void updateJob(Job job) {
        try ( Connection conJob = DriverManager.getConnection(DB_URL)) {
            String query = " UPDATE tblJob SET JOBTitle= ?, JOBSkill= ? ,JOBAvailable=? ,C_Name = ?  WHERE JOBID = ? ";
            PreparedStatement statement = conJob.prepareStatement(query);
            statement.setString(1, job.getJOBTitle());
            statement.setString(2, job.getJOBSkill());
            statement.setInt(3, job.getJOBAvailable());
            statement.setString(4, job.getC_Name());
            statement.setInt(5, job.getJOBID());
            
          
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void deleteJob(int jobId) {
        try ( Connection conJob = DriverManager.getConnection(DB_URL)) {
            String query = "DELETE FROM tblJob WHERE JOBID = ?";
            PreparedStatement statement = conJob.prepareStatement(query);
            statement.setInt(1, jobId);
            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
 public static boolean isJobIDValid(int id) {
        boolean checker = false;
        String query = "SELECT * FROM tblJob WHERE JOBID = ?";
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

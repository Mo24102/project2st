/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiring;
//import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author DreamPC
 */
public class JobBLL {
    private JobDAL jobdAL;
        public JobBLL(JobDAL jobDAL) {
        this.jobdAL = jobDAL;
    }

    public void addJob(Job job) {
        // Perform any business validations or checks here
        // ...

        
            jobdAL.addJob(job);
      
    }

    public List<Job> showAllJobs()  {
        
            return jobdAL.showAllJobs();
        
        
    }

    public Job showJobById(int jobId)  {
        
            return jobdAL.showJobById(jobId);
       
    }

    public void updateJob(Job job)  {
        // Perform any business validations or checks here
        // ...

       
            jobdAL.updateJob(job);
       
    }

    public void deleteJob(int jobId)  {
        // Perform any business validations or checks here
        // ...

       
            jobdAL.deleteJob(jobId);
       
    }
public static boolean isJobIDValid(int id) {
    // Perform the ID validation logic
    // Return true if the ID is valid, otherwise return false
    // You can customize the logic based on your requirements
    
    // Example validation: ID should be greater than 0
    return JobDAL.isJobIDValid(id);
}
       
    
}

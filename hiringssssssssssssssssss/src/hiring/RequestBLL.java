/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiring;
import java.sql.SQLException;
import java.util.List;
/**
 *
 * @author DreamPC
 */
public class RequestBLL {
    private RequestDAL requestDAL;

    public RequestBLL(RequestDAL requestDAL) {
        this.requestDAL = requestDAL;
    }

    public void enrollApplicantInJob(int applicantId, int jobId)  {
        // Perform any business validations or checks here
        // ...

        
            requestDAL.enrollApplicantInJob(applicantId, jobId);
       
    }

    public List<Request> getRequestsByApplicant(int applicantId)  {
        
            return requestDAL.getRequestsByApplicant(applicantId);
        
    }

    public List<Request> getRequestsByCourse(int jobId) {
        ///////////////////errorrrrrrr///
            return requestDAL.getRequestsByJobId(jobId);
       
    }

    public void withdrAwapplicantFromJob(int applicantId, int jobId)  {
        // Perform any business validations or checks here
        // ...

        
            requestDAL.withdrAwapplicantFromJob(applicantId, jobId);
       
    }
    
}

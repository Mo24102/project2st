/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiring;

/**
 *
 * @author DreamPC
 */
public class Request {

    private int id;
    private int jobId;
    private int applicantId;

    public Request() {
    }

    public Request(int id, int JobId, int appplicantId) {
        this.id = id;
        this.jobId = JobId;
        this.applicantId = appplicantId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getJobId() {
        return jobId;
    }

    public void setJobId(int jobId) {
        this.jobId = jobId;
    }

    public int getApplicantId() {
        return applicantId;
    }

    public void setApplicantId(int applicantId) {
        this.applicantId = applicantId;
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiring;

import javax.swing.JOptionPane;

public class Job {
    private int JOBID;
    private String JOBTitle;
    private String JOBSkill;
   
    private int JOBAvailable;
    private String C_Name;
   private int D_ID ;
    

    public Job() {
    }

    public Job(int JOBID, String JOBTitle, String JOBSkill, int JOBAvailable, String C_Name) {
        this.JOBID = JOBID;
        this.JOBTitle = JOBTitle;
        this.JOBSkill = JOBSkill;
        this.JOBAvailable = JOBAvailable;
        this.C_Name = C_Name;
    }



    public Job(int JOBID, String JOBTitle, String JOBSkill, int JOBAvailable, String C_Name, int D_ID) {
        this.JOBID = JOBID;
        this.JOBTitle = JOBTitle;
        this.JOBSkill = JOBSkill;
        this.JOBAvailable = JOBAvailable;
        this.C_Name = C_Name;
        this.D_ID = D_ID;
    }

    public Job(int D_ID) {
        this.D_ID = D_ID;
    }

    public void setD_ID(int D_ID) {
        this.D_ID = D_ID;
    }

    public int getJOBID() {
        return JOBID;
    }

    public void setJOBID(int JOBID) {
        this.JOBID = JOBID;
    }

    public String getJOBTitle() {
        return JOBTitle;
    }

    public void setJOBTitle(String JOBTitle) {
        this.JOBTitle = JOBTitle;
    }

    public String getJOBSkill() {
        return JOBSkill;
    }

    public void setJOBSkill(String JOBSkill) {
        this.JOBSkill = JOBSkill;
    }



    public int getJOBAvailable() {
        return JOBAvailable;
    }

    public void setJOBAvailable(int JOBAvailable) {
        this.JOBAvailable = JOBAvailable;
    }

    public String getC_Name() {
        return C_Name;
    }

    public void setC_Name(String C_Name) {
        this.C_Name = C_Name;
    }

    public int getD_ID() {
        return D_ID;
    }



}
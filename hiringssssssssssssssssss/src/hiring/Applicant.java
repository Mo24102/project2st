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
public class Applicant {

    private int id;
    private String name;
    private String email;
   
    private String job;
    private String cv;
    private String city;

    public Applicant() {
    }

    Applicant(int id, String name, String Email, String cv ,String Job,String city) {
        this.id=id;
        this.name=name;
        this.email=Email;
        this.cv=cv;
        this.job=Job;
        this.city=city;
    }
    

    public Applicant(int id) {
        this.id = id;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCv() {
        return cv;
    }

    public void setCv(String cv) {
        this.cv = cv;
    }
}



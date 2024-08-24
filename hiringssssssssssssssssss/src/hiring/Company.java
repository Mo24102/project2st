/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package  hiring;

/**
 *
 * @author DreamPC
 */
public class Company {

    private String Ref;
    private String name;
    private String location;
    private String email;
    private String url;
    private int employeeId;
        
    public Company() {
    }

    public Company(String Ref) {
        this.Ref = Ref;
    }

    public Company(String Ref, String Name, String location, String email, String url) {
        this.Ref = Ref;
        this.name = Name;
        this.location = location;
        this.email = email;
        this.url = url;
    }
    

    public String getRef() {
        return Ref ;
    }

    public void setRef(String Ref) {
        this.Ref = Ref;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUrl() {
        return url;
    }

 

    public void setUrl(String url) {
        this.url = url;
    }

    public int getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }
}



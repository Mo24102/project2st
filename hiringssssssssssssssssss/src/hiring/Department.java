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

public class Department {
    private int id;
    private String name;
    private String companyId;

    public Department(int id, String name, String companyId) {
        this.id = id;
        this.name = name;
        this.companyId = companyId;
    }

    public Department() {
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

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }
}

    




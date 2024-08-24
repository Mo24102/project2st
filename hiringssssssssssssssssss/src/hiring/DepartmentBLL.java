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
public class DepartmentBLL {

    private DepartmentDAL departmentDAL;

    public DepartmentBLL(DepartmentDAL departmentDAL) {
        this.departmentDAL = departmentDAL;
    }

    public void addDepartment(Department department) {
        // Perform any business validations or checks here
        // ...

     
            departmentDAL.addDepartment(department) ;
      
    }

    public Department getDepartmentById(int id)  {
        
            return departmentDAL.getDepartmentById(id);
       
    }

    public List<Department> getAllDepartments()  {
    
            return departmentDAL.showALlDepartments();
      
        
    }

    public void updateDepartment(Department department) throws BusinessException {
        // Perform any business validations or checks here
        // ...

       
            departmentDAL.updateDepartment(department);
       
        
    }

    public void deleteDepartment(int id) throws BusinessException {
        // Perform any business validations or checks here
        // ...

     
            departmentDAL.deleteDepartment(id);
       
    }
}

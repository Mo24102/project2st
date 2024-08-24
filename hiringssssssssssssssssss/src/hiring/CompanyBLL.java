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
public class CompanyBLL {
    private CompanyDAL companyDAL;    
        public CompanyBLL(CompanyDAL companyDAL) {
        this.companyDAL = companyDAL;
    }
            public void AddCompany(Company company)  {
        // Perform any business validations or checks here
        // ...
            companyDAL.AddCompany(company);
      
    }


    public List<Company> showAllCompanies(String ref){
     
            return companyDAL.showAllCompanies();
        
    }

    public Company  ShowCompanyById(String companyId)  {
        
            return companyDAL.ShowCompanyById(companyId);
        }
    

    public void updateCompany(Company company) {
        // Perform any business validations or checks here
        // ...

            companyDAL.updateCompany(company);
           
    }

    public void deleteCompany(String Ref)  {
        // Perform any business validations or checks here
        // ...

   
            companyDAL.deleteCompany(Ref);
     
}
       public boolean isCompanyIdisValid(String Ref){
        return companyDAL.isCompanyIdisValid(Ref);
    }
}


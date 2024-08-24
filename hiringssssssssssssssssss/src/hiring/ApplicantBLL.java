/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hiring;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import javax.swing.JOptionPane;

/**
 *
 * @author DreamPC
 */
public class ApplicantBLL {
    private ApplicantDAL applicantDAL;
    private  Applicant applicant;
     String msg = "Invalid";

    public ApplicantBLL(ApplicantDAL applicantDAL) {
        this.applicantDAL = applicantDAL;
    }

//   public ApplicantBLL() {
//    }

     public void addApplicant(Applicant applicant) throws SQLException {
//           
//        // Perform validation
//          try {
//              if (isValidApplicant(applicant)){
//              applicantDAL.addApplicant(applicant);
//              JOptionPane.showMessageDialog(null, "add is done");
//              
//              }else {
//              JOptionPane.showMessageDialog(null, msg);
//              }
//                
//           } catch (SQLException e) {
//           }
////validateApplicant(applicant);
        
        // Call the DAL method to add the applicant
       applicantDAL.addApplicant(applicant);
    }

        // Perform any business validations or checks here
        // ...
//        try {
//            if(isValidApplicant(applicant)){
//                applicantDAL.addApplicant(applicant);
//                JOptionPane.showMessageDialog(null, "Add success");
//            }
//            else {
////            JOptionPane.showMessageDialog(null, "Invalid");
//        }
//        }
// 
//catch (Exception e) {
//        }
//        applicantDAL.addApplicant(applicant);
//           if(applicant.getEmail().contains("@") || applicant.getId()!=""){
//            applicantDAL.addApplicant(applicant);
//             }
//             else{
//                 JOptionPane.showMessageDialog(null,"Email must contain @");
//             }
       
    

    public ResultSet ShowAllApplicants() {
       
            return applicantDAL.showallApplicants();
       
    }

    public Applicant ShowApplicantById(int applicantId)  {
      
            return applicantDAL.ShowApplicantById(applicantId);
      
    }

    public void updateApplicant(Applicant applicant)  {
        applicantDAL.updateApplicant(applicant);

      
    }
    

    public void deleteApplicant(int applicantId) throws BusinessException {
        // Perform any business validations or checks here
        // ...

   
            applicantDAL.deleteApplicant(applicantId);
        
        
    }
//    public  boolean isValidApplicant(Applicant applicant){
//        boolean flag = true;
////         String msg = "Invalid";
//         String ID = Integer.toString(applicant.getId());
//        try {
//            if(applicant.getId() == 0 || !(ID.length()>=5 && ID.length()<=8 || !(ID.matches("\\d+") || ID.isEmpty()) ) ){
//               msg +=" ID ";
//            }
//            if(applicantDAL.ShowApplicantById(applicant.getId())!= null){
//                msg +="  and cannot equal null";
//               
//            }
//        } catch (Exception e) {
//            e.printStackTrace();    
//        }
//        if(applicant.getName()==null || applicant.getName().isEmpty()){
//            msg+=" Name not null ";
//        }
//        if(applicant.getName()!=null){
//            for (int i = 0; i < applicant.getName().length(); i++) {
//               char ch = applicant.getName().charAt(i);
//               if(!((ch >='a' && ch<='z')|| (ch >='A' && ch <='Z')|| (ch == ' '))){
//                   msg += " Name must be character  ";
//                   JOptionPane.showMessageDialog(null, "");
//                    flag = false;
//               }
//            }
//        }
//        
//        return flag;
//    }
//    
//    
     private boolean isIdValid(int id) {
    // Perform the ID validation logic
    // Return true if the ID is valid, otherwise return false
    // You can customize the logic based on your requirements
    
    // Example validation: ID should be greater than 0
    return id > 0;
}
        public  boolean isApplicantIDValid(int id){
        return applicantDAL.isApplicantIDValid(id);
    }
    
}

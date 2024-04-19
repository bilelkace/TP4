/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

import java.util.List;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 *
 * @author Bilel
 */
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class StaffMember extends User {

 private String qualification ;
 private Integer experience ;
 private List<String> tasks ;

    public StaffMember(String firstName, String lastName, String email, Long cin,String qualification, Integer experience, List<String> tasks ) {
        super(firstName, lastName, email, cin);
        this.qualification = qualification;
        this.experience = experience;
        this.tasks = tasks;
    }
 
 
 
   @Override
     public String displayInfo(){
         for (String task : tasks){return(task);}
      return (super.displayInfo()+"qualification"+this.qualification + "experience"+this.experience );
    }
     
   public void updateProfile(String firstName ,String lastName ,String email , Long cin , String qualification ,Integer experience ,List<String> tasks){
       super.updateProfile(firstName, lastName, email, cin);
        this.qualification = qualification ;
       this.experience = experience ;
       this.tasks = tasks ;   
       
   } ;
   
   
    @Override
   public boolean authenticate(){ return super.authenticate();
}
   
    public void finishTask(String task){
       if (tasks.remove(task)) {
            System.out.println("Task removed successfully.");
        } else {
            System.out.println("Tasknot found in the list."); }
    }
}

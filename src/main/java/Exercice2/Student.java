/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercice2;

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

public class Student extends User{ 
    private Double average;
    private Classe classe ; 
    private Status status ;

    public Student(String firstName, String lastName, String email, Long cin, Double average, Classe classe, Status status) {
        super(firstName, lastName, email, cin);
        this.average = average;
        this.classe = classe;
        this.status = status;
    }

    
    
    @Override
     public String displayInfo(){
      return (super.displayInfo()+"average"+this.average + "classe"+this.classe +"status"+this.status);
    }
     
   public void updateProfile(String firstName ,String lastName ,String email , Long cin , Double average ,Classe classe , Status status){
       super.updateProfile(firstName, lastName, email, cin);
        this.average = average ;
       this.classe = classe ;
       this.status = status ;   
       
   } ;
   
   
    @Override
   public boolean authenticate(){ return super.authenticate();
}
    
    
}

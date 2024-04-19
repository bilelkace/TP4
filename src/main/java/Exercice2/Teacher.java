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
public class Teacher extends User {
    private Long hIndex ;
    private List<Course> courses ;

    

    public Teacher(String firstName, String lastName, String email, Long cin,Long hIndex, List<Course> courses ) {
        super(firstName, lastName, email, cin);
        this.hIndex = hIndex;
        this.courses = courses;
    }

    
    
    
     @Override
     public String displayInfo(){
         for (Course course : courses){System.out.println(course.getName());}
      return (super.displayInfo()+"hIndex"+this.hIndex );
     }
     
   public void updateProfile(String firstName ,String lastName ,String email , Long cin ,Long hIndex ,List<Course> courses){
       super.updateProfile(firstName, lastName, email, cin);
        this.hIndex = hIndex ;
       this.courses = courses ;
          
       
   } ;
   
   
    @Override
   public boolean authenticate(){ return super.authenticate();
}
   public void displayCoursesContent(){
       for (Course course : courses){
           System.out.println(course.getName());
           for (String content :course.getContents()){
               System.out.println(content) ;
           }
           
       }
   }
}

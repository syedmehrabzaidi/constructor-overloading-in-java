/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constractor_1;

class student{

    String name;
    String email;
    int age;
    
 student(String n, String e, int a){

    name = n;
    email =e;
    age = a;
    
}    
    

}

/**
 *
 * @author amanlab02
 */
public class Constractor_1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
   student s1 = new student("mehrab","mehrab",20);
 
   s1.name = "Abc";
   
    s1.email = "abc";
    s1.age = 20;
  
   
        System.out.println("name" +s1.name);
         System.out.println("email" +s1.email);
        System.out.println("age" +s1.age);
       


        
    
    }
    
}

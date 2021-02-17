/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package constructor_book;


class book{
    int id;    
    String name;
    String Title;    
    String Author;
    int pages;
       //           OPtional
          String category; 
          String Edition;
          
book( int id1,String name1, String Title1, String Author1 ,int pages1,String category1,String Edition1 ){
    id= id1;
    name=name1;
    Title= Title1;
    Author= Author1;
    pages=pages1;
    category=category1; 
    Edition= Edition1;
             
          }

book( int id,String name, String Title, String Author,int pages ){
 this.id= id;
 this.name=name;
 this.Title= Title;
 this.Author= Author;
 this.pages=pages;
  
             
          }

void print(){
    System.out.println("id:   "+id);     
    System.out.println("name:  "+name);
    System.out.println("Title:  "+Title);
    System.out.println("Author: "+Author);
    System.out.println("pages  :"+pages);
    System.out.println("category: "+category);
    System.out.println("Edition  :" +Edition);
    
       

 
}
}
/**
 *
 * @author amanlab02
 */
public class Constructor_Book {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       book b = new book(5,"achi_book","Zabardt","author_me_hun",100,"ajeeb","2nd");
       book b1 = new book(10,"achi_book1","Zabardt","author_me_hun",200);
        
       b.print();
//         book b = new book(5,"achi_book","Zabardt","author_me_hun",100,"ajeeb","2nd");
//          book b1 = new book(5,"achi_book1","Zabardt","author_me_hun",200);
          
          
          
    
        
    }
    
}

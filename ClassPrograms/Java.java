
package textbook;
public class Java{
 public String author;
 public int edition;
 public Java(String author, int edition){
  this.author=author;
  this.edition=edition;
 }
 
 public void displayBook(){
  System.out.println("Book Details are:\nAuthor:"+author+"\nEdition:"+edition);
 }
 
 
}
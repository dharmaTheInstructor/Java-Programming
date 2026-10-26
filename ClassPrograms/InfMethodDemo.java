// static and default methods in interface

interface IntfOne{
  void display(); //abstract methods
  static void show(int x) // static method
  {
    System.out.println("Static Method X:"+x);
  }
  default int printVal() // default method
  {
   return 1216;
  }    
}

class Child implements IntfOne{
 void printData(){
  System.out.println("Method from Child class....!");
 }
 //Iterface method display
 public void display(){
  System.out.println("Abstract method overrided...!");
 }
}

public class InfMethodDemo{
 public static void main(String args[]){
  Child c=new Child();
  IntfOne.show(12);
  System.out.println("Retrun Method Value:"+c.printVal());
  c.printData();
  c.display();
 }
}


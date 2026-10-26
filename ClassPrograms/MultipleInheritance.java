//achive multiple inheritance using interface

interface IntfOne{
 void display();
}
interface IntfTwo{
 void show();
}
interface IntfThree{
 void printVal();
}
class Child implements IntfOne,IntfTwo,IntfThree{
 //method from IntfOne
  public void display(){
   System.out.println("Interface One Method....!");
  }
  //method from IntfTwo
  public void show(){
   System.out.println("Interface Two Method....!");
  }
  //method from IntfThree
  public void printVal(){
   System.out.println("Interface Three Method....!");
  }
  //child class method
  void printData(){
   System.out.println("Child class Method....!");
  }
}

public class MultipleInheritance{
 public static void main(String args[]){
  Child c=new Child();
  c.display();
  c.show();
  c.printVal();
  c.printData();
 }
}
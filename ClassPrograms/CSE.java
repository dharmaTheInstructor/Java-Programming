
package gmrit;
public class CSE{
	     public int rollno;
		 public float percentage;
		 public String stdName;
		 public CSE(int rollno,float percentage,String stdName){
		  this.rollno=rollno;
		  this.percentage=percentage;
		  this.stdName=stdName;
		 }
		  public void displayData(){
		   System.out.println("Student Details are:\nRollNo:"+rollno+"\nPercentage:"+percentage+"\nStudent Name:"+stdName);
		 }
	  }
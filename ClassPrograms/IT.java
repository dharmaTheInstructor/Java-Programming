
package gmrit;
public class IT{
	     public int rollno;
		 public float percentage;
		 public String stdName;
		 public IT(int rollno,float percentage,String stdName){
		  this.rollno=rollno;
		  this.percentage=percentage;
		  this.stdName=stdName;
		 }
		 public void displayITData(){
		   System.out.println("IT Student Details are:\nRollNo:"+rollno+"\nPercentage:"+percentage+"\nStudent Name:"+stdName);
		 }
	  }
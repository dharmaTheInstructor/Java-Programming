// Vector 

import java.util.*;
public class VectorDemo{
 public static void main(String argw[]){
   Vector v=new Vector();
   
   v.add(1216);
   v.add("GMRIT");
   System.out.println("Size of Vector="+v.size());
   System.out.println("Vector Elements:");
   //for(int i=0;i<v.size();i++)
	   System.out.println(v);
   
   v.add(1212);v.add(1245);v.add(1228);
   System.out.println("Size of Vector="+v.size());
   
   v.remove(2);
   System.out.println("Size of Vector="+v.size());
 }
}
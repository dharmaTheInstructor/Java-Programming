// StringTokenizer

import java.util.*;
public class STDemo{
 public static void main(String args[]){
 Scanner sc=new Scanner(System.in);
 String str=sc.nextLine();
 
 StringTokenizer st=new StringTokenizer(str);
 System.out.println("List of Tokens are:");
 while(st.hasMoreTokens()){
  System.out.println(st.nextToken());
 }
 
 StringTokenizer st1=new StringTokenizer(str,",");
 System.out.println("List of Tokens are:");
 while(st1.hasMoreTokens()){
  System.out.println(st1.nextToken());
 }
 
 StringTokenizer st2=new StringTokenizer(str,",",true);
 System.out.println("List of Tokens are:");
 while(st2.hasMoreTokens()){
  System.out.println(st2.nextToken());
 }
}
}
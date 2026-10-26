// Create a Dynamic Array using List Interface

import java.util.*;

public class ListCollDemo{
 public static void main(String args[]){
  List<String> lt=new ArrayList<>();
  
  lt.add("CSE");
  System.out.println("Size of an ArrayList="+lt.size());
  System.out.println("Array List Elements are:");
  for(String s:lt)
   System.out.println(s);
  lt.add("AIML");
  lt.add("AIDS");
  lt.add("IT");
  System.out.println("Size of an ArrayList="+lt.size());
  System.out.println("Array List Elements are:");
  for(String s:lt)
   System.out.println(s);

  lt.remove("IT");
   System.out.println("Array List Elements are:");
  for(String s:lt)
   System.out.println(s);
System.out.println("Size of an ArrayList="+lt.size());
 }
} 

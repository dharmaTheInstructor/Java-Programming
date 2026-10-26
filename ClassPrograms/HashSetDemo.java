// HashSet class from Set Interface

import java.util.*;
public class HashSetDemo{
 public static void main(String args[]){
  HashSet<Integer> hs=new HashSet<>();
  System.out.println("Size of HashSet="+hs.size());
  
  hs.add(1216);
  System.out.println("Size of HashSet="+hs.size());
  System.out.println("HashSet Elements are:");
  System.out.println(hs);
  
  hs.add(1212);hs.add(1228);hs.add(1245);
   System.out.println("Size of HashSet="+hs.size());
  System.out.println("HashSet Elements are:");
  System.out.println(hs);
  
  hs.remove(1245);
    System.out.println("Size of HashSet="+hs.size());
  System.out.println("HashSet Elements are:");
  System.out.println(hs);
 }
}
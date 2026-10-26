//HashTable

import java.util.*;
public class HashTableDemo{
 public static void main(String args[]){
  Hashtable<Integer,String> hs=new Hashtable<>();
  
  hs.put(1216,"ABC");
  System.out.println("HashTable Elements are:");
  System.out.println(hs);
  hs.put(1228,"XYZ");
  hs.put(1212,"PQR");
  hs.put(1245,"UVW");
  System.out.println("HashTable Elements are:");
  System.out.println(hs);
  System.out.println("Element at 1212 key:"+hs.get(1212));
  
 }
}


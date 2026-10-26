
import java.util.*;
public class ArrayToAL{
 public static void main(String args[]){
   int arr[]={12,16,28,45,6};
   ArrayList<Integer> al=new ArrayList<>();
   
   for(int i:arr){
    al.add(i);
   }
   
   System.out.println("ArrayList Elements are:");
   System.out.println(al);
   al.remove(3);
    System.out.println("ArrayList Elements are:");
   System.out.println(al);
 }
}
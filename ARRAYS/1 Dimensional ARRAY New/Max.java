import java.util.*;
public class Max{
   public static int MaxNumber(int num[]){
      int largest=Integer.MIN_VALUE;
      for(int i=0;i<=num.length-1;i++){
        if(num[i]>largest){
           largest=num[i];
         }
      }
      return largest;
   }
   public static void main(String args[]){
     int num[]={11,65,78,99,1000,899,3078,400};
     int large=MaxNumber(num);
     System.out.println(large+" is the Largest Value Among the Array");
   }
   
}
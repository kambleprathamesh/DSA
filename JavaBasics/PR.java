import java.util.*;
public class PR{
  public static boolean prime(int n){
    boolean isPrime=true;
       int i=2;
       for(i=2;i<=n-1;i++){ 
         if(n%i==0){
           isPrime=false;
           break;
         }
       
       }
     return isPrime;
   }
   public static void main(String args[]){
     
     System.out.print(prime(5));
   }
} 
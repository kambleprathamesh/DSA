import java.util.*;
public class primeno{
  public static boolean prime(int n){
    if(n==2){
       isPrime=true;
    }else{
       int i=2;
       boolean isPrime=true;
       for(i=2;i<=n-1;i++){ 
         if(n%i==0){
           isPrime=false;
           break;
         }return isprime;
       
       }
     }
   }
   public static void main(String args[]){
     boolean result=prime(3);
     System.out.print(result);
   }
} 
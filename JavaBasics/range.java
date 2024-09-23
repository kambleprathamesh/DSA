import java.util.*;
public class range{
  public static void main(String args[]){
    PrimeRange(10); 
  }
  public static boolean prime(int n){
    boolean result=true;
    if(n==2){
      result=true;
    }else{ 
         int i=2;
         for(i=2;i<=n-1;i++){
           if(n%i==0){
             result=false;
             break;
           }
         }
    }return result;
  }
  public static void PrimeRange(int b){
    int i=2;
    while(i<=b){
      if(prime(i)){
        System.out.print(i);       
      }i++;
    }
  }
}
   
     
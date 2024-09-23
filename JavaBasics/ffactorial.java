import java.util.*;
public class ffactorial{ 

     public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number A: ");
       int a=sc.nextInt(); 
       //System.out.print("Enter a number B: ");
       //int b=sc.nextInt();
       //int result=binCoffe(a,b);
       System.out.print(prime(a));      
    }
     
     public static boolean prime(int n){
       boolean isprime=true;
       if(n==2){
         isprime=true;
       }else{
         int i=2;
         boolean t=true;
         for(i=2;i<=n-1;i++){
           if(n%i==0){
             isprime=false;
             break;
           }
         }
          
       }return isprime; 
      }
     
}

       
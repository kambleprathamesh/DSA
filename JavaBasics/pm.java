import java.util.*;
public class pm{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number: ");
     int n= sc.nextInt();
     int i=2;
     boolean isprime=true;
     if(n==2){
       System.out.print(n+" is a Prime Number ");
     }
     else{
       for(i=2;i<Math.sqrt(n);i++){
          if(n%i==0){
           isprime=false;
          }
       }

       if(isprime==true){
         System.out.print(n+" is a Prime Number ");
       }else{
         System.out.print(n+" is not a prime Number");
       }
     
    } 
  }
}      
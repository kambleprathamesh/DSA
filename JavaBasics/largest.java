import java.util.*;
public class largest{
  public static void main(String args[]){
     Scanner pk=new Scanner(System.in);
     System.out.println("Enter two Numbers");
     System.out.print("A=");
     int a=pk.nextInt();
     System.out.print("B=");
     int b=pk.nextInt();
     if(a>b){
        System.out.print("A is greater");
       }
     else{
        System.out.print("B is greater"); 
     }
   }
}
import java.util.*;
public class largest3{
  public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter 1st num: ");
       int a=sc.nextInt();
       System.out.print("Enter 2nd num: ");
       int b=sc.nextInt();
       System.out.print("Enter 3rd num: ");
       int c=sc.nextInt();
       if(a>b&&a>c){
          System.out.print(a+" is greater");
         }
       else if(b>a&&b>c){
          System.out.print(b+" is greater");
         }
       else{
          System.out.print(c+" is greater");
         }

    }
}
       
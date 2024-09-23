import java.util.*;
public class taxcal{
  public static void main(String args[]){
       System.out.println("Tax Calci");
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter your Income "); 
       int a=sc.nextInt();
       float tax;
       if(a<=5){
           System.out.print("No tax to be paid");
       } else if(a>5 && a<=10){
               Tax=income*0.2;
               System.out.print("Tax Amout to be paid Is "+Tax);
       }else{
             Tax=income*0.3;
             System.out.print("Tax Amout to be paid Is "+Tax);
       }
    }
}
       
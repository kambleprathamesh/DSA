import java.util.*;
public class product{
     public static int multiply(int c,int d){
       int prod=c*d;
       return prod;
     }
     public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter A Number:");
       int a=sc.nextInt();
       System.out.print("Enter A Number:");
       int b=sc.nextInt();
       int result=multiply(a,b);
       System.out.println(result);
       //System.out.println(a);
       //System.out.println(b);
       result=multiply(40,100);
       System.out.println(result);
    }

}

       
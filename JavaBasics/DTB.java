import java.util.*;
public class DTB{
  public static void main(String args[]){
   Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Decimal number: ");
   int a=sc.nextInt();
   System.out.print(binary(a));
  }
  public static int binary(int n){
    int pow=0;
    int bin=0;
     while(n>0){
       int rem=n%2;
       bin=bin+(rem*(int)Math.pow(10,pow));
       n=n/2;
       pow++;
     }return bin;
  }
}
       
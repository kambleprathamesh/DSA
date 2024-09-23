import java.util.*;
public class factorial{
 public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     System.out.print("Enter a number to find the Factorial: "+num);
     int num=sc.nextInt();
     int i=1;
     int fact=1;
     if(num==0){
        System.out.print("0!is 1");
     }else{
          for(i=1;i<=num;i++){
          fact=fact*i;
          }
          System.out.print(num+" !is "+fact);
      }   
  }
}      
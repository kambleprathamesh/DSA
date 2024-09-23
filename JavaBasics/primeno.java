import java.util.*;
public class PRIMENO{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter a Number: ");
    int num=sc.nextInt();
    System.out.print("THE Enter Number is "+prime(num)); 
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
}  
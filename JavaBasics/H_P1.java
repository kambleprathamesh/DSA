import java.util.*;
public class H_p1{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter total Number of Rows:");
    int TR=sc.nextInt();
    System.out.print("Enter total Number of columns: ");
    int TC=sc.nextInt();
    Hallow_rectangle(TR,TC);
  } 
  public static void Hallow_rectangle(int TR,int TC){
    for(int i=1;i<=TR;i++){
       for(int j=1;j<=TC;j++){
          if(i==1||i==TR||j==1||j==TC){
             System.out.print("*");
          }else{
              System.out.print(" ");
           }
       }
       System.out.println(" ");
    }
  }
  
}
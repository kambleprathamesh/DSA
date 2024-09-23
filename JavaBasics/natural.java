import java.util.*;
public class natural{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.print("Sum of first n natural Number\n");
    System.out.print("Enter N: ");
    int n=sc.nextInt();
    int sum=0;
    int i=0;
    while(i<n){
         i++;
         sum+=i;
        }
     System.out.print("sum of 1st "+n+" natural numbers is "+sum);
    }
}
    
import java.util.*;
public class calculator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
int sum
    System.out.print("Enter a 1ST Number ");
    int a=sc.nextint();
    System.out.print("Enter a 2nd Number ");
    int b=sc.nextint();
    System.out.print("1.Sum\n2.Product\n3.Divide\n4.Modulo\n");
    System.out.print("Enter the opedation to be Performed ");
    int c=sc.nextint();
    switch{
    case 1: a+b;
            system.out.print("sum= "+(a+b));
            break;
    case 2: a*b;
            System.out.print("Product= "+(a*b));
            break;
    case 3: a/b;
            System.out.print("Quotient= "+(a/b));
            break;
    case 4: a%b;
            System.out.print("Quotient= "+(a%b));
            break;
   default:System.out.print("Enter a valid Number");
           }
}

    
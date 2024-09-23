import java.util.*;
public class calculator{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    
    System.out.print("Enter a 1ST Number ");
    float a=sc.nextFloat();
    System.out.print("Enter a 2nd Number ");
    float b=sc.nextFloat();
    System.out.print("1.Sum\n2.Product\n3.Divide\n4.Modulo\n");
    System.out.print("Enter the opedation to be Performed ");
    int op=sc.nextInt();
    switch(op){
    case 1: //(a+b);
            System.out.print("sum= "+(a+b));
            break;
    case 2: //(a*b);
            System.out.print("Product= "+(a*b));
            break;
    case 3: //(a/b);
            System.out.print("Quotient= "+(a/b));
            break;
    case 4: //(a%b);
            System.out.print("Quotient= "+(a%b));
            break;
   default:System.out.print("Enter a valid Number");
           }
  }
}

    
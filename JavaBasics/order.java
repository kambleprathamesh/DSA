import java.util.*;
public class order{
  public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a Number: ");
       int Number=sc.nextInt();
       switch(Number){
       case 1:System.out.print("Samosa on the way");
             break;
       case 2:System.out.print("Pizza on the way");
             break;
       case 3:System.out.print("kachori on the way");
             break;
       case 4:System.out.print("Vada pav on the way");
             break;
       case 5:System.out.print("Noodles on the way");
             break;
       default:System.out.print("Please order Something");
       }
       

    }
}
       
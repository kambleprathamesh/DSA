import java.util.*;
public class BD{
  public static void main(String args[]){
    int binno=1111;
    int num=BTD(binno);
    System.out.print("Decimal value of "+binno+" is "+num);
  }
  public static int BTD(int n){ 
    int dec=0;
    int pow=0;
    while(n>0){
     int ld=n%10;
     dec=dec+(ld*(int)Math.pow(2,pow));
     pow++;
     n=n/10;
    }return dec;
  }
}
   
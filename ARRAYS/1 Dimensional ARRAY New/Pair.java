import java.util.*;
public class Pair{
  public static void main(String args[]){
    int num[]={1,2,3,4,5,6,7,8,9,10};
    PairArray(num);
  }
  public static void PairArray(int num[]){
    int i=0,j=0; 
    for(i=0;i<=num.length-1;i++){
      for(j=i+1;j<=num.length-1;j++){
         System.out.print("("+num[i]+","+num[j]+")");
      }
      System.out.println(" ");
    }
   }
}
  
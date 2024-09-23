import java.util.*;
public class SubArray{
  public static void main(String args[]){
     int num[]={1,2,3,4,5,6,7,8,9,10};
     printSubArray(num);
  }
  public static void printSubArray(int num[]){
    for(int i=0;i<=num.length-1;i++){
       for(int j=i;j<=num.length-1;j++){
           System.out.print("[");
            for(int k=i;k<=j;k++){
               System.out.print(" "+num[k]+" ");
            }
           System.out.print("]");
       }
       System.out.println(" ");
     }
   }
}
             
           
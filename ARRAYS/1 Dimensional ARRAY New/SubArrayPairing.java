import java.util.*;
public class SubArrayPairing{
  public static void main(String args[]){
    int num[]={1,-2,6,-1,3};
    PrintSubArray(num);
  }
  public static void PrintSubArray(int num[]){   
   int largest=Integer.MIN_VALUE;
    for(int i=0;i<num.length;i++){
       for(int j=i;j<num.length;j++){  
           System.out.print("[");
            for(int k=i;k<=j;k++){
              System.out.print(" "+num[k]+" ");   
            }
          System.out.println("]");         
        }
        System.out.println(" ");
      }    
   }
}
import java.util.*;
public class BinaryReverse1{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int num[]={1,2,3,4,5,6,7,8,9,10};
     System.out.print("[ ");
     for(int i=0;i<=num.length-1;i++){
         System.out.print(num[i]+" ");
     }
     System.out.println("]");

    
     int R_array[]=ReverseArray(num);  //calling R_arrayFunction
     System.out.print("[ ");
     for(int i=0;i<=R_array.length-1;i++){
         System.out.print(R_array[i]+" ");
     }
     System.out.println("]");
         
   }
   public static int[] ReverseArray(int num[]){
     int i=0,j=num.length-1;
     while(i<j){
       int temp=num[i];
       num[i]=num[j];
       num[j]=temp;

       i++;
       j--;
     }
    return num;
  }
}
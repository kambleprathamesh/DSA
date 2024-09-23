import java.util.*;
public class MaxSumArray{
   public static void main(String args[]){
     int num[]={-1,-2,-3,-4,-5,-6,-7,-8,-9,10};
     MaxSumArray(num);
   }
   public static void MaxSumArray(int num[]){
     int sum=0;
     int largest=Integer.MIN_VALUE;
     for(int i=0;i<num.length;i++){
        for(int j=i;j<num.length;j++){
            System.out.print("[");
            for(int k=i;k<=j;k++){
               System.out.print(" "+num[k]+" ");
                sum+=num[k];
            }
            System.out.println("]: Sum = "+sum);
              if(sum>largest){
                largest=sum;
               }
             sum=0;
       }
       System.out.println(" ");  
     } 
     System.out.println("Maximum SubArray Sum = "+largest);
   } 
}

 


 
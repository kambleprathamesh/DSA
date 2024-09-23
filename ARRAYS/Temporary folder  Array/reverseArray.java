import java.util.*;
public class reverseArray{
   public static void main(String args[]){ 
     int number[]={1,2,3,4,5,6};
     //Reverse(number);
     //for(int i=0;i<=number.length-1;i++){
      // System.out.print(number[i]+" ");
     //}
     pair(number);
     subArray(number);
   }
   //public static void Reverse(int number[]){    //Swap of Array
     //int first=0,last=number.length-1;
     //while(first<last){  
       //int temp=number[last];
       //number[last]=number[first];
       //number[first]=temp;
    
       //first++;
       //last--;
     //}
   //}
   public static void pair(int number[]){   // FUNction for making the pairs of the elements present in the array
     int tp=0;
     for(int i=0;i<=number.length-1;i++){
       for(int j=i+1;j<=number.length-1;j++){
           System.out.print("("+number[i]+","+number[j]+")");
           tp++;
       }
       System.out.println(" ");
      }
      System.out.println("Total Pairs: "+tp);
   }
   public static void subArray(int number[]){
    for(int i=0;i<=number.length-1;i++){
       for(int j=i;j<=number.length-1;j++){
           for(int k=i;k<=j;k++){
              System.out.print(number[k]);
           }
           System.out.println(" ");
       }System.out.println(" ");
     }
   }    
    

}

       
       
     
    
     
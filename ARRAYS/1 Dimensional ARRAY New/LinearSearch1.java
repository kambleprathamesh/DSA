import java.util.*;
public class LinearSearch1{
  public static void main(String args[]){
   int num[]={65,78,54,89,53,4,890,2,35,8,1,99,82,60,90};
   getLargest(num);
  }
  public static void getLargest(int num[]){
    int Largest=Integer.MIN_VALUE;
    int Smallest=Integer.MAX_VALUE;
    for(int i=0;i<num.length;i++){
       if(num[i]>Largest){
          Largest=num[i];
       }
       if(num[i]<Smallest){
            Smallest=num[i];
       }
    }
    System.out.println("The Largest value Among the Array = " +Largest);
    System.out.println("The Smallest value Among the Array = " +Smallest);
  }
}
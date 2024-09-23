import java.util.*;
public class largest{
  public static void main(String args[]){
    int marks[]={51,22,39,87,6,0};
    int large=getLargestSmallest(marks);
    System.out.print("Greatest Value among the Array is: "+large);
  }
  public static int getLargestSmallest(int marks[]){
    int largest=Integer.MIN_VALUE;  // MIN_VALUE=-infinity
    int smallest=Integer.MAX_VALUE;//maxinmun value=+infinoite
    for(int i=0;i<marks.length;i++){
       if(marks[i]>largest){
          largest=marks[i];
       }if(smallest>marks[i]){
           smallest=marks[i];
       }
    
    }
     System.out.println("Smallest value among the Array is: "+smallest);
     return largest;
  }
}

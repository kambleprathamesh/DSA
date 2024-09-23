import java.util.*;
public class BinarySearch{
  public static void main(String args[]){
    int num[]={1,2,3,4,5,6,7,8,9,99,100};
    int key=101;
    int result=BSearch(num,key);
    if(result==-1){
      System.out.println("Number is not present");
     }else{
       System.out.print(key+" is Present at "+result);
     }
  }
  public static int BSearch(int num[], int key){
    int sIdx=0;
    int eIdx=num.length-1;
    
    for(int i=0;i<num.length;i++){
      int mid=(sIdx+eIdx)/2;
      if(num[mid]==key){
        return mid;
      }else if(key>num[mid]){
        sIdx=mid+1;
      }else{
        eIdx=mid-1;
      } 
   }
   return -1;
     
  }
}
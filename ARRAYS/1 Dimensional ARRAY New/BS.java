import java.util.*;
public class BS{
  public static int BinarySearch(int num[],int key){
    int i=0,j=num.length-1;  //i=start index and j==last index
    while(i<=j){
       int mid=(i+j)/2;
       if(num[mid]==key){
          return mid;
       }else if(key>num[mid]){
          i=mid+1;
       }else{
          j=mid-1;
       }
    }
    return -1;
  }  
  public static void main(String args[]){
    int num[]={1,2,3,4,5,6,7,8,9,10};
    int key=110;
    int result=BinarySearch(num,key);
    if(result==-1){
      System.out.println("Key is Not Present!");
    }else{
       System.out.println(key+" is Present at Index Number "+result);
    }
  }
}
  
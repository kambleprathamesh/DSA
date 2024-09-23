import java.util.*;
public class BinarySearch{
  public static void main(String args[]){
     int maths[]={1,2,5,7,9,10};
     int key=10;
     System.out.print(key+" is present at "+Binarysearch(maths,key));

  }
  public static int Binarysearch(int maths[],int key){
    int start=0;
    int end=maths.length-1;
    while(start<=end){
         int mid=(start+end)/2;  //CALCULATE MID
         if(maths[mid]==key){     //if mid value==key themn return mid value 
            return mid;
         }if(maths[mid]>key){   //cehck key less than mid than make end var =mid-1
            end=mid-1;
          }else{
            start=mid+1;       //cehck key greater than mid than make start var =mid+1
         }
    }return -1;
  }
}   
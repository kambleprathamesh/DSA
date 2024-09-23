import java.util.*;
public class Linear_Search{
 public static void main(String args[]){
  int numbers[]={11,12,34,35,67,89,99,100};
  int key=54;
  int index=linearsearch(numbers,key);
  if(index==-1){
    System.out.print("Number Not Found");
   }else{
    System.out.print("Index of"+key+"is"+index);
   }
 }
  public static int linearsearch(int numbers[],int key){
   
    for(int i=0;i<numbers.length;i++){
       if(numbers[i]==key){
         return i;
       }
    }
    return -1; 
   }
}


import java.util.*;
public class Linear_Search
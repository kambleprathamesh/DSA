import java.util.*;
public class LinearSearch{
   public static void main(String args[]){
      Scanner sc=new Scanner(System.in);
      System.out.print("What you want to store in to Array");
       
      int marks[]={1,2,3,4,5};
      int key=5;
      int result=Lsearch(marks,key);
      if(result==-1){
        System.out.println("Key is not present");
      }else{
           System.out.print("Key is prsent at"+result);
      }
      
   }
   public static int[] CreateArray(){
       System.out.print("Enter Size of an Array")
   public static int Lsearch(int marks[],int key){
     for(int i=0;i<marks.length;i++){
        if(marks[i]==key){
          return i;
        }
     }
     return -1;
   }      
}


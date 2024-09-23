import java.util.*;
public class LS{
   public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     int num[]={10,20,30,40,50,60,70,80,90,100};
     int key=600;
     int result=LinearSearch(num,key);
     if(result==-1){
       System.out.println("Number Not Found"); 
     }else{
        System.out.println(key+" is present at Index no "+result);
     }
   }
   public static int LinearSearch(int num[],int key){
     for(int i=0;i<num.length;i++){
         if(num[i]==key){
           return i;
         }
     }
     return -1;
   }
}
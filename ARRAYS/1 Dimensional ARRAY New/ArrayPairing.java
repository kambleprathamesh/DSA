import java.util.*;
public class ArrayPairing{
  public static void main(String args[]){
    int num[]={1,2,3,4,5,6,7,8,9,10};
    Pair(num);
    
  }
  public static void Pair(int num[]){
   
    for(int i=0;i<num.length;i++){
       for(int j=i+1;j<num.length;j++){
          System.out.print("("+num[i]+","+num[j]+")");
       }
       System.out.println(" ");
    }
  }
}
 
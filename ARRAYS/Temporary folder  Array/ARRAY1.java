import java.util.*;
public class Array1{
  public static void update(int marks[],int a){
   a=50;
   int i=0;
   for(i=0;i<marks.length;i++){
      marks[i]=marks[i]+1;
      System.out.println(marks[i]);
      }
   System.out.println(a);
  }
  public static void main(String args[]){
    int a=100;
    int marks[]={99,98,93,100};  //declare array
    update(marks,a);
    for(int i=0;i<=marks.length;i++){
         System.out.println(marks[i]);
    }
    System.out.print(" ");
    System.out.print(a);
  }
}

import java.util.*;
public class CreateArray{
   public static void main(String args[]){
       Scanner sc=new Scanner(System.in);
       int marks[]=new int[10];                //declare an empty Array
       System.out.println("Enter 10 marks");
       for(int i=0;i<=marks.length-1;i++){    // this loop is for taking input from the user
            marks[i]=sc.nextInt();
         }
       System.out.print("[");
       for(int j=0;j<=marks.length-1;j++){     // this loop is for displaying Array
           System.out.print(marks[j]+" ");
         }
       System.out.print("]");
   }
}


 
   public static void PrintScore(int subjects[],int Score[]){
          for(int j=0;j<subjects.length;j++){
             for(int k=j;k=Score[k];k++){
                System.out.print(subjects[j]+" = "+marks[j]);
             }
          }
   }

 marks(Score);
     PrintScore();
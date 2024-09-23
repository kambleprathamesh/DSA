import java.util.*;
public class Array{
    public static void main(String args[]){
     Scanner sc=new Scanner(System.in);
     String subjects[]=Subject();
     PrintMarks(subjects);
   }
    public static String[] Subject(){
      Scanner sc=new Scanner(System.in);
      System.out.print("Enter Total Number of Subject:");
      int n=sc.nextInt();
      String sub[]=new String[n];
      System.out.println("Enter Subject Names:");
      for(int s=0;s<sub.length;s++){
          sub[s]=sc.nextLine();
      }
      return sub;
    }
       
    public static int[] marks(){
        Scanner sc=new Scanner(System.in);
        int Score[]=new int[10];
        for(int i=0;i<Score.length;i++){
            Score[i]=sc.nextInt();
        }
       return Score;
   }
   public static void PrintMarks(String subjects[]){
        int mark[]=marks();
        for(int j=0;j<subjects.length;j++){
            System.out.println(subjects[j]+" = "+mark[j]);
         }
    }
   
}  


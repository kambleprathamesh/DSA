import java.util.*;
public class Linear_Search2{
  public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    int age[]=new int[10]; //Empty array declare
    int i=0;
    while(i<age.length){     //take input from the user
       System.out.print("Enter the Age: ");
       age[i]=sc.nextInt();
       i++;
    }
    System.out.print("Enter the Age You want to Search: "); 
    int key=sc.nextInt();
    int result=index(age,key);
    if(result==-1){
       System.out.print("Age not Found!");
    }else{
      System.out.print(key+" is present at "+result+" index Number."); 
    }
  }  
  public static int index(int age[],int key){ //function for Linear search
    for(int i=0;i<age.length;i++){
        if(age[i]==key){
          return i;
         }
    }return -1;
  }
}
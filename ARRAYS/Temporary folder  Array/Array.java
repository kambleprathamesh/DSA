import java.util.*;
public class Array{
   public static void main(String args[]){
     int marks[]=new int[50]; // declaring an ARRAY
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter your Marks: ");
     marks[0]=sc.nextInt(); //input into an Array
     marks[1]=sc.nextInt(); //input into an Array
     marks[2]=sc.nextInt(); //input into an Array
     marks[3]=sc.nextInt(); //input into an Array
     System.out.println("Physic: "+marks[0]);  // output from Array
     System.out.println("Chemistry: "+marks[1]);// output from Array
     System.out.println("Maths: "+marks[2]);// output from Array
     System.out.println("Biology: "+marks[3]);// output from Array
     

    marks[0]=99;  //update 0th position of an array
    marks[1]=89;  //updating 1st position of an array
   
    //printing the new array
    
    System.out.println("Physic: "+marks[0]);  // output from Array
    System.out.println("Chemistry: "+marks[1]);// output from Array
     
    //take percentage

   int percentage;
   percentage=(marks[0]+marks[1]+marks[2]+marks[3])/4;
   System.out.println("Percentage: "+percentage);



   }
}

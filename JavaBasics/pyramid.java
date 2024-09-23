import java.util.*;
public class pyramid{
    public static void main(String args[]){
      int line=1;
      int star=4;
      // 1st for loop for number of lines
     //  2nd for loop for number of integers to be printed on the line
      for(line=1;line<=10;line++){ 
         for(star=1;star<=line;star++){
             System.out.print(star);
             }
            System.out.println("");
      }       
   }
}

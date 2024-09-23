import java.util.*;
public class pattern2{
    public static void main(String args[]){
      int line=1;
      int star=4;
      for(line=1;line<=4;line++){
         for(star=4;star>=line;star--){
             System.out.print("*");
             }
            System.out.println("");
      }       
   }
}
/*Alternative code
 for(line=1; l;ine<=4;line++){
    for(star=1;star=4-line+1;star++){
      S.o.p("*");
    }
}*/
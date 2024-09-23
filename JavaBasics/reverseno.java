import java.util.*;
public class reverseno{
   public static void main(String args[]){
       int n=191202;
       while(n>0){
          int ld=n%10;
          System.out.print(ld+" ");
          n=n/10;
        }
   }
}
           
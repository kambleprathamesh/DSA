import java.util.*;
public class funover{
  public static void main(String args[]){
    System.out.println(rem(6,3));
    System.out.println(rem(47,89,75));
    System.out.println(rem(3f,6f));
    
  }
  public static int rem(int n,int z){
    int result=n%z;
    return result;
  }
  public static int rem(int n,int z,int x){
    int result=n+z+x;
    return result;
  }
  public static float rem(float f,float g){
    float result=f+g;
    return result;
  }
}
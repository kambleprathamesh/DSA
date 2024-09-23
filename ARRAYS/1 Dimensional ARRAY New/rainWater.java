import java.util.*;
public class rainWater{
    public static int trappedRainWater(int height[]){
        int n=height.length;
     //calculate Left Max Boundary
        int leftMax[]=new int[height.length];
        leftMax[0]=height[0];
        for(int i=1;i<n;i++){
            leftMax[i]=Math.max(height[i],leftMax[i-1]);
            
        }
        System.out.print("["); 
        for(int j=0;j<n;j++){
            System.out.print(leftMax[j]+" ");
        }
        System.out.println("]"); 
        
        
     //Calculate Right Max Boundary
        int rightMax[]=new int[n];
        rightMax[n-1]=height[n-1];
        for(int k=n-2;k>=0;k--){
           rightMax[k]=Math.max(height[k],rightMax[k+1]);
        }
        System.out.print("["); 
        for(int j=0;j<n;j++){
            System.out.print(rightMax[j]+" ");
        }
        System.out.println("]");

     //Calculate trapping water
        int trappedWater=0;  //Sum of Trapped Water
        for(int i=0;i<n;i++){
            int waterLevel=Math.min(leftMax[i],rightMax[i]);
            trappedWater+=waterLevel-height[i];
        }
        return trappedWater;            
    }     
    public static void main(String args[]){
        int height[]={5,2,10,8,11,4};
        int ttw=trappedRainWater(height);//totalTrapedWater
        System.out.println("Total Rain Water Trapped = "+ttw);
    }
}
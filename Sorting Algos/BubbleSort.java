import java.util.*;
public class BubbleSort{
    public static void bubbleSort(int num[]){
       for(int turn=0;turn<num.length;turn++){   
           for(int i=0;i<num.length-1-turn;i++){
                if(num[i]>num[i+1]){
                   int temp=num[i];
                   num[i]=num[i+1];
                   num[i+1]=temp;
                }
            }
        }
        System.out.print("[");
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }
        System.out.print("]");
        
    }
    public static void main(String args[]){
        int num[]={10,9,8,1,6,2,4,3,5,7};
        bubbleSort(num);
    }
}
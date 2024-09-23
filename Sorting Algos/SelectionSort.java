import java.util.*;
public class SelectionSort{
    public static void selectionSort(int num[]){
        for(int i=0;i<num.length;i++){
           int minPos=i;
           for(int j=i+1;j<num.length;j++){    
              if(num[j]<num[minPos]){          
                minPos=j;
              }
           }
           int temp=num[minPos];
           num[minPos]=num[i];
           num[i]=temp;
        }
        System.out.print("[");
        for(int k=0;k<num.length;k++){
            System.out.print(num[k]+" ");
        }
        System.out.print("]");
    }
    public static void main(String agrs[]){
       int num[]={5,8,9,1,4,2,0};
       selectionSort(num);
       
    }
}
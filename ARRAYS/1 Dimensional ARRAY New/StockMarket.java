import java.util.*;
public class StockMarket{
    public static int BuyAndSellStocks(int price[]){
       int BuyPrice=Integer.MAX_VALUE;
       int Max_Profit=0;
       for(int i=0;i<price.length;i++){
          if(BuyPrice<price[i]){
            int profit=price[i]-BuyPrice;
            Max_Profit=Math.max(Max_Profit,profit);
          }else{
               BuyPrice=price[i];
          }
       }
       return Max_Profit;
    }
    public static void main(String args[]){
        int price[]={9,3,2,1,10,50,15};
        System.out.println("The Maximum Profit Gain is "+BuyAndSellStocks(price));
    }
}
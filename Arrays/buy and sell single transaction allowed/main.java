import java.lang.Math;
class Solution {
    public int maximumProfit(int prices[]) {
        // Code here
   int   min= prices[0];
     int max=0;
     for(int i=1;i<prices.length; i++){
         min= Math.min(min,prices[i]);
         max=Math.max(max,prices[i]-min);
     }
        
   return max; }
}

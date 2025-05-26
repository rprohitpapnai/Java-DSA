class Solution {
    public int maximumProfit(int arr[]) {
        // code here
        int profit=0;
        int buy=-1;// assuming -1 as not bought anything
        // i intially assumed it as 0 but all test cases wont be passed
        // because a stock can have a 0 price 
        //so to avoid that i did this
        int sell=0;
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]<arr[i+1]){
                if(buy==-1){
                    buy=arr[i];
                }
            }
            else if(arr[i]>arr[i+1]){
                if(buy!=-1 && buy<arr[i]){
                    sell=arr[i];
                    profit=profit+(sell-buy);
                    buy=-1;
                    sell=0;
                }
            }
        }
        if(buy!=-1&&buy<arr[n-1]){
            profit=profit+(arr[n-1]-buy);
        }
   return profit; }
}

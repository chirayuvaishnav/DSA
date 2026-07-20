class Solution {
    public int buyChoco(int[] prices, int money) {
    int originalMoney = money;
     Arrays.sort(prices);
    int sum=0;
    for(int i = 0 ; i<=1 ; i++){
        sum+= prices[i];
        money-=prices[i];
    }
    if(money>=0)
        return money;
    else
        return originalMoney;
    }
}
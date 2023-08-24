import java.util.*;
public class arrayscc {
	/*public static void printPairs(int nos[]){
		int tp=0;
		for(int i=0;i<nos.length;i++){
			int current = nos[i];
			for(int j=i+1; j<nos.length;j++){
				System.out.print("(" + current + "," + nos[j] + ")");
				tp++;
			}
			System.out.println();
		}
		System.out.println("total pairs= " + tp);
	}

	public static void main (String args[]){
		int nos[] = {2,4,6,8,10};
		printPairs(nos);
	} */

	public static int buy_sell_stocks(int prices[]){
		int buyprice = Integer.MAX_VALUE;
		int maxprofit = 0;

		for (int i=0; i<prices.length; i++){
			if(buyprice<prices[i]){
				//profit
				int profit = prices[i] - buyprice;
				maxprofit = Math.max(maxprofit, profit);
			}
			else{
				buyprice = prices[i];
			}
		}
		return maxprofit;
	}

	public static void main(String args[]){
		int prices[] = { 7,1,5,3,6,4};
		System.out.println(buy_sell_stocks(prices));
	}
	
}



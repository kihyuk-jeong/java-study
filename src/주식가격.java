public class 주식가격 {
	 public int[] solution(int[] prices) {
		 
		 int [] answer = new int[prices.length];
		 
		 for(int i=0; i<prices.length-1; i++) {
			 int count =0;
			 for(int j=i+1; j<prices.length; j++) {
				 if(prices[i] < prices[j]) {
					 count++;
				 }
				 else {
					 count++;
					 break;
				 }
			 }
			 
			 answer[i] = count;
		 }
		 
		 answer[prices.length-1] = 0;
		 
		 return answer;
	 }
	
}

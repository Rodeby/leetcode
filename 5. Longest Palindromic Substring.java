class Solution {
    	public static String longestPalindrome(String s) {
		if(s ==  null || s.length() < 1)
			return "";
		int start = 0;
		int end = 0;
		
		for(int i= 0; i < s.length(); i++) {
			int temp1 = pivot(s,i,i);
			int temp2 = pivot(s,i,i+1);
			
			int longest = Math.max(temp1, temp2);
			
			if(longest > end-start) {
				start = i - (longest-1)/2;
				end = i +  longest/2;
			}
		}
		
		return s.substring(start, end+1);
		
		
		
	}

	public static int pivot(String s, int left, int right) {
		int i = left;
		int j = right;
		
		while(i >= 0 && j < s.length() && s.charAt(i) == s.charAt(j)) {
			i--;
			j++;
		}
		
		return j - i - 1;
	}
}

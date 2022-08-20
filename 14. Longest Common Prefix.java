class Solution {
    public String longestCommonPrefix(String[] strs) {
        		
		if(strs.length == 0)
			return "";
		String result = strs[0];
		for(int i = 1; i < strs.length; i++) {
			
			String temp = strs[i];
			
			while(temp.indexOf(result) != 0 && result.length()!= 0) {
				
				result = result.substring(0, result.length()-1);
			}
			
		}
		
		if(result.length() == 0)
			return "";
		else
			return result;
    }
}

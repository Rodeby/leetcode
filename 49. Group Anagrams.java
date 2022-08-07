class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
          HashMap<String, ArrayList<String>> map = new HashMap<>();
	    
	        for(int i = 0; i < strs.length; i++) {
	        	String original = strs[i];
	        	char[] charTemp = original.toCharArray();
	        	Arrays.sort(charTemp);
	        	String sort = new String(charTemp);
	        	
	        	map.putIfAbsent(sort, new ArrayList<String>());
	        	map.get(sort).add(original);
	        }
	     
	        ArrayList<List<String>> ans = new ArrayList<>();
	        
	        for(List<String> list: map.values()) {
	        	ans.add(list);
	        }
	        
	        return ans;
    }
}

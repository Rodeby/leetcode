class Solution {
    public int majorityElement(int[] nums) {
       HashMap<Integer, Integer> map = new HashMap<>();
	        
	        for(int i = 0; i < nums.length; i++){
	            
	            map.putIfAbsent(nums[i],0);
	            
	            map.put(nums[i], map.get(nums[i]) +1);
	            
	        }
	        
	        int max = 0;
	        int result = 0;
	        for(int i : map.keySet()) {
	        	
	        	if(map.get(i) > max) {
	        		max = map.get(i);
	        		result = i;
	        	}
	        	
	        }
	        
	        return result;
    }
}

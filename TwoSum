class Solution {
    public int[] twoSum(int[] nums, int target) {
        Set<Integer> set = new HashSet<>();
        int[] ans = new int[2];
        int first = 0;
        for(int i = 0; i < nums.length; i++){
            int compliment = target - nums[i];
            if(set.contains(compliment)){
                ans[1] = i;
                first = target - nums[i];
                break;
            }
            else{
                set.add(nums[i]);
            }
        }

        for(int i = 0; i < nums.length; i++){
            if(nums[i] == first){
                ans[0] = i;
                break;
            } 
        }
        
        return ans;
        
        
    }
}

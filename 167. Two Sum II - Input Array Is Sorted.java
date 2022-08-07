class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int[] array = new int[2];
        
        int i = 0;
        int j = numbers.length -1;
        
        while(i < j){
            int temp = numbers[i] + numbers[j];
            if(temp == target){
                array[0] = i+1;
                array[1] = j+1;
                break;
            }
            else if(temp > target){
                j--;
            }
            else{
                i++;
            }
            
        }
        return array;
        
    }
}

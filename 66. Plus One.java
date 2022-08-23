class Solution {
    public int[] plusOne(int[] digits) {
  		boolean carry = false;
		
		
		for(int i = digits.length-1; i >= 0; i--) {
			if(digits[i] == 9) {
				 carry = true;
				 digits[i] = 0;
			}
				
			else {
				carry = false;
				++digits[i];
			}	
			if(carry == false)
				break;
			
		}
		if(carry) {
			int[] result = new int[digits.length+1];
			result[0] = 1;
			
			for(int i = 1; i < digits.length; i++) {
				
				result[i] = digits[i-1];
			}
			return result;
		}
		return digits;
    }
}

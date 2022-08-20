class Solution {
    public int romanToInt(String s) {
     String roman = "IVXLCDM";
		int[] array = {1,5,10,50,100,500,1000};
		
		int highestValue = roman.indexOf(s.charAt(s.length()-1));
		int result = 0;
		
		for(int i= s.length()-1; i>= 0; i--) {
			
			int temp = roman.indexOf(s.charAt(i));
			int numeral = array[roman.indexOf(s.charAt(i))];
			if(temp < highestValue) {
				
				result -= numeral;
			}
			else {
				result += numeral;
				highestValue = temp;
			}
			
			
		}
		return result;
   
    }
}

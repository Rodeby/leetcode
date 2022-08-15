//recursive
class Solution {
    public void reverseString(char[] s) {
        int i = 0;
		int j = s.length-1;
		swap(s, i, j);
    }
    
    public void swap(char[] s, int i, int j){
     if(i < j) {
			char temp = s[j];
			s[j] = s[i];
			s[i] = temp;
			
			swap(s, ++i,--j);
		}
       
    }
}

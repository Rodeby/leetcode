class Solution {
    public boolean isPalindrome(int x) {
      String str = Integer.toString(x);
      char[] array = str.toCharArray();
        
      int i = 0; 
      int j = array.length-1;
      while(i < j){
          if(array[i] != array[j]){
              return false;
          }
          i++;
          j--;
      }
        return true;
    }
}

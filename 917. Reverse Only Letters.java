class Solution {
    public String reverseOnlyLetters(String s) {
        char[] array = s.toCharArray();
        int i = 0;
        int j = array.length -1;
        
        while(i < j){
            if(!Character.isLetter(array[i]) && !Character.isLetter(array[j])){
                i++;
                j--;
            }
            else if(!Character.isLetter(array[i]) ){
                i++;
            }
            else if(!Character.isLetter(array[j])){
                j--;
            }
            else{
                char temp = array[j];
                array[j] = array[i];
                array[i] = temp;
                i++;
                j--;
            }
        }
        String res = new String(array);
        
        return res;
    }
}

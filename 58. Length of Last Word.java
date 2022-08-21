class Solution {
    public int lengthOfLastWord(String s) {
        
        int count = 0;
       
        boolean hasSeenLetter = Character.isLetter(s.charAt(s.length()-1));
        for(int i = s.length()-1; i >= 0; i--){
            if(!Character.isLetter(s.charAt(i)) && !hasSeenLetter){
                continue;
            }
            else if(Character.isLetter(s.charAt(i))){
                 hasSeenLetter = true;
                 count++;
            }
               
            else{
                break; 
            }
               
        }
        
        return count;
    }
}

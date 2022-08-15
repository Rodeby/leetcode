class Solution {
    public String reverseVowels(String s) {
    char[] array = s.toCharArray();

		int i = 0;
		int j = array.length - 1;

		while (i < j) {
			if(!isVowel(array[i]) && !isVowel(array[j])) {
				i++;
				j--;
			}
			else if(!isVowel(array[i])) {
				i++;
			}
			else if(!isVowel(array[j])) {
				j--;
			}
			else {
				char temp = array[j];
				array[j] = array[i];
				array[i] = temp;
				i++;
				j--;
			}
			

		}

		String result = new String(array);
		return result;
    }
    public boolean isVowel(char ch) {
		ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
	}
}

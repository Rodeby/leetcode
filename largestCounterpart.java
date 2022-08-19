public static int largestCounterpart(int[] array) {
		
		int left = 0;
		int right = array.length-1;
		Arrays.sort(array);
		while(left < right) {
			int compliment = array[left] * -1;
			int positive = array[right];
			
			if(compliment == positive)
				return positive;
			else if(compliment > positive)
				left++;
			else {
				right--;
			}
			
		}
		
		return 0;
		
	}

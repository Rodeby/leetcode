class Solution {
    public int evalRPN(String[] tokens) {
       		Stack<Integer> digits = new Stack<>();
		Stack<String> operand = new Stack<>();
		for (int i = 0; i < tokens.length; i++) {
			String temp = tokens[i];
			if (temp.equals("+") || temp.equals("-") || temp.equals("/") || temp.equals("*")) {
				operand.push(temp);
			} else {
				digits.push(Integer.parseInt(temp));
			}

			if (digits.size() >= 2 && !(operand.isEmpty())) {
				int temp2 = digits.pop();
				int temp1 = digits.pop();
				int result = 0;
				String operator = operand.pop();

				if (operator.equals("+")) {
					result = temp1 + temp2;
				} else if (operator.equals("-")) {
					result = temp1 - temp2;

				} else if (operator.equals("/")) {
					result = temp1 / temp2;

				} else if (operator.equals("*")) {
					result = temp1 * temp2;

				}
				digits.push(result);
			}

		}

		return digits.pop(); 
    }
}

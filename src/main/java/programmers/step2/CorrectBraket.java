package programmers.step2;

import java.util.Stack;

public class CorrectBraket {

	public static void main(String[] args) {
		System.out.println("정답은 ? " + solution(")(()"));
	}

    static boolean solution(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) == '(') {
				stack.push('(');
			} else {
				if (stack.isEmpty()) {
					return false;
				}
				stack.pop();
			}
		}
        return stack.isEmpty();
    }

}

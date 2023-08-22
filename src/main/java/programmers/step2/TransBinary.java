package programmers.step2;

public class TransBinary {

	public static void main(String[] args) {
		System.out.println("정답은 ?? " +  solution("110010101001"));
	}

	public static int[] solution(String s) {
        int[] answer = {0,0};

        while (s.length() > 1) {
        	answer[0]++;
			answer[1] += s.length() - s.replaceAll("0", "").length();
			s = Integer.toBinaryString(s.replaceAll("0", "").length()).toString();
		}

        return answer;
    }

}

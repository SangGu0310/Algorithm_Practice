package practice.level1;

import java.util.HashSet;

public class Poketmon {

	public static void main(String[] args) {
		int[] nums = {3,3,3,2,2,2};
		System.out.println(solution(nums));
	}

	public static int solution(int[] nums) {
		int pick = nums.length / 2;
		HashSet<Integer> hashSet = new HashSet<>();
		for (int num : nums) {
			hashSet.add(num);
		}
		if (hashSet.size() >= pick) {
			return pick;
		} else {
			return hashSet.size();
		}
    }

}

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

public class 폰켓몬_HashSet {
    public static void main(String[] args) {
        int[] nums = { 3,3,3,2,2,4 };
        Solution(nums);
    }

    static int Solution(int[] nums) {
        int answer = 0; // 폰켓몬 종류의 수
        int num = nums.length / 2; // 얻을 수 있는 폰켓몬 수

        HashSet<Integer> hash = new HashSet<>();
        for (int i : nums) {
            hash.add(i);
        }

        if(hash.size() > num) { // 중복 제거한 배열 수가 더 큰 경우
            answer = num;
        }
        else {
            answer = hash.size();
        }

        return answer;
    }

}

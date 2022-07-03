import java.util.ArrayList;

public class 폰켓몬 {
    public static void main(String[] args) {
        int[] nums = { 3,3,3,2,2,2 };
        Solution(nums);
    }

    static int Solution(int[] nums) {
        int answer = 0; // 폰켓몬 종류의 수
        int num = nums.length / 2; // 얻을 수 있는 폰켓몬 수
        
        ArrayList<Integer> list = new ArrayList<>(); // 얻은 폰켓몬 넣을 배열
        for (int i = 0; i < nums.length; i++) {
            if (num == 0)
                break;
            if (list.contains(nums[i])) {
                continue;
            }
            list.add(nums[i]);
            num--;
            answer++;
        }
        System.out.println(answer);

        return answer;
    }

}

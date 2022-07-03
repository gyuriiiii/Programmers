import java.util.ArrayList;

public class 소수만들기_함수 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        int[] array2 = { 1,2,7,6,4 };
        Solution(array);
        Solution(array2);
    }
    
    static int Solution(int[] nums) {
        int answer = 0;

        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    if(check(nums[i]+nums[j]+nums[k]) == true) { // 소수인 경우
                        answer++;
                    };
                }
            }
        }
        System.out.println(answer);

        return answer;
    }

    static boolean check(int num) {
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num%i==0) {
                return false;
            }
        }
        return true;
    }
}

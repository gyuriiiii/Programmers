import java.util.ArrayList;
import java.util.Arrays;

public class 소수만들기 {
    public static void main(String[] args) {
        int[] array = { 1, 2, 3, 4 };
        int[] array2 = { 1,2,7,6,4 };
        Solution(array);
        Solution(array2);
    }

    static int Solution(int[] nums) {
        int answer = 0;

        // 배열 다 합친 것 보다 소수가 작음
        // 다 합친 것 중 소수 구해서 배열에 넣기
        // 배열 합친 것 중 있나 확인하기

        int sum = 0; // 배열 값 합계
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
        }

        // 소수 구하기
        int[] arr = new int[sum + 1];
        for (int i = 2; i < arr.length; i++) {
            arr[i] = i;
        }

        for (int i = 2; i <= sum; i++) {
            // 2,3,5,7... 의 배수 빼기
            for (int j = 2 * i; j <= sum; j += i) {
                arr[j] = 0; // 소수 아닌 값 0으로 만들기
            }
        }

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) { // 소수인 값들 배열에 넣기
                list.add(arr[i]);
            }
        }

        // nums배열에서 주어진 숫자 중 3개의 수 더했을 때
        // 소수가 되는 경우의 개수 구하기 (list에 몇 개나 있는지?)
        // a+b+c= list.get(i) 이런식으로 나오는 거 몇개? (answer)
        Arrays.sort(nums); // 오름차순 정렬
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {
                    int n = nums[i]+nums[j]+nums[k];
                    for (Integer ans : list) {
                        if(ans==n) {
                            answer++;
                        }
                    }
                }
            }
        }
        System.out.println(answer);

        return answer;
    }
}

import java.util.ArrayList;
import java.util.Arrays;

public class 나눠떨어지는숫자 {
    public static void main(String[] args) {
        int []arr = { 2, 36, 1, 3 };
        Solution(arr, 0);
    }

    static int[] Solution(int[] arr, int divisor) {
        int cnt=0;
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                cnt++;
            }
        }

        if(cnt == 0) {
            int[] answer = { -1 };
            return answer;
        }
        
        int[] answer = new int[cnt];
        int j=0;
        for(int i=0; i<arr.length; i++) {
            if(arr[i]%divisor==0) {
                answer[j] += arr[i];
                j++;
            }
        }
        Arrays.sort(answer);
        
        return answer;
    }
}

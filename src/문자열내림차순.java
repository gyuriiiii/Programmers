import java.util.Arrays;
import java.util.Collections;

public class 문자열내림차순 {
    public static void main(String[] args) {
        Solution("Zbcdefg");
    }

    static String Solution(String s) {
        String answer = "";
    
        String arr[] = s.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(int i=0; i<arr.length; i++) {
            answer += arr[i];
        }

        return answer;
    }
}
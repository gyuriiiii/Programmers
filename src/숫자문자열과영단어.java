import java.util.Vector;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {
        Solution("one4seveneight");
    }

    static int Solution(String s) {        
        String[] arr = { "zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine" };
        for (int i = 0; i < 10; i++) {
            if(s.contains(arr[i])) {
                s = s.replace(arr[i], Integer.toString(i));        
            }
        }
        int answer = Integer.parseInt(s);
        
        return answer;
    }
}

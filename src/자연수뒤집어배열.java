import java.util.ArrayList;

public class 자연수뒤집어배열 {
    public static void main(String[] args) {
        Solution(12345);
        Solution(1234567);
        Solution(12340);
        Solution(1);
    }

    static int[] Solution(long n) {
        ArrayList<Integer> list = new ArrayList<> ();
        while(n!=0) {
            list.add((int) n%10);
            n /= 10;
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        
        return answer;
    }
}

import java.util.*;

public class 자연수뒤집어배열_while {
    public static void main(String[] args) {
        Solution(12345);
    }

    static int[] Solution(long n) {
        ArrayList<Integer> list = new ArrayList<> ();
        while(n>0) {
            list.add((int) n%10);
            n /= 10;
        }
        
        int[] answer = new int[list.size()];
        for(int i=0; i<answer.length; i++) {
            answer[i] = list.get(i);
        }
        System.out.print(answer);
        
        return answer;
    }
}

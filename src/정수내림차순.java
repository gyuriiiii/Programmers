public class 정수내림차순 {
    public static void main(String[] args) {
       Solution(118372); 
    }

    static long Solution(long n) {
        long answer = 0;
        
        String s = "";
        // /10한 값을 계속 넘겨줌줌줌
        // %10해준 값을 답에 하나씩 차례로 +
        while(n/10!=0) {
            s += n%10;
            n = n/10;
        }
        
        return answer;
    }

}

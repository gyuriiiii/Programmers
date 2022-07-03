public class 정수제곱근 {
    public static void main(String[] args) {
        Solution(3);
    }

    static long Solution(long n) {
        long answer = (long) Math.sqrt(n);

        if(Math.pow(answer, 2) == n) {
            answer = (long) Math.pow(answer+1, 2);
        }
        else {
            answer = -1;
        }

        System.out.print(answer);
        return answer;
    }
}

public class 나머지1되는수 {
    public static void main(String[] args) {
        Solution(10);
    }

    static int Solution(int n) {
        int answer = 0;

        for(int i=1; i<=n; i++) {
            if(n%i==1) {
                answer = i;
                break;
            }
        }
        return answer;
    }
}

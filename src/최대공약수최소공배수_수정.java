public class 최대공약수최소공배수_수정 {
    public static void main(String[] args) {
        solution(15,6);
    }

    static int[] solution(int n, int m) {
        int[] answer = new int[2];

        int big = Math.max(n, m);
        int small = Math.min(n, m);

        answer[0] = gcd(big, small); // 최대공약수
        answer[0] = gcd(big, small); // 최소공배수
        System.out.print(answer[0]);

        return answer;
    }

    static int gcd(int a, int b) { 
        if(a%b==0) {
            return b;
        }
        return gcd(b, a%b);
    }
}
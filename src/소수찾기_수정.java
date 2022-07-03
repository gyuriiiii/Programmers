public class 소수찾기_수정 {
    public static void main(String[] args) {
        Solution(5);
    }

    static int Solution(int n) {
        int answer = 0;
        
        for(int i=2; i<=n; i++) {
            boolean flag = true;
            for(int j=2; j<=n ; j++) {
                if(i%j==0) {
                    flag = false;
                }
            }

            if(flag==true) { // 소수인 경우
                answer++;
            }
        }
        System.err.println(answer);

        return answer;
    }

}

public class 소수찾기_에라토스테네스 {
    public static void main(String[] args) {
        Solution(10);
    }

    static int Solution(int n) {
        int answer = 0;

        int[] arr = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            arr[i] = i;
        }

        // 2부터 시작해서 그의 배수들을 0으로 만들기
        // 0이면 넘어가고, 아니면 그의 배수들 다시 0으로 만듦
        for (int i = 2; i <= n; i++) {
            for (int j = 2 * i; j <= n; j+=i) {
                if(j<=n) {
                    arr[j] = 0;
                }
            }
        }

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                answer++;
            }
        }
        System.out.println(answer);

        return answer;
    }

}

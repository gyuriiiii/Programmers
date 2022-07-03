public class 소수찾기 {
    public static void main(String[] args) {
        Solution(5);
    }

    static int Solution(int n) {
        int answer = 0;
        int [] arr = new int[n+1];

        for(int i=1; i<=n; i++) {  
            for(int j=1; j<=n; j++) {  
                if(i*j==n) {
                    arr[j] += 1;
                }
            }
        }

        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 2) {
                answer++;
            }
        }
        System.err.println(answer);

        return answer;
    }
}

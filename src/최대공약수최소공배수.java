public class 최대공약수최소공배수 {
    public static void main(String[] args) {
        solution(15,6);
    }

    static int[] solution(int n, int m) {
        int[] answer = {};
        int min = 0;
        int max = 0;

        // 최소 공배수 : 큰 수에 작은 수가 나뉘어지면 최소 공배수는 큰 수
                            // 나뉘어지지 않으면 큰 수 * 1,2,3... 했을 때 작은수 나누면0
                             // or 곱한 값
        // 최대 공약수 : 큰 수에 작은 수가 나뉘어지면 최대 공약수는 작은 수
                            // 둘이 i로 나눴을때 둘 다 0이면 최대 공약수는 i
                            // 나뉘어지지 않으면 최대 공약수는 1
        if(n < m) {
            if(m%n==0) {
                max = n;
                min = m;
            }
            else {
                for(int i=n; i>1; i--) {
                    if(m%i == 0 && n%i == 0) {
                        max = i;
                        break;
                    }
                    else {
                        max = 1;
                    }
                }
                for(int j=1; j<n; j++) {
                    if((m*j) % n == 0) {
                        min = m * j;
                        break;
                    }   
                    else {
                        min = n * m;
                    }
                }
            }
        } 

        else {
            if(n%m==0) {
                max = m;
                min = n;
            }
            else {
                for(int i=m; i>1; i--) {
                    if(n%i == 0 && m%i == 0) {
                        max = i;
                        break;
                    }
                    else {
                        max = 1;
                    }
                }
                for(int j=1; j<m; j++) {
                    if((n*j) % m == 0) {
                        min = n * j;
                        break;
                    }   
                    else {
                        min = n * m;
                    }
                }
            }
        } 
        System.out.println("최대 공약수 : " + max);
        System.out.println("최소 공배수 : " + min);

        return answer;
    }
}
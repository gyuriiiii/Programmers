import java.util.ArrayList;

public class 같은숫자는싫어 {
    public static void main(String[] args) {
        int[] arr = { 1,1,3,3,0,1,1 };
        Solution(arr);
    }

    static int[] Solution(int []arr) {
        int[] answer = {};
        
        int[] num = new int[10];
        for(int i=0; i<arr.length; i++) {
            num[arr[i]] += 1;
        }

        int cnt=0;
        for(int j=0; j<num.length; j++) {
            if(num[j] != 0) {
                cnt++; 
            }
        }
        answer = new int[cnt];



        return answer;
    }
}

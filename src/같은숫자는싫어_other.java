import java.util.ArrayList;

public class 같은숫자는싫어_other {
    public static void main(String[] args) {
        int[] arr = { 4,4,4,3,3 };
        Solution(arr);
    }

    static int[] Solution(int []arr) {
        ArrayList<Integer> list = new ArrayList<>();
        int index = -1;

        for (int num : arr) {
            if(index != num) {
                list.add(arr[num]);
            } 
            index = arr[num];
        }

        int[] answer = new int[list.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = list.get(i);            
        }

        return answer;
    }
}

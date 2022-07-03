import java.util.*;

public class k번째수 {
    public static void main(String[] args) {
        int[] array = { 1, 5, 2, 6, 3, 7, 4 };
        int[][] commands = { { 2, 5, 3 }, { 4, 4, 1 }, { 1, 7, 3 } };

        Solution(array, commands);
    }

    // array 배열의 i번째 숫자부터 j번째 숫자까지 자르고 정렬 후,
    // 정렬한 배열의 k번째 수 구하기
    // commands[?][0] = i
    // commands[?][1] = j
    // commands[?][2] = k

    // k번째 수 구하기
    static int[] Solution(int[] array, int[][] commands) {
        int start = 0;
        int end = 0;
        int num = 0;

        int[] answer = new int[commands.length];
        int cnt = 0;

        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < commands.length; i++) {
            list.removeAll(list);
            start = commands[i][0];
            end = commands[i][1];
            num = commands[i][2]-1;

            for (int j = start; j <= end; j++) {
                list.add(array[j-1]);
                Collections.sort(list);
            }
            answer[cnt++] = list.get(num);
        }

        return answer;

    }
}

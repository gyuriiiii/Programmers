public class 행렬 {
    public static void main(String[] args) {
        // int[][] arr1 = { { 1, 2 }, { 2, 3 } };
        // int[][] arr2 = { { 3, 4 }, { 5, 6 } };
        int[][] arr1 = { { 1 }, { 2 } };
        int[][] arr2 = { { 3 }, { 4 } };
        Solution(arr1, arr2);
    }

    // 행렬의 덧셈
    // 행과 열의 크기가 같은 두 행렬의 같은 행, 같은 열의 값 서로 더함
    static int[][] Solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr1[9].length];

        // answer[0][0] = arr1[0][0] + arr2[0][0]
        // answer[0][1] = arr1[0][1] + arr2[0][1]
        // answer[1][0] = arr1[1][0] + arr2[1][0]
        // answer[1][1] = arr1[1][1] + arr2[1][1]
        for(int i=0; i<answer.length; i++) { // 0 1
            for(int j=0; j<answer[i].length; j++) { // 0 1
                answer[i][j] = arr1[i][j] + arr2[i][j];
            }
        }

        return answer;
    }
}

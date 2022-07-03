public class 없는숫자더하기 {
    public static void main(String[] args) {
        int [] numbers = { 1,2,3,4,6,7,8,0 };
        Solution(numbers);
    }

    static int Solution(int[] numbers) {
        int answer = 0;
        
        int[] arr = new int[10];
        for(int i=0; i<numbers.length; i++) {
            arr[numbers[i]] += 1;
        }
        
        for(int i=0; i<arr.length; i++) {
            if(arr[i] == 0) {
                answer += i;
            }
        }
        return answer;
    }
}

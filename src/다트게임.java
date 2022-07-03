public class 다트게임 {
    public static void main(String[] args) {
        Solution("1D2S#10S");
        Solution("1D2S0T");
        Solution("1S*2T*3S");
        Solution("1D#2S*3S");
    }

    static int Solution(String dartResult) {
        int answer = 0;

        String temp = "";
        int arr[] = new int[3];
        int idx = 0;

        for (int i = 0; i < dartResult.length(); i++) {
            switch (dartResult.charAt(i)) {
                case 'S':
                    arr[idx] = (int) Math.pow(Integer.valueOf(temp), 1);
                    temp = "";
                    idx++;
                    break;
                case 'D':
                    arr[idx] = (int) Math.pow(Integer.valueOf(temp), 2);
                    temp = "";
                    idx++;
                    break;
                case 'T':
                    arr[idx] = (int) Math.pow(Integer.valueOf(temp), 3);
                    temp = "";
                    idx++;
                    break;
                case '*':
                    arr[idx - 1] = arr[idx - 1] * 2;
                    if (idx > 1) arr[idx - 2] = arr[idx - 2] * 2;
                    break;
                case '#':
                    arr[idx - 1] = arr[idx - 1] * (-1);
                    break;
                default:
                    temp += String.valueOf(dartResult.charAt(i));
                    break;
            }
        }

        for (int i = 0; i < arr.length; i++) {
            answer += arr[i];
        }
        System.out.println(answer);

        return answer;
    }
}

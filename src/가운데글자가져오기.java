public class 가운데글자가져오기 {
    public static void main(String[] args) {
        Solution("abcde");
    }

    static String Solution(String s) {
        String answer = "";
        int length = s.length();

        if(length%2==0) { // 단어 길이 짝수
            answer += s.charAt(length/2-1);
            answer += s.charAt(length/2);    
        }
        else { // 단어 길이 홀수
            answer += s.charAt(length/2);
        }

        return answer;
    }
    
}

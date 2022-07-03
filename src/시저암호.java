public class 시저암호 {
    public static void main(String[] args) {
        // Solution("AB", 1);
        Solution("z", 1);
        Solution("a B z", 4);
    }

    static String Solution(String s, int n) {
        String answer = "";

        for(int i=0; i<s.length(); i++) { 
            char c = s.charAt(i);

            if(c==' ') { // 공백인 경우
                answer += c;    
                continue;
            }

            if(c>='a' && c<='z') {
                if(c+n > 'z') {
                    answer += (char) (c-26+n);
                }
                else {
                    answer += (char)(c+n);
                }
            }

            if(c>='A' && c<='Z') {
                if(c+n > 'Z') {
                    answer += (char) (c-26+n);
                }
                else {
                    answer += (char)(c+n);
                } 
            }

        }
        System.out.println(answer);

        return answer;
    }
}

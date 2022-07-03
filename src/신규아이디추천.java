class Solution {
    public static String solution(String new_id) {
        String answer = "";

        String step1 = new_id.toLowerCase(); // 소문자로 치환
        
        StringBuilder step2 = new StringBuilder();
        for (int i = 0; i < step1.length(); i++) {
            char c = step1.charAt(i);

            if ((c >= 'a' && c <= 'z') || (c >= '0' && c <= '9') || (c == '-') || (c == '_') || (c == '.')) {
                step2.append(c);
            }
        }

        // 3단계
        String step3 = step2.toString().replace("..", ".");
        while (step3.contains("..")) {
            step3 = step3.replace("..", ".");
        }

        String step4 = step3;
        if (step3.length() > 0) {
            if (step3.charAt(0) == '.') { // 첫 글자 마침표인 경우
                step4 = step3.substring(1, step3.length()); // 제거
            }
        }

        if (step3.length() > 0) {
            if (step3.charAt(step3.length() - 1) == '.') { // 끝 글자 마침표인 경우
                step4 = step3.substring(0, step3.length() - 1); // 추출해서 제거
            }
        }

        String step5 = step4;
        if (step4.length() == 0) {
            step5 = step4.replace("", "a");
        }

        String step6 = step5;
        if (step6.length() >= 16) {
            step6 = step5.substring(0, 15);
            if (step6.charAt(step6.length() - 1) == '.') {
                step6 = step6.substring(0, step6.length() - 1);
            }
        }

        StringBuilder step7 = new StringBuilder(step6);
        while (step7.length() <= 2) {
            char a = step7.charAt(step6.length() - 1);

            step7 = step7.append(a);
        }

        answer = step7.toString();

        return answer;
    }

    public static void main(String[] args) {
        solution("");
    }
}
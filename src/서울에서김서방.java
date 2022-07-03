public class 서울에서김서방 {
    public static void main(String[] args) {
        String[] seoul = { "Jane", "Kim" };
        Solution(seoul);
    }

    // seoul의 element중 Kim의 위치 x를 찾아
    // 김서방은 x에 있다는 String 반환
    private static String Solution(String[] seoul) {
        String answer = "";
        int x = 0;

        for(int i=0; i<seoul.length; i++) {
            if(seoul[i].equals("Kim")) {
                x = i;
            }
        }
        answer = "김서방은" + x + "에 있다";
        
        return answer;
    }
}

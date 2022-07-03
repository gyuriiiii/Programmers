public class 신고결과받기 {
    public static void main(String[] args) {
        String[] id_list = { "muzi", "frodo", "apeach", "neo" };
        String[] report = { "muzi frodo","apeach frodo","frodo neo","muzi neo","apeach muzi" };
        int k = 2;
        
        Solution(id_list, report, k);
    }

    static int[] Solution(String[] id_list, String[] report, int k) {
        int[] answer = {};

        // 각 유저 별로 신고 당한 횟수 저장
        String[] block = new String[report.length];
        for(int i=0; i<block.length; i++) {
            block[i] = report[i];
        }

        String[] warn = new String[block.length]; 
        String[] reporter = new String[block.length]; // 신고한 사람 이름 배열
        String[] warned = new String[block.length]; // 신고당한 사람 이름 배열
        for(int i=0; i<block.length; i++) {
            warn = block[i].split(" ");
            reporter[i] = warn[0];
            warned[i] = warn[1];
        }

        // 게시판 이용 정지 될 사람 알아내기 (warned 배열에 있음)
        // warned 배열에서 2번이상 나온 사람

        // 해당 사람을 신고한 사람에게 메일 발송
        // 메일 발송한 횟수 구해서 배열로 반환

        return answer;
    }
    
}

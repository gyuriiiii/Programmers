import java.util.ArrayList;
import java.util.Arrays;

public class 완주하지못한선수 {
    public static void main(String[] args) {
        String[] participant3 = { "leo", "kiki", "eden" };
        String[] completion3 = { "eden", "kiki"};

        String[] participant = { "mislav", "stanko", "mislav", "ana" };
        String[] completion = { "stanko", "ana", "mislav"};

        String[] participant2 = { "marina", "josipa", "nikola", "vinko", "filipa" };
        String[] completion2 = { "josipa", "filipa", "marina", "nikola" };
        
        Solution(participant3, completion3);
        Solution(participant2, completion2);
        Solution(participant, completion);
    }

    static String Solution(String[] participant, String[] completion) {
        String answer = "";

        ArrayList<String> participate = new ArrayList<>(Arrays.asList(participant));
        ArrayList<String> complete = new ArrayList<>(Arrays.asList(completion));

        int cnt = 0;
        int check = 0;
        boolean flag = true;

        String name = "";
        String name_complete = "";

        // 참가자 명단 동명이인 check
        for (int i = 0; i < participant.length; i++) {
            cnt = 0;
            name = participant[i];
            for (int j = 0; j < participant.length; j++) {
                if (name == participant[j]) {
                    cnt++;
                }
            }
            if (cnt >= 2) {
                name = participant[i];
                break;
            }
        }

        // 완주자 명단 check
        name_complete = name;
        for (int j = 0; j < completion.length; j++) {
            if (name_complete == completion[j]) {
                check++;
            }
        }

        if (cnt > check) {
            flag = false;
            answer = name;
        }

        // 동명이인 없는 경우
        if (flag == true) {
            for (int i = 0; i < participant.length; i++) {
                if (complete.contains(participant[i])) { // 완료자 명단에 있으면
                    continue;
                } else {
                    answer = participant[i];
                }
            }
        }
        System.out.println(answer);

        return answer;
    }

}

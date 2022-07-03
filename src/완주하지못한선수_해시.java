import java.util.Arrays;
import java.util.HashMap;

public class 완주하지못한선수_해시 {
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

        // HashMap 생성
        HashMap<String, Integer> map = new HashMap<>();
        for (String player : participant) {
            map.put(player, map.getOrDefault(player, 0) + 1); // key는 player, value는 이전 값에 +1한 값
            // getOfDefault : map에서 player란 key를 가진 값을 가져달란 것! 
            // player가 아직 없으면 0을 달라! 즉, 이전에 없었으면 0+1=1로 set, 있으면 선수 값 가져와 +1 해 map에 넣어달란 것
        }
        // 완주자 목록에 있는 선수 빼기
        for (String player : completion) {
            map.put(player, map.get(player) - 1); // player가 갖고있는 값 가져온 후, -1
        }

        // value가 0이 아닌 선수가 완주 못 한 선수
        // keySet 사용 (map의 keySet을 통해 map이 갖고있는 key를 꺼냄)
        for(String key : map.keySet()) {
            if(map.get(key) != 0) {
                answer = key;
                break;
            } 
        }

        return answer;
    }

}

import java.util.Arrays;

public class 완주하지못한선수_sort {
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

        Arrays.sort(participant);
        Arrays.sort(completion);

        for(int i=0; i<completion.length; i++) {
            if (!participant[i].equals(completion[i])){
                answer = participant[i];
            }
            else {
                answer = participant[i+1];
            }
        }
        System.out.println(answer);

        return answer;
    }

}

import java.util.ArrayList;
import java.util.Collections;

public class 내맘대로문자열정렬 {    
    public static void main(String[] args) throws Exception {
        String[] strings = { "sun", "bed", "car" };
        Solution(strings, 1);
    }

    static String[] Solution(String[] strings, int n) {
        ArrayList<String> list = new ArrayList<String>();
    
        for(int i = 0;i<strings.length;i++) {
            list.add(strings[i].charAt(n) + strings[i]);
        }
        Collections.sort(list);
    
        String[] answer = new String[list.size()];
        for(int i = 0;i<list.size();i++) {
            answer[i] = list.get(i).substring(1, list.get(i).length());
        }
        
        for(int i=0; i<answer.length; i++) {
            System.out.print(answer[i] + " ");
        }
        return answer;
    }
}

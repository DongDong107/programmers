package Level1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class 추억점수 {
    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};
        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"},{"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        System.out.println(Arrays.toString(solution(name,yearning,photo)));
    }

    public static int[] solution(String[] name, int[] yearning, String[][] photo) {

        int[] answer = new int[photo.length];

        int idx = 0;
        for (String nm : name) {
            for(int i=0; i<photo.length; i++){
                List<String> list = new ArrayList<>(Arrays.asList(photo[i]));
                if(list.contains(nm)) {
                    answer[i] += yearning[idx];
                }
            }
            idx++;
        }
        return answer;
    }
}

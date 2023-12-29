package Level1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

/*
* 해시맵을 이용해서 인덱스를 구성하면 타임아웃없이 해결할 수 있다.
* 배열을 사용하면 순회하는 동안 타임아웃이 되어버리니까..
*/
public class 달리기경주 {
    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        solution(players,callings);
    }

    public static String[] solution(String[] players, String[] callings) {
        String[] answer = {};
/*        List<String> list = Arrays.asList(players);
        for(String name : callings) {
            int idx = list.indexOf(name);
            String temp = list.get(idx);
            list.set(idx, list.get(idx-1));
            list.set(idx-1, temp);
        }*/

        HashMap<String, Integer> map = new HashMap<>();
        Integer idx = 0;
        for (String name : players){
            map.put(name, idx);
            idx++;
        }

        for (String name : callings) {
            Integer rank = Integer.valueOf(map.get(name));
            String frontName = players[rank-1];
            players[rank] = frontName;
            map.replace(frontName, rank);

            map.replace(name, rank-1);
            players[rank-1] = name;
        }

        System.out.println(Arrays.toString(players));
        return players;
    }
}

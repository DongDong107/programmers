package Level1;

import java.util.Arrays;

/*
* 2023 12 13 첫풀이 틀림 다시풀어야함.
*
*/
public class 공원산책 {
    public static void main(String[] args) {
        String[] park = {"OSO","OOO","OXO","OOO"};
        String[] routes = {"E 2","S 3","W 1"};

        System.out.println(Arrays.toString(solution(park, routes)));
    }
    public static int[] solution(String[] park, String[] routes) {
        int[] answer = {};

        // 현재 좌표
        int[] coord = {0,0};
        for(int i=0; i< park.length; i++){
            if(park[i].contains("S")){
                coord[1] = park[i].indexOf("S");
                coord[0] = i;
                break;
            }
        }
        // 예상 좌표
        int[] chkCrd = coord.clone();

        // 이동할 때 공원을 벗어나는 지
        int minX = 0;
        int minY = 0;
        int maxX = park[0].length()-1;
        int maxY = park.length-1;

        for(String next : routes) {
            String op = String.valueOf(next.charAt(0));
            int n = Integer.parseInt(String.valueOf(next.charAt(2)));

            if(op.equals("E")) {
                if(maxX < chkCrd[1]+n) {
                    continue;
                }
                for(int i=0; i<n; i++){
                    chkCrd[1] += 1;
                    String chkX = String.valueOf(park[chkCrd[1]].charAt(chkCrd[0]));
                    if(chkX.equals("X")) {
                        chkCrd = coord.clone();
                        break;
                    }
                }
                coord = chkCrd.clone();
                continue;
            }
            if(op.equals("W")) {
                if(minX > chkCrd[1]-n) {
                    continue;
                }
                for(int i=0; i<n; i++){
                    chkCrd[1]-=1;
                    String chkX = String.valueOf(park[chkCrd[1]].charAt(chkCrd[0]));
                    if(chkX.equals("X")) {
                        chkCrd = coord.clone();
                        break;
                    }
                }
                coord = chkCrd.clone();
                continue;
            }
            if(op.equals("S")) {
                if(maxY < chkCrd[0]+n) {
                    continue;
                }
                for(int i=0; i<n; i++){
                    chkCrd[0]+=1;
                    String chkX = String.valueOf(park[chkCrd[0]].charAt(chkCrd[1]));
                    if(chkX.equals("X")) {
                        chkCrd = coord.clone();
                        break;
                    }
                }
                coord = chkCrd.clone();
                continue;
            }
            if(op.equals("N")) {
                if(minY < chkCrd[0]-n) {
                    continue;
                }
                for(int i=0; i<n; i++){
                    chkCrd[0]-=1;
                    String chkX = String.valueOf(park[chkCrd[0]].charAt(chkCrd[1]));
                    if(chkX.equals("X")) {
                        chkCrd = coord.clone();
                        break;
                    }
                }
                coord = chkCrd.clone();
                continue;
            }

        }

        // 이동 중 장애물을 만나는 지
        return coord;
    }
}

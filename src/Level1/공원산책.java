package Level1;

import java.util.Arrays;

/*
* 2023 12 13 첫풀이 틀림 다시풀어야함.
* 조건을 정확하게 인지하고 풀어야 할 것같다.
* 처음에 부면 조건 정리는 잘 한것 같다. (현재좌표,이동예상좌표 두고, 이동할 때 외곽을 벗어나는 지와, X일 경우에 조건 처리.)
* 근데 가장 메인인 비교해야 될 정확한 배열 속 대상과 사소한 조건 정리가 항상 틀리는 것 같음.
*/
public class 공원산책 {
    public static void main(String[] args) {
        String[] park = {"OOOOO", "OOOOO", "OOSOO", "OOOOO", "OOOOO"};
        String[] routes = {"E 2", "W 2", "S 2", "N 3"};

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
        // 이동 중 장애물을 만나는 지
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
                    String chkX = String.valueOf(park[chkCrd[0]].charAt(chkCrd[1]));
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
                    String chkX = String.valueOf(park[chkCrd[0]].charAt(chkCrd[1]));
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
                if(minY > chkCrd[0]-n) {
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

        return coord;
    }
}

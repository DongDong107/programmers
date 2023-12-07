package day_1207;

import java.util.Arrays;

public class 바탕화면정리 {
    public static void main(String[] args) {
        /*
        [".#...", "..#..", "...#."]	[0, 1, 3, 4]
        ["..........", ".....#....", "......##..", "...##.....", "....#....."]	[1, 3, 5, 8]
        [".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."]	[0, 0, 7, 9]
        ["..", "#."]	[1, 0, 2, 1]
        */
        String[] samp1 = {".#...", "..#..", "...#."};
        String[] samp2 = {"..........", ".....#....", "......##..", "...##.....", "....#....."};
        String[] samp3 = {".##...##.", "#..#.#..#", "#...#...#", ".#.....#.", "..#...#..", "...#.#...", "....#...."};
        String[] samp4 = {"..", "#."};

        System.out.println(Arrays.toString(solution(samp1)));
        System.out.println(Arrays.toString(solution(samp2)));
        System.out.println(Arrays.toString(solution(samp3)));
        System.out.println(Arrays.toString(solution(samp4)));

    }

    public static int[] solution(String[] wallpaper) {

        int luy = 0;
        int lux = 0;
        int rdx = 0;
        int rdy = 0;

        // 첫Y (lux)
        // 배열 중에 #을 포함하면 저장 후 리턴.
        for(int i=0; i<wallpaper.length; i++){
            if(wallpaper[i].contains("#")) {
                lux = i;
                break;
            }
        }

        // 첫x (luy)
        // 각 배열의 첫번째 #을 비교하여 리턴.
        for (int i=0; i<wallpaper.length; i++){
            String[] temp = wallpaper[i].split("");
            if(temp[0].equals("#")){
                luy = 0;
                break;
            }
            for(int j=0; j<temp.length; j++){
                if(luy == 0 && temp[j].equals("#")) {
                    luy = j;
                    break;
                }
                if(temp[j].equals("#") && j<luy){
                    luy = j;
                    break;
                }
            }
        }

        // 끝y (rdx)
        // 각 배열에 #이 있으면 idx 값으로 업데이트
        for(int i=0; i<wallpaper.length; i++) {
            if(wallpaper[i].contains("#")) {
                rdx = i+1;
            }
        }

        // 끝x (rdy)
        // 각 배열의 #이 나올때마다 idx 저장하고 이건 맥스 차와 비교해서.
        for (int i=0; i<wallpaper.length; i++){
            String[] temp = wallpaper[i].split("");
            for(int j=0; j<temp.length; j++){
                if(temp[j].equals("#") && j+1>rdy){
                    rdy = j+1;
                }
            }
        }

        int[] answer = {lux,luy,rdx,rdy};
        return answer;
    }
}


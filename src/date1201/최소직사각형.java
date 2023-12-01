package date1201;

public class 최소직사각형 {
    public static void main(String[] args) {

    }

    public static int solution(int[][] sizes) {
        int answer = 0;

        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0]<sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }

        int maxW = sizes[0][0];
        int maxH = sizes[0][1];

        int idx = 0;
        for(int[] sub : sizes){
            if(maxW < sub[0]) maxW = sub[0];
            if(maxH < sub[1]) maxH = sub[1];
            idx++;
        }

        answer = maxW*maxH;


        return answer;
    }
}

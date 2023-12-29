package Level1;

public class 덧칠하기 {
    /*
    * 오.. 그리디 알고리즘을 사용하면 된다고 한다...
    * 물론 되게 색다르게 풀어서 되려나 하고 풀어보긴 했는데 역시 안됐다 ㅋㅋㅋㅋ
    */
    public static void main(String[] args) {
        int n = 8;
        int m = 4;
        int[] section = {2, 3, 6};

        solution(n,m,section); // 2
    }

    public static int solution(int n, int m, int[] section) {
        int answer = 0;
/*        int distance = section[section.length-1] - section[0] + 1;

        if(distance%m == distance){
            answer = 1;
        }
        if(0 < distance%m && distance%m < distance){
            answer = distance/m + 1;
        }
        if(distance%m == 0){
            answer = distance/m;
        }
        System.out.println(answer);*/


        return answer;
    }
}

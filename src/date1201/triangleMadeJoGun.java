package date1201;

public class triangleMadeJoGun {
    /*문제 설명
    선분 세 개로 삼각형을 만들기 위해서는 다음과 같은 조건을 만족해야 합니다.

    가장 긴 변의 길이는 다른 두 변의 길이의 합보다 작아야 합니다.
    삼각형의 두 변의 길이가 담긴 배열 sides이 매개변수로 주어집니다. 나머지 한 변이 될 수 있는 정수의 개수를 return하도록 solution 함수를 완성해주세요.

    제한사항
    sides의 원소는 자연수입니다.
    sides의 길이는 2입니다.
1 ≤ sides의 원소 ≤ 1,000*/

    public static void main(String[] args) {


    }

    public static int solution(int[] sides) {
        int answer = 0;
        int max = sides[0];
        int min = sides[1];
        if (sides[0] < sides[1]){
            max = sides[1];
            min = sides[0];
        }

        int s = max-min;
        int e = max+min;

        //case 1 : 배열안의 max값이 세 변중 가장 클 때.
        // -> 1부터 시작하는 수랑 min 값의 핪이 max보다 클 때만. 같아지면 그대로 게임셋


        //case 2 : 배열 두 값을 제외한 다른 한변의 길이가 가장 클 때.
        //두 값의 합이 다른 한변보다 커야함.
        answer = e-s-1;
        return answer;
    }
}

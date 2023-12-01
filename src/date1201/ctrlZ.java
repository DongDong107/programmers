package date1201;

public class ctrlZ {
/*
        숫자와 "Z"가 공백으로 구분되어 담긴 문자열이 주어집니다.
        문자열에 있는 숫자를 차례대로 더하려고 합니다.
        이 때 "Z"가 나오면 바로 전에 더했던 숫자를 뺀다는 뜻입니다.
        숫자와 "Z"로 이루어진 문자열 s가 주어질 때, 머쓱이가 구한 값을 return 하도록 solution 함수를 완성해보세요.

        제한사항
        1 ≤ s의 길이 ≤ 200
        -1,000 < s의 원소 중 숫자 < 1,000
        s는 숫자, "Z", 공백으로 이루어져 있습니다.
        s에 있는 숫자와 "Z"는 서로 공백으로 구분됩니다.
        연속된 공백은 주어지지 않습니다.
        0을 제외하고는 0으로 시작하는 숫자는 없습니다.
        s는 "Z"로 시작하지 않습니다.
        s의 시작과 끝에는 공백이 없습니다.
        "Z"가 연속해서 나오는 경우는 없습니다.*/

    public static void main(String[] args) {
        // 숫자 + 공백 + Z 인 글자를 ""으로 대체
        /*String a = "1 2 Z 3";*/
        /*"1 2 Z 3"	4
        "10 20 30 40"	100
        "10 Z 20 Z 1"	1
        "10 Z 20 Z"	0
        "-1 -2 -3 Z"	-3*/
        String a = "10 Z 20 Z";
        String b = "10 20 30 40";
        String c = "10 Z 20 Z 1";
        String d = "10 Z 20 Z";
        String e = "-1 -2 -3 Z";

        System.out.println(space(a));
        System.out.println(space(b));
        System.out.println(space(c));
        System.out.println(space(d));
        System.out.println(space(e));


        // 숫자 공백을 잘 구별해서 더하기

    }

    public static int space(String a){
        int answer = 0;
        String b = a.replaceAll("-?\\d+\\sZ\\s?","");
        b = b.replace("  ", " ");
        if(b == ""){
            return answer;
        }
        String[] arr = b.split(" ");

        for(String num : arr) {
            if(num.equals("")) continue;
            int num2 = Integer.parseInt(num);
            answer += num2;
        }

        return answer;
    }
}

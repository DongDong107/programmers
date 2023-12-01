package new1128;

public class Main {
    public static void main(String[] args) {
        String[] babbling = {"aya", "yee", "u", "maa", "wyeoo"};
        int answer = 0;

        String[] ongal = {"aya", "ye", "woo", "ma"};

        for (int i=0; i<babbling.length; i++) {
            for(int j=0; j<ongal.length; j++) {
                babbling[i] = babbling[i].replace(ongal[j]," ");
            }
        }

        for (int i=0; i<babbling.length; i++) {
            babbling[i] = babbling[i].replace(" ","");
            if(babbling[i].equals("")) answer++;
        }

        System.out.println(answer);
    }
}

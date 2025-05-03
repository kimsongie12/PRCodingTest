package introduction100.특정문자제거하기;

public class q21 {
    public String solution(String my_string, String letter) {

        StringBuilder br = new StringBuilder();

        char le = letter.charAt(0);
        for(int i=0; i<my_string.length(); i++){
            char my = my_string.charAt(i);
            if(my != le){
                br.append(my);
            }
        }
        return br.toString();
    }

    public static void main(String[] args) {
        q21 num = new q21();
        String my_string = "abcdef";
        String letter = "f";
        String res = num.solution(my_string,letter);
        System.out.println(res);
    }
}


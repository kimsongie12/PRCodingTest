package introduction100.문자열안에문자열;

public class q17 {
    public int solution(String str1, String str2) {
        if(str1.contains(str2)){
            return 1;
        }else {
            return 2;
        }
    }

    public static void main(String[] args) {
        q17 test = new q17();
        String str1 ="ab6CDE443fgh22iJKlmn1o";
        String str2 ="6CD";
        int res = test.solution(str1,str2);
        System.out.println(res);


    }
}

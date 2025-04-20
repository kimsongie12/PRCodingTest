package introduction100.나이출력;

public class q2 {
    public int s(int age){
        int answer  =2022-(age-1);
        return  answer;
    }

    public static void main(String[] args) {
        q2 res = new q2();
        int result = res.s(23);
        int result2 = res.s(40);
        System.out.println(result);
        System.out.println(result2);

    }
}

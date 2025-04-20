package introduction100.각도기;

public class q9 {
    public int solution(int angle) {
        if(angle <90 && 0<angle){
            return 1;
        } else if (angle == 90) {
            return 2;
        } else if (angle <180 && 90<angle) {
            return 3;
        }else {
            return 4;
        }
    }

    public static void main(String[] args) {
        q9 num = new q9();
        int res = num.solution(90);
        System.out.println(res);
    }
}

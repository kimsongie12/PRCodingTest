package introduction100.삼각형완성조건1;

public class q14 {
    public int solution(int[] sides) {
        int total = 0;
        int max = sides[0]; // 초기화
        for(int i =0; i<sides.length; i++){
            total += sides[i];
            if(sides[i]>max){
                max = sides[i];
            }
        }
        int sum = total - max;
        if(sum > max){
            return  1;
        }return 2;
    }

    public static void main(String[] args) {
        q14 test = new q14();
        int [] sides = { 199, 72, 222};
        int res = test.solution(sides);
        System.out.println(res);
    }
}

package introduction100.문자반복출력하기;
// 전체 글자 반봅
// 그 안의 글자수를 n만큼 반복
public class q20 {
    public String solution(String my_string, int n) {
        String answer = "";
        for(int i =0; i<my_string.length(); i++){
            for(int k =0; k<n; k++){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        q20 num = new q20();
        String my_str = "hello";
        int n = 3;
        String res = num.solution(my_str,n);
        System.out.println(res);
    }
}

/*
StringBuilder 사용
StringBuilder sb = new StringBuilder();
for(int i =0; i<my_string.length(); i++){
    for(int k =0; k<n; k++){
        sb.append(my_string.charAt(i));
    }
}
return sb.toString();

append()를 사용해서 객체 재생성 없이 빠르게 값을 생성할 수 있음

 */
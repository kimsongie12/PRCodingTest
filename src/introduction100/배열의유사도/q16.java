package introduction100.배열의유사도;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class q16 {
    public int solution(String[] s1, String[] s2) {
        Set<String> set = new HashSet<>(Arrays.asList(s1)); // 배열을 중복없이 리스트로 변환
        int count =0;

        for(String str : s2){
            if(set.contains(str)){
                count++;
            }
        }
        return count;

    }

    public static void main(String[] args) {
        q16 test = new q16();
        String [] s1 = {"a", "b", "c"};
        String [] s2 = {"com", "b", "d", "p", "c"};
        int res = test.solution(s1,s2);
        System.out.println(res);
    }
}

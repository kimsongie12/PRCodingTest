package level1.없는숫자더하기;

import java.util.Arrays;

class q250511 {
    public int solution(int[] numbers) {
        int[] arr = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        Arrays.sort(numbers); // 오름차순 정렬

        int sum = 0;
        int index = 0; // numbers 배열의 인덱스

        for (int i = 0; i < arr.length; i++) {
            if (index < numbers.length && arr[i] == numbers[index]) {
                index++; // 같은 값이 있다면 numbers 인덱스만 증가
            } else {
                sum += arr[i]; // numbers에 없는 값이므로 누적
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        q250511 num= new q250511();
        int numbers [] = {1,2,3,4,6,7,8,0};
        int res = num.solution(numbers);
        System.out.println(res);
    }
}

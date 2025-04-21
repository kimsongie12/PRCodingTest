package introduction100.머쓱이보다큰사람;

/*  배열로 한번만 순회해서 머쓱이보다 작은 사람을 찾아냄
*   모든 키를 한번씩 비교해야하기 때문에 제일 적절함
*  시간복잡도 O(n) 공간복잡도 O(1)
* */
public class q18 {

        public int solution(int[] array, int height) {
            //height보다 큰 사람
            int count =0;
            for(int i=0; i<array.length; i++) {

                if (height < array[i]) {
                    count++;
                }
            }
            return count;
        }

    public static void main(String[] args) {
        q18 num1 = new q18();
        int [] arr = {180, 120, 140};
        int height = 190;
        int res = num1.solution(arr,height);
        System.out.println(res);
    }

}

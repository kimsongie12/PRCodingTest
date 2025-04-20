package introduction100.편지;

public class q15 {
    public int solution(String message) {
        int count =0;
        for (int i =0; i<message.length(); i++){
            count++;
        }
        return count *2;
    }

    public static void main(String[] args) {
        q15 test = new q15();
        String message = "happy birthday!";
        int res = test.solution(message);
        System.out.println(res);
    }
}

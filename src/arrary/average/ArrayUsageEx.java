package arrary.average;

//문제 : 평균 점수 계산, 최고 점수 해당하는 학생찾기, 점수별 학생 분류, 학생 이름 정렬, 점수 통계 계산
//풀이1) 변수 설정 - 학생 이름과 점수 저장 및 처리하는 변수 선언하기
//풀이2) 평균 점수 계산
//풀이3) 최고 점수와 해당 학생 찾기
//풀이4) 점수별 학생 분류
//풀이5) 학생 이름 정렬
//풀이6) 점수 통계 계산

public class ArrayUsageEx {
    public static void main(String[] args) {
        //풀이1) 변수 설정 - 학생 이름과 점수 저장 및 처리하는 변수 선언하기
        String[] studentNames = {"Alice", "Bob", "Charlie", "David", "Eve"};
        int[] studentScores = {85, 92, 78, 95, 88};

        //풀이2) 평균 점수 계산
        //모든 점수 합산 총액 / 인원수
        int sum = 0;
        for (int i = 0; i < studentScores.length; i++) {
            sum += studentScores[i];
        }
        double avg = sum/studentScores.length;
        System.out.println("풀이2)"+avg);

        //풀이3) 최고 점수와 해당 학생 찾기
        int maxscore = studentScores[0]; //최대값 변수를 두고, 배열을 갱신하는 방법
        int maxindex = 0;
        for(int i =1; i<studentScores.length; i++){
            if (maxscore < studentScores[i]){
                maxscore = studentScores[i];
                maxindex = i;
            }
        }
        System.out.println("풀이3)"+maxscore);
        System.out.println("풀이3)"+studentNames[maxindex]);



    }

}

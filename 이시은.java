package koreait.day17;

import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class StudentScoreTest2 {
	//이시은 
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<StudentScoreTest2> stus = new ArrayList<>();
        Random r = new Random();
        int max = 100, min = 10;

        System.out.println("입력된 학생 인원수(1~10) 만큼 성적 데이터가 난수로 발생됩니다.");
        System.out.print("학생 인원 수를 입력하세요. -> ");
        int studentCount = sc.nextInt(); // 5

        for (int i = 0; i < studentCount; i++) {
            int korean = r.nextInt(max - min) + min;
            int english = r.nextInt(max - min) + min;
            int science = r.nextInt(max - min) + min;
            System.out.println("국어,영어,과학 점수가 자동으로 입력되었습니다. 학생이름을 입력하세요.");
            System.out.print("이름 -> ");
            String name = sc.next();
            StudentScoreTest2 studentScore = new StudentScoreTest2();
            studentScore.setName(name);
            stus.add(studentScore);
        }

        System.out.println(":::::저장된 성적데이터를 확인하세요.:::::");
        DecimalFormat df = new DecimalFormat("###.00");
        for (StudentScoreTest2 score : stus) {
            System.out.print("[번호 : " + score.getName() + "  이름 : " + score.getName() + "]");
            System.out.print("  국어 : " + score.getKorean() + " 영어 : " + score.getEnglish() + "과학 : " + score.getScience());
            System.out.println("  -총점 : " + score.sum() + " 평균 : " + df.format(score.avg()));

        }

        System.out.println(":::::총점 기준 최우수 학생 이름과 점수입니다..:::::");
        String max_sum = stus.get(0).sum();
        int max_idx = 0;
        for (int i = 0; i < stus.size(); i++) { // stus 5개, i = 2
            if (max_sum < stus.get(i).sum()) {
                max_sum = stus.get(i).sum();
                max_idx = i;
            }
        }
        System.out.print("최우수 학생: " + stus.get(max_idx).getName());
        System.out.println("(총점 : " + stus.get(max_idx).sum() + ",평균 : " + df.format(stus.get(max_idx).avg()) + ")");
    }

	private String sum() {
		// TODO Auto-generated method stub
		return null;
	}

	private Object avg() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getScience() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getEnglish() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getKorean() {
		// TODO Auto-generated method stub
		return null;
	}

	private String getName() {
		// TODO Auto-generated method stub
		return null;
	}

	private void setName(String name) {
		// TODO Auto-generated method stub
		
	}
}
package student_ex;

import java.util.Random;

public class Ex8 {

	public static void main(String[] args) {
		Random ran = new Random();

		int[] kors = new int[2];
		int[] engs = new int[2];
		int[] mats = new int[2];
		int[] totals = new int[2];
		double[] avgs = new double[2];
		int[] ranks = new int[2];

		// 과목 점수저장 반복문
		for (int i = 0; i < totals.length; i++) {
			kors[i] = ran.nextInt(101);
			engs[i] = ran.nextInt(101);
			mats[i] = ran.nextInt(101);
		}
		
		// 과목 점수 합계 저장 반복문
		for(int i = 0; i < totals.length; i++) {
			totals[i] = kors[i] + engs[i] + mats[i];
		}
		
		// 과목 점수 평균 저장 반복문
		for(int i = 0; i < totals.length; i++) {
			avgs[i] = (double) totals[i] / 3;
		}

		// 석차 저장 반복문
		for(int i = 0; i < totals.length; i++) {
			ranks[i] = 1;
			
			for(int j = 0; j < totals.length; j++) {
				if(totals[i] < totals[j]) {
					ranks[i]++;
				}
			}
		}

		// 출력 반복문
		for(int i = 0; i < totals.length; i++) {
			System.out.println("<< "+ (i + 1) +" 번째 학생의 성적 >>");
			System.out.println("국어 성적 : " + kors[i]);
			System.out.println("영어 성적 : " + engs[i]);
			System.out.println("수학 성적 : " + mats[i]);
			System.out.println("총점 : " + totals[i]);
			System.out.println("평균 : " + avgs[i]);
			System.out.println("석차 : " + ranks[i]);
		}

	}

}

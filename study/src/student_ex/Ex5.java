package student_ex;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int[] kors = new int[2];
		int[] engs = new int[2];
		int[] mats = new int[2];
		
		System.out.println("<< 1 번째 학생의 성적 >>");
		System.out.print("국어 성적 : ");
		kors[0] = sc.nextInt();
		System.out.print("영어 성적 : ");
		engs[0] = sc.nextInt();
		System.out.print("수학 성적 : ");
		mats[0] = sc.nextInt();
		
		System.out.println("<< 2 번째 학생의 성적 >>");
		System.out.print("국어 성적 : ");
		kors[1] = sc.nextInt();
		System.out.print("영어 성적 : ");
		engs[1] = sc.nextInt();
		System.out.print("수학 성적 : ");
		mats[1] = sc.nextInt();
		
		int[] totals = {kors[0] + engs[0] + mats[0],
						kors[1] + engs[1] + mats[1] };		
		double[] avgs = {(double)totals[0] / 3, 
						 (double)totals[1] / 3};
		
		int[] ranks = {avgs[0] > avgs[1] ? 1 : 2,
					   avgs[1] > avgs[0] ? 1 : 2};
		ranks[0] = avgs[0] == avgs[1] ? 1 : ranks[0];
		ranks[1] = avgs[0] == avgs[1] ? 1 : ranks[1];
		
		System.out.println("<< 1 번째 학생의 성적 >>");
		System.out.println("국어 성적 : " + kors[0]);
		System.out.println("영어 성적 : " + engs[0]);
		System.out.println("수학 성적 : " + mats[0]);
		System.out.println("총점 : " + totals[0]);
		System.out.println("평균 : " + avgs[0]);
		System.out.println("석차 : " + ranks[0]);
		
		
		System.out.println("<< 2 번째 학생의 성적 >>");
		System.out.println("국어 성적 : " + kors[1]);
		System.out.println("영어 성적 : " + engs[1]);
		System.out.println("수학 성적 : " + mats[1]);
		System.out.println("총점 : " + totals[1]);
		System.out.println("평균 : " + avgs[1]);
		System.out.println("석차 : " + ranks[1]);
		
		
		
	}
}

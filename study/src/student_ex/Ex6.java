package student_ex;

import java.util.Random;

public class Ex6 {

	public static void main(String[] args) {
		Random ran = new Random();
		
		int[] kors = new int[2];
		int[] engs = new int[2];
		int[] mats = new int[2];
		int[] totals = new int[2];
		double[] avgs = new double[2];
		int[] ranks = new int[2];
		
		kors[0] = ran.nextInt(101);
		engs[0] = ran.nextInt(101);
		mats[0] = ran.nextInt(101);
		
		kors[1] = ran.nextInt(101);
		engs[1] = ran.nextInt(101);
		mats[1] = ran.nextInt(101);
		
		totals[0] = kors[0] + engs[0] + mats[0];		
		totals[1] = kors[1] + engs[1] + mats[1];		
		avgs[0] = (double)totals[0] / 3; 
		avgs[1] = (double)totals[1] / 3;
		
		ranks[0] = avgs[0] > avgs[1] ? 1 : 2;
		ranks[1] = avgs[1] > avgs[0] ? 1 : 2;
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

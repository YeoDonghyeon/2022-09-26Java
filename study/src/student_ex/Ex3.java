package student_ex;

public class Ex3 {

	public static void main(String[] args) {
		int kor1 = 64;
		int eng1 = 27;
		int mat1 = 91;
		int total1 = kor1 + eng1 + mat1;
		double avg1 = (double)total1 / 3;
	
		int kor2 = 58;
		int eng2 = 23;
		int mat2 = 76;
		int total2 = kor1 + eng1 + mat1;
		double avg2 = (double)total2 / 3;
		
		int rank1 = avg1 > avg2 ? 1 : 2;
		int rank2 = avg1 < avg2 ? 1 : 2;
		rank1 = avg1 == avg2 ? 1 : rank1;
		rank2 = avg1 == avg2 ? 1 : rank2;
		
		System.out.println("<< 1 번째 학생의 성적 >>");
		System.out.println("국어 성적 : " + kor1);
		System.out.println("영어 성적 : " + eng1);
		System.out.println("수학 성적 : " + mat1);
		System.out.println("총점 : " + total1);
		System.out.println("평균 : " + avg1);
		System.out.println("석차 : " + rank1);
		
		
		System.out.println("<< 2 번째 학생의 성적 >>");
		System.out.println("국어 성적 : " + kor2);
		System.out.println("영어 성적 : " + eng2);
		System.out.println("수학 성적 : " + mat2);
		System.out.println("총점 : " + total2);
		System.out.println("평균 : " + avg2);
		System.out.println("석차 : " + rank2);
		
		
	}
}

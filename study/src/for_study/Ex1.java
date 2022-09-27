package for_study;

public class Ex1 {

	public static void main(String[] args) {
		// 1부터 100까지 정수의 합
		int i;
		int total = 0;
		for(i=1; i <101; i++) {
			total = total + i;
		}
		System.out.println(total);
		
		System.out.println("======================");
		
		
		// 등차수열의 17번째 숫자를 구하세요 2, 8, 14, 20, 26, 32
		int num = 2;
		for(int e = 1; e <= 17; e++) {
			if(e == 17) {
				System.out.println(num);
				break;
			}
			System.out.println(num);
			num = num + 6;
		}
		System.out.println("등차수열의 17번째 숫자는 = " + num);
		
	}
}

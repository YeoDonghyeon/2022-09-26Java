package if_statement;

public class Ex3 {

	public static void main(String[] args) {
		/*
		 * if ~ else if 문(= 다중 else if 문)
		 * - 두 가지 이상의 조건식을 차례대로 판별하면서
		 *   세 가지 이상의 경우의 수를 판별하는 조건문
		 * - 첫 조건을 if 문으로 판별하고, 조건 판별 결과가 false 일 때
		 *   다음 else if 문을 판별하는 조건문
		 *   단, 마지막 else 문은 생략할 수 있다.
		 * 
		 * < 기본 문법 >
		 * if(조건식1) {
		 * 		// 조건식1 의 결과가 true 일 때 실행할 문장들...
		 * 		문장1;
		 * } else if(조건식2) {
		 * 		// 조건식1 의 결과가 false 이고, 조건식2 의 결과가 true 일 때 실행할 문장들...
		 * 		문장2;
		 * } else if(조건식n) {
		 * 		// 조건식1, 2 의 결과가 false 이고, 조건식n 의 결과가 true 일 때 실행할 문장들...
		 * 		문장n;
		 * } else {
		 * 		// 위의 모든 조건식 판별 결과가 false 일 때 실행할 문장들...(옵션)
		 * 		문장x;
		 * }
		 */
		
		// 정수 num 이 5보다 크다 or 5보다 작다 or 5와 같다 판별
		int num = 5;
		
		if(num > 5) { // num 이 5보다 클 경우
			System.out.println("num 이 5보다 크다!");
		} else if(num < 5) { // num 이 5보다 크지 않고, num 이 5보다 작을 경우
			System.out.println("num 이 5보다 작다!");
		} else if(num == 5) { // num 이 5보다 크지도 않고, 작지도 않고, 5와 같을 경우
			System.out.println("num 이 5와 같다!");
		}
		
		// -------------- 위의 코드와 결과는 같지만 다른 코드 -----------------
		if(num > 5) { // num 이 5보다 클 경우
			System.out.println("num 이 5보다 크다!");
		} else if(num < 5) { // num 이 5보다 크지 않고, num 이 5보다 작을 경우
			System.out.println("num 이 5보다 작다!");
		} else { // num 이 5보다 크지도 않고, 작지도 않을 경우(= 같을 경우)
			System.out.println("num 이 5와 같다!");
		}
		
	}

}

















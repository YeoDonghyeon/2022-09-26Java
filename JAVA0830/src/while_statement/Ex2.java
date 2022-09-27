package while_statement;

public class Ex2 {

	public static void main(String[] args) {
		/*
		 * do ~ while 문
		 * - while 문과 달리 처음부터 조건을 판별하지 않고
		 *   블록문 내의 실행 문장을 먼저 실행한 후 나중에 조건 검사를 통해 반복 여부 결정
		 * - while 문은 조건식 판별 결과에 따라 실행문이 단 한 번도 실행되지 않을 수도 있지만,
		 *   do ~ while 문은 조건식 판별 결과와 상관없이 최소 한 번의 실행은 보장된다!
		 * - 한 번의 실행 후 블록문 끝에 while() 문을 통해 조건식 검사 후 반복 여부 결정
		 *   => 이 때, while() 문 뒤에 세미콜론을 통해 문장 마무리 필수!
		 *   
		 * < 기본 문법 >
		 * [초기식;]
		 * 
		 * do {
		 * 		// 조건식 결과가 true 일 때 반복 실행할 문장들...
		 * 		[증감식;]
		 * } while(조건식);
		 */
		
		int i = 11;
		
		// i 가 10 보다 크므로 조건식 판별 결과가 false 가 되고
		// while 문 블록 내의 실행문은 단 한 번도 실행되지 못하고 종료된다!
		while(i <= 10) {
			System.out.println(i + " : Hello, World!");
			i++;
		}
		
		System.out.println("while 문 종료 후 i = " + i);
		
		System.out.println("===========================");
		
		i = 11;
		
		do {
			// i가 10보다 클 경우 while 문 조건식 판별 결과는 false 이지만
			// 조건 판별 전 do 문을 통해 일단 무조건 블록문 내의 실행문장을 한 번 실행 후
			// 마지막에 while 문의 조건을 판별하게 되므로 "Hello, World!" 문장이 한 번 출력됨!
			System.out.println(i + " : Hello, World!");
			i++;
		} while(i <= 10);
		
		System.out.println("while 문 종료 후 i = " + i);
		
		
	}

}
















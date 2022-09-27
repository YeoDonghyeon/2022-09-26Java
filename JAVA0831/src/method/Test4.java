package method;

public class Test4 {

	public static void main(String[] args) {
		// 4. 전달인자도 있고, 리턴값도 있는 메서드 호출
		// 정수 1개(x)를 전달하면 1 ~ x 까지의 합을 리턴하는 sum() 메서드 호출
		// => 리턴되는 합계를 전달받아 출력
		// ex) sum() 메서드에 10 전달 시 1 ~ 10 까지의 합 55 리턴
		int result = sum(100);
		System.out.println(result);
		
		System.out.println("=========================");
		// 정수 1개를 전달하면 "홀수", "짝수", "0" 을 판별하여 리턴하는 check() 메서드 호출
		// => 리턴되는 결과값을 전달받아 출력
		int num = 1;
		System.out.println(num + "은 " + check(num));
		
		
		
		System.out.println("=========================");
		// 정수 2개를 전달하면 두 수 중 더 큰 수를 리턴하는 max() 메서드 호출
		// ex) 10, 20 전달 시 20 이 리턴됨
		// 단, 같을 경우 아무 숫자나 리턴(작거나 같다 또는 크거나 같다고 판별)
		int num1 = 4;
		int num2 = 6;
		
		if(num1 == num2) {
			System.out.println("같은 숫자이다 그래서 num1이 나오게함 -> " + max(num1, num2));
		} else {
			System.out.println(num1 + "과 " + num2 + "중 큰 것은? " + max(num1, num2) + "이다");
		}
		
	} // main() 메서드 끝
	
	

	public static int max(int num1, int num2) {
		int result = 0;
		if(num1 == num2) {
			result = num1;
		}
		result = num1 > num2 ? num1 : num2;
		
		
		return result;
	}



	// 4. 전달인자도 있고, 리턴값도 있는 메서드 정의
	// 정수 1개를 전달받아 변수 num 에 저장 후 
	// 1 ~ num 까지의 합을 계산 후 리턴하는 sum() 메서드 정의
	public static int sum(int num) {
		int total = 0;
		
		for(int i = 1; i <= num; i++) {
			total += i;
		}
		
		return total;
	}
	
	// --------------------------------------------------------------------------------
	// 정수 1개를 전달받아 "홀수", "짝수", "0" 을 판별하여 리턴하는 check() 메서드 정의
	public static String check(int num) {
		String result = null;
		if(num == 0) {
			result = ("0이다");
		} else if(num % 2 == 0) {
			result = ("짝수이다");
		} else {
			result = ("홀수이다");
		}
		return result;
	}
	
	// --------------------------------------------------------------------------------
	// 정수 2개를 전달받아 더 큰 수를 리턴하는 max() 메서드 정의
	
} // Test4 클래스 끝












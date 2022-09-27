package backjoon_if;

import java.util.Scanner;

public class If_ex7 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
//		1에서부터 6까지의 눈을 가진 3개의 주사위를 던져서 다음과 같은 규칙에 따라 상금을 받는 게임이 있다. 
//
//		1. 같은 눈이 3개가 나오면 10,000원+(같은 눈)×1,000원의 상금을 받게 된다. 
//		2. 같은 눈이 2개만 나오는 경우에는 1,000원+(같은 눈)×100원의 상금을 받게 된다. 
//		3. 모두 다른 눈이 나오는 경우에는 (그 중 가장 큰 눈)×100원의 상금을 받게 된다.  
//		
//		예를 들어, 3개의 눈 3, 3, 6이 주어지면 상금은 1,000+3×100으로 계산되어 1,300원을 받게 된다. 
//		또 3개의 눈이 2, 2, 2로 주어지면 10,000+2×1,000 으로 계산되어 12,000원을 받게 된다. 
//		3개의 눈이 6, 2, 5로 주어지면 그중 가장 큰 값이 6이므로 6×100으로 계산되어 600원을 상금으로 받게 된다.
//		3개 주사위의 나온 눈이 주어질 때, 상금을 계산하는 프로그램을 작성 하시오.
//
//		입력
//		첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
//
//		출력
//		첫째 줄에 게임의 상금을 출력 한다.
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int max = 0;
		
		if(a != b && a != c && b != c) { // 3번
			if(a > b) {
				max = a;

				if(a < c) {
					max = c;
				}
			} else {
				max = b;

				if(b < c) {
					max = c;
				}
			}
			
			System.out.println(max * 100);
		} else { // 한 쌍 이상은 같은 경우
			if(a == b && a == c) { // 다 같음
				max = a;
				System.out.println(10000 + max * 1000);
			} else { // 다 같은건 아님
				if(a == b || a == c) { // a 와 b 가 같거나 a 와 c 가 같은 경우 
					max = a;
				} else { // b 와 c 가 같은 경우
					max = b;
				}
				System.out.println(1000 + max * 100);
			}
			
		}
		
		
	}

}

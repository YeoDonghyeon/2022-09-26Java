package static_member;

public class Test4 {

	public static void main(String[] args) {
		// 내가 이해한 싱글톤의 순서
		// 1. 접근제한자 설정으로 클래스 내에서만 쓸 수있는 생성자를 만든다.
		// 2. 마찬가지고 private static Account instance를 만들어 여기에 Account클래스를 저장해준다.
		// 3. 그러면 instance 안에는 Account클래스의 주소값이 저장된다.
		// 4. instance를 Getter메서드로 만들어 밖에서 부를 수 있게 만든다 왜냐 public이기 때문에
		// 5. main메서드에서 호출할때는 클래스의 주소를 저장할 곳을 만들어 줘야한다.
		// 6. 거기에 get메서드를 불러와준다 get메서드에는 리턴값으로 instance가 들어있기 때문에 결과적으로
		//    Account 주소값이 들어가있다.
		// 8. 만든 변수안에는 인스턴스변수들이 들어있기 때문에 그대로 사용하면 된다.
		
		
		
		Account acc = Account.getInstance();
		Account acc2 = Account.getInstance();
		acc.setAccountNo("111-1111-111");
		acc.showAccountInfo();
		
		
		
	}
}

class Account {
	private String accountNo;
	
	
	public String getAccountNo() {
		return accountNo;
	}

	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}

	private Account() {}
	
	private static Account instance = new Account();

	public static Account getInstance() {
		return instance;
	}
	
	public void showAccountInfo() {
		System.out.println("계좌번호 : " + accountNo);
	}
	
}
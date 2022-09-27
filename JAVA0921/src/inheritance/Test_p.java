package inheritance;

public class Test_p {

	public static void main(String[] args) {
		// 상속의 기본 개념 복습
				Student s1 = new Student();
				s1.name = "홍길동";
				// => name 멤버변수는 Person 클래스에서 정의한 멤버변수!
				
				System.out.println("----------------------------");
				Student s2 = new Student("이순신", 44, false, true);
				s2.eat(); // Person 클래스로부터 상속받은 메서드
				s2.sleep(); // Person 클래스로부터 상속받은 메서드
				s2.study();
				
				
			}

		}

		/*
		 * Person 클래스 정의
		 * - 멤버변수 : 이름(name, 문자열), 나이(age, 정수), 배고픔(isHungry, boolean)
		 * - 기본 생성자 정의
		 *   => "Person() 생성자 호출됨!" 출력
		 * - 메서드 정의
		 *   eat() : 파라미터 없고, 리턴값 없음  => "밥먹기!" 출력
		 *   sleep() : 파라미터 없고, 리턴값 없음  => "잠자기!" 출력
		 */

		class Person { // = class Person extends Object
			String name;
			int age;
			boolean isHungry;
			
			public Person() {
				super(); // Object 클래스
				System.out.println("Person() 생성자 호출됨!");
			}
			
			public void eat() {
				System.out.println("밥먹기!");
			}
			
			public void sleep() {
				System.out.println("잠자기!");
			}
			
		}

		/*
		 * Person 클래스를 상속받는 Student 클래스 정의
		 * - 멤버변수 : 공부모드(isStudyMode, boolean)
		 * - 기본 생성자 정의
		 *   => "Student() 생성자 호출됨! 출력
		 * - 4개의 멤버변수 값을 입력받아 초기화하는 생성자 정의
		 *   => "Student(String, int, boolean, boolean) 생성자 호출됨!" 출력
		 * - 메서드 정의
		 *   study() : 파라미터 없고, 리턴값 없음 => "공부하기!" 출력
		 */

		class Student extends Person {
			boolean isStudyMode;

			// 기본 생성자 정의
			public Student() {
				// Student() 생성자가 호출되면 가장 먼저
				// 슈퍼클래스인 Person 클래스의 기본 생성자가 자동으로 호출됨.
				super(); // Person 클래스
				System.out.println("Student() 생성자 호출됨!");
			}

			// 이름, 나이, 배고픔, 공부모드를 전달받아 초기화하는 생성자
			public Student(String name, int age, boolean isHungry, boolean isStudyMode) {
				// Student() 생성자가 호출되면 가장 먼저
				// 슈퍼클래스인 Person 클래스의 기본 생성자가 자동으로 호출됨.
				super();
				System.out.println("Student(String, int, boolean, boolean) 생성자 호출됨!");
				this.name = name;
				this.age = age;
				this.isHungry = isHungry;
				this.isStudyMode = isStudyMode;
			}
			
			public void study() {
				System.out.println("공부하기!");
			}
			
			
		}

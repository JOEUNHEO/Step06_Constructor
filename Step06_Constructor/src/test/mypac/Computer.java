package test.mypac;

public class Computer {
	/*
	 *  [ 필드(저장소) 정의하기 ]
	 *  
	 *  1. 접근 지정자?  1) public | 2) public 을 빼면 default(같은 패키지 안에서만 접근 가능)
	 *  2. static or non static ?
	 *  3. 데이터 type ?
	 *  4. 필드 name ? (소문자로 시작해서 다음 첫단어는 대문자로 쓴다.)
	 *  5. 초기값 ?
	 *  
	 */
	
	// 필드에 출고 날짜를 담고 싶다.
	public String productionDate = null;
	
	// 필드에 Cpu 객체의 참조값을 담고 싶다.
	public Cpu cpu = null;
	
	/*
	 * 	[ Constructor(생성자) 정의하기 ]
	 * 
	 *  1. 접근 지정자?
	 *  2. 생성자에 전달 받는 인자의 갯수와 데이터 type ?
	 *  3. 생성자를 몇 개 정의할 지 ?
	 *  
	 *  # 형태를 다르게 하면 여러 개 정의할 수 있다.(오버로딩)
	 */
	
	//생성자 (Constructor) 객체를 생성할 때 호출되는 부분
	public Computer() {//객체가 생성될 때, 초기화 작업을 해 줄 필요가 있을 때, 사용!
		//리턴 타입 명시 X, 클래스명하고 같다
		System.out.println("Computer() 호출됨");
	}
	
	// 인자로 String type 을 전달 받는 생성자
	public Computer(String productionDate) {
		System.out.println("Computer(String ..) 호출됨");
		//생성자의 인자로 전달된 값을 멤버필드에 저장하기
		this.productionDate = productionDate;
	}
	
	// 인자로 Cpu type 을 전달 받는 생성자
	public Computer(Cpu cpu) {
		this.cpu = cpu;
	}
	
	// 인자로 String type 과 Cpu type 을 전달 받는 생성자
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate = productionDate;
		this.cpu = cpu;
	}
	
	/*
	 *  [ Method(기능) 정의하기 ]
	 *  
	 *  1. 접근 지정자?
	 *  2. static or non static ?
	 *  3. 리턴 데이터 type ?
	 *  4. Method 명 ?
	 *  5. Method 에 전달 받는 인자의 갯수와 데이터 type ?
	 * 
	 */
	
	public Computer doGame() {
		System.out.println("게임을 해요!");
		return this;
	}
	
}

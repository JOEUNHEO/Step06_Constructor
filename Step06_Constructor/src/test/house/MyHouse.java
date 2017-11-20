package test.house;

public class MyHouse {
	/*
	 *  참조 데이터 type 필드에 null 을 넣고 싶으면
	 *  = null 은 생략 할 수 있다.
	 */
	public Aircon air = null;
	public Television tv;
	public MicroWave mw;
	
	//디폴트 생성자
	public MyHouse () {
		
	}
	
	//인자로 Aircon, Television, MicroWave 객체를 전달 받는 생성자
	public MyHouse (Aircon air, Television tv, MicroWave mw) {
		this.air = air;
		this.tv = tv;
		this.mw = mw;
	}
}

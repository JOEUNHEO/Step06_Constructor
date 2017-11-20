package test.main;

import test.house.Aircon;
import test.house.MicroWave;
import test.house.MyHouse;
import test.house.Television;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		
		String a = "abcd";
		String b = new String("abcd");
		
		if( a == b ) {//Java 에서는 참조값을 비교하기 때문에 내용이 같아도 같지 않다!!
			System.out.println("참조값이 같아요!");
		}
		
		if( a.equals(b) ) {// value 값을 비교하려면 equal 메소드 사용!
			System.out.println("내용이 같아요!");
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("----");
		
		/*
		 *  인자로 Aircon, Television, MicroWave 객체를 전달 받는
		 *  생성자를 이용해서 MyHouse 객체를 생성후 참조값을
		 *  house1 이라는 변수에 담아 보세요.
		 */
		
		MyHouse house1 = new MyHouse(new Aircon(), new Television(), new MicroWave());
		
		house1.air.warm();
		house1.air.cool();
		house1.tv.view();
		house1.mw.makeBread();
	}
}

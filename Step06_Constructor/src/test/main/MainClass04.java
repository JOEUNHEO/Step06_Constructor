package test.main;

import test.house.Aircon;
import test.house.MicroWave;
import test.house.MyHouse;
import test.house.Television;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		
		String a = "abcd";
		String b = new String("abcd");
		
		if( a == b ) {//Java ������ �������� ���ϱ� ������ ������ ���Ƶ� ���� �ʴ�!!
			System.out.println("�������� ���ƿ�!");
		}
		
		if( a.equals(b) ) {// value ���� ���Ϸ��� equal �޼ҵ� ���!
			System.out.println("������ ���ƿ�!");
		}
		
		System.out.println(a);
		System.out.println(b);
		System.out.println("----");
		
		/*
		 *  ���ڷ� Aircon, Television, MicroWave ��ü�� ���� �޴�
		 *  �����ڸ� �̿��ؼ� MyHouse ��ü�� ������ ��������
		 *  house1 �̶�� ������ ��� ������.
		 */
		
		MyHouse house1 = new MyHouse(new Aircon(), new Television(), new MicroWave());
		
		house1.air.warm();
		house1.air.cool();
		house1.tv.view();
		house1.mw.makeBread();
	}
}

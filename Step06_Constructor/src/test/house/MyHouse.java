package test.house;

public class MyHouse {
	/*
	 *  ���� ������ type �ʵ忡 null �� �ְ� ������
	 *  = null �� ���� �� �� �ִ�.
	 */
	public Aircon air = null;
	public Television tv;
	public MicroWave mw;
	
	//����Ʈ ������
	public MyHouse () {
		
	}
	
	//���ڷ� Aircon, Television, MicroWave ��ü�� ���� �޴� ������
	public MyHouse (Aircon air, Television tv, MicroWave mw) {
		this.air = air;
		this.tv = tv;
		this.mw = mw;
	}
}

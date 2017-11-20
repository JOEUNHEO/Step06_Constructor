package test.mypac;

public class Computer {
	/*
	 *  [ �ʵ�(�����) �����ϱ� ]
	 *  
	 *  1. ���� ������?  1) public | 2) public �� ���� default(���� ��Ű�� �ȿ����� ���� ����)
	 *  2. static or non static ?
	 *  3. ������ type ?
	 *  4. �ʵ� name ? (�ҹ��ڷ� �����ؼ� ���� ù�ܾ�� �빮�ڷ� ����.)
	 *  5. �ʱⰪ ?
	 *  
	 */
	
	// �ʵ忡 ��� ��¥�� ��� �ʹ�.
	public String productionDate = null;
	
	// �ʵ忡 Cpu ��ü�� �������� ��� �ʹ�.
	public Cpu cpu = null;
	
	/*
	 * 	[ Constructor(������) �����ϱ� ]
	 * 
	 *  1. ���� ������?
	 *  2. �����ڿ� ���� �޴� ������ ������ ������ type ?
	 *  3. �����ڸ� �� �� ������ �� ?
	 *  
	 *  # ���¸� �ٸ��� �ϸ� ���� �� ������ �� �ִ�.(�����ε�)
	 */
	
	//������ (Constructor) ��ü�� ������ �� ȣ��Ǵ� �κ�
	public Computer() {//��ü�� ������ ��, �ʱ�ȭ �۾��� �� �� �ʿ䰡 ���� ��, ���!
		//���� Ÿ�� ��� X, Ŭ�������ϰ� ����
		System.out.println("Computer() ȣ���");
	}
	
	// ���ڷ� String type �� ���� �޴� ������
	public Computer(String productionDate) {
		System.out.println("Computer(String ..) ȣ���");
		//�������� ���ڷ� ���޵� ���� ����ʵ忡 �����ϱ�
		this.productionDate = productionDate;
	}
	
	// ���ڷ� Cpu type �� ���� �޴� ������
	public Computer(Cpu cpu) {
		this.cpu = cpu;
	}
	
	// ���ڷ� String type �� Cpu type �� ���� �޴� ������
	public Computer(String productionDate, Cpu cpu) {
		this.productionDate = productionDate;
		this.cpu = cpu;
	}
	
	/*
	 *  [ Method(���) �����ϱ� ]
	 *  
	 *  1. ���� ������?
	 *  2. static or non static ?
	 *  3. ���� ������ type ?
	 *  4. Method �� ?
	 *  5. Method �� ���� �޴� ������ ������ ������ type ?
	 * 
	 */
	
	public Computer doGame() {
		System.out.println("������ �ؿ�!");
		return this;
	}
	
}

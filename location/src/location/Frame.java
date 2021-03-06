package location;

/** 
* ��������������� �����, ������������ ������� ��� �������� �� ������. 
* @author Pokrovskaya Oksana
*/
public class Frame extends Tail{
	
	/** �������� ������ �������� ���� */
	private int x1;
	/** �������� ������ �������� ���� */
	private int y1;
	/** �������� ������� ������� ���� */
	private int x2;
	/** �������� ������� ������� ���� */
	private int y2;

	/** ���� ������������� */
	private boolean used;

	/** ���� �������������� ������ */
	public  boolean up = false;

	/** ���� �������������� ����� */
	public boolean down = false;

	/** ���� �������������� ������ */
	public boolean right = false;

	/** ���� �������������� ����� */
	public boolean left = false;

	public Frame() {
		super();
		used = false;
	}

	/** 
	* @param x11 �������� ������ �������� ���� (< x21)
	* @param y11 �������� ������ �������� ���� (> y21)
	* @param x21 �������� ������� ������� ����
	* @param y21 �������� ������� ������� ����
	*/
	public Frame(int x11, int y11, int x21, int y21) {
		super(x11, y11, x21, y21);
		used = false;
	}


	public Frame(double x11, double y11, double x21, double y21) {
		// TODO Auto-generated constructor stub
		super(x11, y11, x21, y21);
		used = false;
	}

	/** �������� ���� ������������� */
	public boolean isUsed() {
		return used;
	}

	/** ���������� ���� ������������� */
	public void used(boolean a) {
		used = a;
	}
}

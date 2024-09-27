package mvn2.mv2;

public class vhk2 implements sim {
	private int y;
	
	public vhk2(int y) {
		super();
		this.y=y;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}

	public void get() {
		System.out.println("yes");
	}
	
	public void set() {
		System.out.println("no");
	}
	public void display() {
		System.out.println(y);
	}

}

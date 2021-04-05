package multiple;

public class C implements A,B {
	
	public static void main(String[] args) {
		
		C c = new C();
		
		c.add();
		c.sub();
		c.mul();
		c.div();
		c.printDate();
	}

	@Override
	public void mul() {
		System.out.println("mul");
		
	}

	@Override
	public void div() {
		System.out.println("div");
		
	}

	@Override
	public void printDate() {
		System.out.println("date");
	}

	@Override
	public void add() {
		System.out.println("add");
		
	}

	@Override
	public void sub() {
		System.out.println("sub");
		
	}

}

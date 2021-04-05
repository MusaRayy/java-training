package single;

public class Class10Room extends School {

	String schoolName="sdfs";
	void add() {
		super.add();
		System.out.println("bye-"+schoolName);
		System.out.println("bye-"+super.schoolName);
	}
	
	public static void main(String[] args) {
		Class10Room room = new Class10Room();
		
		room.add();
	}
	

}

package polymorphism_example;

class bike{
	void run() {
		System.out.print("the bike is the parent class");
	}
	
}


class honda extends bike{
	void run() {
		
		System.out.print("this is the subclass ");
		
	}
}

public class susobhan {
	
	public static void main(String args[]) {
		
		bike b = new honda();
		
		b.run();
	}
		

}

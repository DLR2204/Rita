package intro;

public class VariableEx2 {
	
	static int staticCounter; //static g.v
	
	int instanceCounter;//instance g.v
	
	public void counter(){
		
		staticCounter++;
		
		instanceCounter++;
	}
	
	public void display() {
		
		System.out.println("Static Counter:- "+staticCounter);
		
		System.out.println("Instance Counter:- "+instanceCounter);
		
	}
	
	public static void main(String[] args) {
		
		VariableEx2 counter1 = new VariableEx2();
		
		VariableEx2 counter2 = new VariableEx2();
		
		VariableEx2 counter3 = new VariableEx2();
		
		
		counter1.counter();
		
		counter2.counter();
		
		counter3.counter();
		
		counter3.counter();
		
		counter3.display();
		
	}
	
	
	
}

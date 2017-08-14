package over
		;

public class TestDemo {

	public static void main(String[] args) {
		TestDemo demo = new TestDemo();
		System.out.println("demo.add :" + demo.add(1, 2));
		
		SubClass sub = new SubClass();
		System.out.println("subClass.add : " + sub.add(1, 2));
	}
	
	public int add(int i, int j){
		return i+j;
	}
	
	public int add(byte j, int k){
		return j+k;
	}
	
	// Homework
	public int add(int i, int j, int k, int m){
		return i+j+k+m;
	}
}

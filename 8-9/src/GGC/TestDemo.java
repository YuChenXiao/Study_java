package GGC;

public class TestDemo {

	public static void main(String[] args) {

		GC gc1 = new GC("gc1");
		GC gc2 = new GC("gc2");
		GC gc3 = new GC("gc3");
		
		gc1 = null;
		gc2 = null;
		gc3 = null;
		
		System.gc();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

}

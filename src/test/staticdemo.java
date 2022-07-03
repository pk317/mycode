package test;

public class staticdemo {
	int a;
	static int b;
	public void demoNonstatic() {
		
		a=10;
		System.out.print("non static methoid");
		b=30;
		demoStatic();
		
		
	}
	
	public static void demoStatic() {
		
		System.out.println("static");
		
	
		
		
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		staticdemo s= new staticdemo();
		//s.demoStatic();
		//s.demoNonstatic();
		//demoStatic();
		staticdemo.demoStatic();
		
		
		
	}

}

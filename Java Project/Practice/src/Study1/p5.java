package Study1;

public class p5 {
	
	// 멤버 변수
	int a;
	int b;
	
	p5() {
		a = 10;
		b = 20;
	}
	
	public int sum(int x, int y) {
		return x+y;
	}
	
	public String say() {
		return "Hi";
	}
	
	public void sum2(int x, int y) {
		System.out.println(a + "+" + b + "=" + (a+b));
	}
	
	public void say2() {
		System.out.println("Hi");
	}

	// 메소드
	public static void main(String[] args) {
		// 프로그램 시작 시점
		
		int x = 0;
		int y = 0;
		
		p5 practice5 = new p5();
		practice5.say2();
		
		practice5.sum2(3, 4);
		
		String s = practice5.say();
		System.out.println(s);
		
		int c = practice5.sum(x, y);

	}

}

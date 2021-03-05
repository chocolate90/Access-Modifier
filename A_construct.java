package modi.construct.pac1;

public class A_construct {

	//멤버변수
	A_construct a1 = new A_construct(1);
	A_construct a2 = new A_construct("홍길동");
	A_construct a3 = new A_construct(true);
	
	// 생성자
	public A_construct(int i) {}
	A_construct(String s) {}
	private A_construct(boolean b) {} // private는 외부에서 사용할 수 없다.
}

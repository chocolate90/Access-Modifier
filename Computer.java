package quiz09;
public class Computer {
	//키보드, 마우스, 모니터 클래스를 저장하는 변수를 선언하세요

	//기본생성자를 생성하고, 변수를 클래스로 초기화 하세요

	
	//모든 멤버변수를 전달받는 생성자를 만들고 초기화하세요


	//키보드, 모니터, 마우스 정보를 출력하는 computerInfo() 메서드를 생성하세요

	//키보드, 모니터, 마우스에 대한 getter/setter도 생성하세요	
	
	//메인메서드에서 getter로 접근하여 모니터에 대한 정보를 확인하세요
	
	private KeyBoard kb;
	private Monitor m;
	private Mouse mouse;
	
	public Computer() {
		this.kb = new KeyBoard();
		this.m = new Monitor();
		this.mouse = new Mouse();
	}

	public Computer(KeyBoard kb, Monitor m, Mouse mouse) {
		super();
		this.kb = kb;
		this.m = m;
		this.mouse = mouse;
	}
	
	public void computorinfo() {
		kb.info();
		m.info();
		mouse.info();
	}
	
	public void setKb(KeyBoard kb) {
		this.kb = kb;
	}
	
	public KeyBoard getKb() {
		return kb;
	}
	
	public void setM(Monitor m) {
		this.m = m;
	}
	
	public Monitor getM() {
		return m;
	}
	
	public void setMouse(Mouse mouse) {
		this.mouse = mouse;
	}
	
	public Mouse getMouse() {
		return mouse;
	}
	
}

package modi.protec.pac1;

public class A_protec {

	/*
	 * protected는 기본적으로 같은 패키지에서만 사용 가능하다.
	 * 단, 패키지가 다르더라도 상속관계에서 super키워드를 통한 사용이 가능하다.  
	 */
	
	// 멤버변수
	protected boolean bool;
	
	// 생성자
	protected A_protec() {
		
	}
	
	// 메서드
	protected void method() {}
}

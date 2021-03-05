package modi.protec.pac1;

public class B_protec {

	public B_protec() {
		
		// 같은 패키지 사용 가능
		A_protec a = new A_protec();
		
		a.bool = true;
		a.method();
	}
}

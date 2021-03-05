package modi.protec.pac2;

import modi.protec.pac1.A_protec;

public class C_protec extends A_protec {

	public C_protec() {

//		A_protec a = new A_protec();
//
//		a.bool = true;
//		a.method();
		
		// protected는 super 참조가 가능하다.
		super();
		super.bool = true;
		super.method();
	}
}

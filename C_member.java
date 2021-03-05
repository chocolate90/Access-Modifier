package modi.member.pac2;

import modi.member.pac1.A_member;

public class C_member {

	public C_member() {
		A_member a = new A_member();
		a.var1 = 1;
//		a.var2 = 2; // default x
//		a.var3 = 3; // private x
		
		a.method01();
//		a.method02()a; // default x
//		a.method03(); // private x
	}
}

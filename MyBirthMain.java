package encap.bad;

public class MyBirthMain {

	public static void main(String[] args) {
		
		// 멤버변수가 public으로 선언되면 잘못된 값이 저장되거나
		// 누구든지 사용할 수 있다는 문제가 있다.
		MyBirth me = new MyBirth();
		
		me.year = 1990;
		me.month = 4;
		me.day = 26;
		me.ssn = "이게 뭐죠?";
		
		me.info();
	}

}

package encap.good;

public class MyBirthMain_1 {

	public static void main(String[] args) {
		
		MyBirth_1 me = new MyBirth_1();
		
		me.setYear(1990);
		System.out.println(me.getYear());
		
		me.setMonth(4);
		System.out.println(me.getMonth());
		
		me.setDay(26);
		System.out.println(me.getDay());
		
		me.setSsn("9004261111111");
		System.out.println(me.getSsn());
	}
}

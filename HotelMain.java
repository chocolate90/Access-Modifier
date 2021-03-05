package encap.obj;

public class HotelMain {

	public static void main(String[] args) {
		
		// Hotel 안에 있는 Employee의 working() 실행
		
		Hotel h = new Hotel();
		
		Employee e = h.getEmp();
		
		e.working();
		
		h.getChef().cooking();
		
		// hotel 안에 있는 Chef를 새로운 Chef로 변경
		
//		Chef c = new Chef();
//		h.setChef(c);
		
		h.setChef(new Chef());
	}
}

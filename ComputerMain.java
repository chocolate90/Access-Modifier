package quiz09;

public class ComputerMain {

	public static void main(String[] args) {
		
		Computer c = new Computer();
		
		c.computorinfo();
		
		System.out.println("---------------------");
		
		Computer c1 = new Computer(c.getKb(), c.getM(), c.getMouse());
	
//		Monitor m = c1.getM();
//		m.info();
		
		c1.getM().info();
	}
}

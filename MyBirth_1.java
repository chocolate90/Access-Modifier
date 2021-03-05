package encap.good;

public class MyBirth_1 {

	private int year;
	private int month;
	private int day;
	private String ssn;
	
	/*
	 *  은닉 변수에 접근할 때는 클래스 설계자가 미리 생성해 놓은
	 *  getter/setter 메서드를 사용한다.
	 * 
	 *  setter 메서드
	 *  1. 은닉 변수에 값을 저장하는 용도
	 *  2. 접근제어자는 public으로 선언하고 이름은 set + 멤버변수명으로 지정
	 *  
	 */
	
	public void setYear(int year) {
		// 예시 - 1950~2021년까지
		if(year < 1950 || year > 2021) {
			System.out.println("년도는 1950~2021년만 저장됩니다.");
		} else {
			this.year = year;			
		}
		
	}
	
	/*
	 *  getter 메서드
	 *  1. 은닉 변수의 값을 조회하는 용도
	 *  2. 접근제어자는 public으로 선언하고 이름은 get + 멤버변수명으로 지정
	 */
	
	public int getYear() {
				
		return year;
	}
	
	/*
	 * 1. month, day, ssn에 getter, setter 생성
	 * month = 1~12월 까지만
	 * day = 1~31일 까지만
	 * ssn = 1~13자리 까지만
	 */
	
	public void setMonth(int month) {
		
		if(month < 1 || month > 12) {
			System.out.println("월은 1~12월 까지입니다.");
		} else {
			this.month = month;
		}
	}
	
	public int getMonth() {
		return month;
	}
	
	public void setDay(int day) {
		
		if(day < 1 || day > 31) {
			System.out.println("일은 1~31일 까지입니다.");
		} else {
			this.day = day;
		}
	}
	
	public int getDay() {
		return day;
	}
	
	public void setSsn(String ssn) {
		
		if(ssn.length() < 1 || ssn.length() > 13) {
			System.out.println("주민번호는 13자리 입니다.");
		} else {
			this.ssn = ssn;
		}
	}
	
	public String getSsn() {
		return ssn;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

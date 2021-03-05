package EnumEx;

public class DeveloperEx {
	
	public String name;
	public int career;
	public DevType4 type;

	public static void main(String[] args) {
		
		DevType4 tp1 = DevType4.MOBILE;
		DevType4 tp2 = DevType4.valueOf("WEB");
		System.out.println(tp1);
		System.out.println(tp2);
		
/*		DeveloperEx developer = new DeveloperEx();
		
		developer.name="홍길동";
		developer.career=3;
		developer.type=DevType4.MOBILE;
		
		System.out.println(developer.type.ordinal()); //developer.type에 정의된  MOBILE이 열거된 순서를 리턴
		DevType4 tp=developer.type.SERVER; //DevType4의 새 인스턴스 tp에 developer type의 요소로 SERVER를 저장
		System.out.println(tp.ordinal()); //tp에 저장된 SERVER가 선언된 순서를 반환*/

	}
	enum DevType4{
		MOBILE, WEB, SERVER
	}
}

package EnumEx;

public class DeveloperEx2 {
	
	public String name;
	public int career;
	public DevType type;
	
	public static void main(String[] args) {
		
		for(NewDevType type : NewDevType.values()) {
			System.out.println(type.getName());
		}
	}
	
	enum NewDevType{
		MOBILE("안드로이드"), WEB("스프링"), SERVER("리눅스");
		
		final private String name;
		
		public String getName() {
			return name;
		}
		
		private NewDevType(String name) {
			this.name=name; 
		}
	}

}

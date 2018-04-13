
public class SigletonClassDemo {
	public static void main(String[] args) {
		Singleton s1 = Singleton.getSingletonInstance();//Private constructor can't be called
		Singleton s2 = Singleton.getSingletonInstance();
		Singleton s3 = Singleton.getSingletonInstance();
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
	}
}

//Usage of static blocks and static variables
class Singleton {
	//The singleton pattern says that only 1 instance of a class can be created
	private Singleton() {
		
	}
	
	private static Singleton s;
	
	static {
		s = new Singleton();
	}
	public static Singleton getSingletonInstance() {
		/*if(s == null) {
			s = new Singleton();
		}*/
		return s;
	}
	
}

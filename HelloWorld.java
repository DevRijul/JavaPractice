public class HelloWorld {

	//C:\Program Files\Java\jdk1.8.0_92\jre\lib\rt.jar
	public static void main(String[] args) {
		StaticTest test1 = new StaticTest();
		StaticTest test2 = new StaticTest();
		
		System.out.println(test1.s);//10
		System.out.println(test2.s);//10
		System.out.println(StaticTest.s);

		System.out.println(test1.ns);//20
		System.out.println(test2.ns);//20
		
		//test1.s = 100;
		StaticTest.s = 100;//This is the way static variables should be accessed - using class name and not instance name.
				
		System.out.println(test1.s);//100
		System.out.println(test2.s);//100

		test1.ns=200;
		System.out.println(test1.ns);//200
		System.out.println(test2.ns);//20
		
		//------------------------ END 
		
		StaticTest.sayStaticHello();
		test1.sayStaticHello();
		
		//StaticTest.sayNSHello();//CE - Cannot make a static reference to the non-static method sayNSHello() from the type StaticTest
		test1.sayNSHello();
	}
}

class StaticTest {
	String str = "abc";
	static int s = 10;//static variable - memory allocated at class loading 
	int ns = 20;//instance variable
	
	static 
	{
		System.out.println("In static block");
	}
	
	static void sayStaticHello() {
		int a =10;
		System.out.println("Hi Static Nana!" + a);
		//System.out.println("Hi Static Nana!" + ns);
	}
	
	void sayNSHello() {
		System.out.println("Hi Instance Nana!" + s);
	}
}
// Java Practice
class Dog
{
	int size;
	String breed;
	String name;
	
	void bark()
	{
		System.out.println("My name, breed and size is : " +name+" "+breed+" "+size);
	}
}

public class DogClassPlay {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog mydog = new Dog();
		mydog.size = 36;
		mydog.breed = "Labrador";
		mydog.name = "Laboo";
				
		mydog.bark();
	}
}

package OOPS;

public class student {

	String name = "Ram";
	int age = 40;
	
	public student()
	{
		System.out.println("No argument constructor");
		this.name = "Rohit";
		this.age = 25;
	}
	
	public void introduction()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	public void sayhi(String name)
	{
		System.out.println(this.name + " say hi to " + name );
	}
}

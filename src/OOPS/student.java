package OOPS;

public class student {

	String name;
	int age;
	
	public void introduction()
	{
		System.out.println(name + " is " + age + " years old.");
	}
	
	public void sayhi(String name)
	{
		System.out.println(this.name + " say hi to " + name );
	}
}

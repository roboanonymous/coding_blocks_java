package OOPS;

public class client {
	
	public static void Test1(student s1, student s2)
	{
		student temp = s1;
		s1 = s2;
		s2 = temp;
	}
	
	public static void Test2(student s1, student s2)
	{
		int tempa = s1.age;
		s1.age = s2.age;
		s2.age = tempa;
		
		s1 = new student();
		String tempn = s1.name;
		s1.name = s2.name;
		s2.name = tempn;
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		student s = new student();
		
		System.out.println(s);
		s.name = "Samyak";
		s.age = 22;
		
		System.out.println(s.name);
		System.out.println(s.age);
		
		
        student s3 = new student();
		s3.name = "A";
		s3.age = 12;

        student s4 = new student();
		s4.name = "B";
		s4.age = 22;
		
		Test1(s3,s4);
		System.out.println(s3.age + "  " + s3.name);
		System.out.println(s4.age + "  " + s4.name);
		
		Test2(s3, s4);
		System.out.println(s3.age + "  " + s3.name);
		System.out.println(s4.age + "  " + s4.name);
		
		s3.introduction();
		s3.sayhi("Sam");
		
	}

}

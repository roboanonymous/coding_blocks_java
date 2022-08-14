package OOPS;

public class client {

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
		s3.age = 22;

        student s4 = new student();
		s4.name = "B";
		s4.age = 22;

	}

}

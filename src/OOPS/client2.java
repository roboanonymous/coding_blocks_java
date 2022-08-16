package OOPS;

public class client2 {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			student s = new student();
			s.setAge(-10);
			System.out.println(s.getAge());
			
		}
		
		catch(Exception e)
		{
			System.out.println("in catch");
		}
		

	}

}

package stack_and_queue;

public class stack_client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		push_using_queue sk = new push_using_queue();
		sk.push(10);
		sk.push(20);
		sk.push(30);
		sk.push(40);
		sk.push(50);
		
		sk.display();
		
		sk.pop();
		sk.pop();
		
		sk.display();

	}

}

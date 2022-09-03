package stack_and_queue;
import java.util.*;
public class FirstNonRepeatingCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		char ch = sc.next().charAt(0);
		
		HashMap <Character,Integer> map = new HashMap<>();
		Queue <Character> queue = new LinkedList<>();
		
		
		while(ch != '.')
		{
			queue.add(ch);
			if(map.containsKey(ch))
			{
				int ov = map.get(ch);
				ov = ov+1;
				map.put(ch, ov);
			}
			
			else
			{
				map.put(ch, 1);
			}
			
			
			while(!queue.isEmpty())
			{
				char fc = queue.peek();
				int a = map.get(ch);
				if(a == 1)
				{
					System.out.println(fc);
					break;
				}
				
				else {
					queue.poll();
				}	
				
			}
			
			if(queue.isEmpty())
			{
				System.out.println("-1");
			}
			
			ch = sc.next().charAt(0);
			
			
		}
	}

}
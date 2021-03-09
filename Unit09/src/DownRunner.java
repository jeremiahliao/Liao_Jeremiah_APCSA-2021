import java.util.ArrayList;
import java.util.List;
//(c) A+ Computer Science
//www.apluscompsci.com
//Name -
//Date -

public class DownRunner
{
	public static void main( String args[] )
	{			
		List<Integer> ray = new ArrayList<Integer>();
		
		ray.add(-99);
		ray.add(1);
		ray.add(2);
		ray.add(3);
		ray.add(4);
		ray.add(5);
		ray.add(6);
		ray.add(7);
		ray.add(8);
		ray.add(9);
		ray.add(10);
		ray.add(12345);
		System.out.println(ListDown.go(ray));
		ray.clear();
		
		ray.add(10);
		ray.add(9);
		ray.add(8);
		ray.add(7);
		ray.add(6);
		ray.add(5);
		ray.add(4);
		ray.add(3);
		ray.add(2);
		ray.add(1);
		ray.add(-99);
		System.out.println(ListDown.go(ray));
		ray.clear();
		
		ray.add(10);
		ray.add(20);
		ray.add(30);
		ray.add(40);
		ray.add(50);
		ray.add(-11818);
		ray.add(40);
		ray.add(30);
		ray.add(20);
		ray.add(10);
		System.out.println(ListDown.go(ray));
		ray.clear();
		
		ray.add(32767);
		System.out.println(ListDown.go(ray));
	}
}
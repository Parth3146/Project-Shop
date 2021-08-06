import java.util.*;
class Menu
{
	static int[] q = {10,12,10,5,15,20};
	public void menu1()
	{	
		System.out.println("Available items are: ");
		System.out.println("Item 1: "+q[0]);
		System.out.println("Item 2: "+q[1]);
		System.out.println("Item 3: "+q[2]);
		System.out.println("Item 4: "+q[3]);
		System.out.println("Item 5: "+q[4]);
		System.out.println("Item 6: "+q[5]);
		Purchase p = new Purchase();
		p.purchase1();
	}
}
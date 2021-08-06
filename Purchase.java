import java.util.Scanner;
class Purchase
{
	static int[] cs = {0,0,0,0,0,0};
	public void purchase1()
	{	
		int no,temp,ans;
		Menu m = new Menu();
		List l = new List();
		System.out.println("Please select the item number to purchase or press 0 to exit: ");
		Scanner sc = new Scanner(System.in);
		no=sc.nextInt();
		switch(no)
		{
			case 0:	l.list1();
				break;
			case 1: System.out.println("Enter quantity of Item 1: ");
				temp = sc.nextInt();
				if(temp>m.q[0])
				{
					System.out.println("This much quantity is not available in stock !!");
					m.menu1();
				}
				else
				{
					m.q[0]=m.q[0]-temp;
					cs[0]+=temp;
					System.out.println("Item added to the cart !!");
				}
				break;

			case 2: System.out.println("Enter quantity of Item 2: ");
				temp = sc.nextInt();
				if(temp>m.q[1])
				{
					System.out.println("This much quantity is not available in stock !!");
					m.menu1();
				}
				else
				{
					m.q[1]=m.q[1]-temp;
					cs[1]+=temp;
					System.out.println("Item added to the cart !!");
				}
				break;

			case 3: System.out.println("Enter quantity of Item 3: ");
				temp = sc.nextInt();
				if(temp>m.q[2])
				{
					System.out.println("This much quantity is not available in stock !!");
					m.menu1();
				}
				else
				{
					m.q[2]=m.q[2]-temp;
					cs[2]+=temp;
					System.out.println("Item added to the cart !!");
				}
				break;

			case 4: System.out.println("Enter quantity of Item 4: ");
				temp = sc.nextInt();
				if(temp>m.q[3])
				{
					System.out.println("This much quantity is not available in stock !!");
					m.menu1();
				}
				else
				{
					m.q[3]=m.q[3]-temp;
					cs[3]+=temp;
					System.out.println("Item added to the cart !!");
				}
				break;

			case 5: System.out.println("Enter quantity of Item 5: ");
				temp = sc.nextInt();
				if(temp>m.q[4])
				{
					System.out.println("This much quantity is not available in stock !!");
					m.menu1();
				}
				else
				{
					m.q[4]=m.q[4]-temp;
					cs[4]+=temp;
					System.out.println("Item added to the cart !!");
				}
				break;

			case 6: System.out.println("Enter quantity of Item 6: ");
				temp = sc.nextInt();
				if(temp>m.q[5])
				{
					System.out.println("This much quantity is not available in stock !!");
					m.menu1();
				}
				else
				{
					m.q[5]=m.q[5]-temp;
					cs[5]+=temp;
					System.out.println("Item added to the cart !!");
				}
				break;

			default: System.out.println("Please enter valid input");
		}
		System.out.println("Continue to the menu ?(1) or Exit(0): ");
		ans = sc.nextInt();
		if(ans == 1)
			m.menu1();
		else
			l.list1();
	}
}

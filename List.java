class List
{
	public void list1()
	{
		Purchase p = new Purchase();
		System.out.println("Selected Items are: ");
		for(int i=0;i<6;i++)
			if(p.cs[i]!=0)
				System.out.println("Item "+(i+1)+" Quantity = "+p.cs[i]);
		System.out.println("Thank You for Visiting !!");
		System.exit(0);
	}
}
class NumberPattern2
{
	public static void main(String args[])
	{
		if(args.length==0)
			System.out.println("give input");
		else{
			int n=Integer.parseInt(args[0]);
			
			for(int i=1;i<=n;i++)
			{
				int num=0;
				for(int j=1;j<=i;j++)
				{	
					num++;
					System.out.print(num);
				}
				System.out.println();
			}
		}
	}
}
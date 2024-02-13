class Factorial
{
	public static void main(String args[])
	{
		if(args.length==0)
			System.out.println("Give a num");
		else
		{
			int n=Integer.parseInt(args[0]);
			int f=1;
			for(int i=1;i<=n;i++)
			{
				f*=i;
			}
			System.out.println("Factorial of"+n+"is:"+f);
		}
	}

}
class FibUptoN
{
	public static void main(String args[])
	{
		if(args.length==0)
			System.out.println("give a number");
		else{
			int n=Integer.parseInt(args[0]);
			int a=0;
			int b=1;
			int c=1;
			System.out.println(a);
			System.out.println(b);
			while(c<n)
			{
				c=a+b;
				System.out.println(c);
				a=b;
				b=c;
				
			}			
		}
	}

}
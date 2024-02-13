class Prime
{
	public static void main(String args[])
	{
		if(args.length == 0)
			System.out.println("Write a number");
		else{
			int n=Integer.parseInt(args[0]);
			int prime=1;
			for(int i=2;i<=n/2;i++)
			{
				if(n%i==0){
					prime=0;
					break;
				}
			}
			if(prime==1)
				System.out.println(n+"is a Prime Number");
			else
				System.out.println(n+"is not a prime");

		}		


	}

}
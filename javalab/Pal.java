class Pal
{
	public static void main(String args[])
	{	
		if(args.length ==0)
			System.out.println("Give a number");
		else{
		int n=Integer.parseInt(args[0]);
		int temp=n;
		int s=0;
		while(n!=0)
		{
			int r=n%10;
			s=(s*10)+r;
			n=n/10;
		}
		if(s==temp)
			System.out.println(temp+ "is a palindrome");
		else
			System.out.println(temp+ "is not a palindrome");
		


		}

	}
}
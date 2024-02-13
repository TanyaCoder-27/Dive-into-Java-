class Biggest3
{
	public static void main(String args[])
	{
		if(args.length==3)
		{
			int a=Integer.parseInt(args[0]);
			int b=Integer.parseInt(args[1]);
			int c=Integer.parseInt(args[2]);
			int temp=a>b?a:b;
			int biggest=c>temp?c:temp;
			System.out.println(biggest+"is the biggest number");
		}
		else
			System.out.println("give 3 nums");
	}

}
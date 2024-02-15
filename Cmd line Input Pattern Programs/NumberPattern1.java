/*
if n=5 given in cmd prompt
1
22
333
4444
55555
*/


class NumberPattern1
{
	public static void main(String args[])
	{
		if(args.length==0)
			System.out.println("give input");
		else{
			int n=Integer.parseInt(args[0]);
			int num=0;
			for(int i=1;i<=n;i++)
			{
				num++;
				for(int j=1;j<=i;j++)
				{	
					
					System.out.print(num);
				}
				System.out.println();
			}
		}
	}
}

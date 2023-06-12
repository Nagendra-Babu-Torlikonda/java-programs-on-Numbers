package programs.numbers;

import java.util.Scanner;

public class BouncyNumber
{

	public static void main(String[] args)
	{
		int n, flag = 0;;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
		if(n > 100)
		{
			if(n % 10 >= (n % 100) / 10)
			{
				for(int i = n; i > 10; i /= 10)
					if(i % 10 < (i % 100) / 10)
					{
						flag = 1;
						break;
					}
			}
			else
			{
				for(int i = n; i > 10; i /= 10)
					if(i % 10 > (i % 100) / 10)
					{
						flag = 1;
						break;
					}
			}
			if(flag == 1)
			{
				System.out.println("Bouncy Number");
			}
			else
			{
				System.out.println("Not a Bouncy Number");
			}
		}
		else
			System.out.println("Invalid Number");

	}

}

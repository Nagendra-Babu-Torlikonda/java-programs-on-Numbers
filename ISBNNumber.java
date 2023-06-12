package programs.numbers;

import java.util.Scanner;

public class ISBNNumber
{

	public static void main(String[] args)
	{
		int n, product = 0;
		Scanner in = new Scanner(System.in);
		n = in.nextInt();
//		System.out.println(n);
		if(String.valueOf(n).length() == 10)
		{
			for (int i = n, j = 10; i > 0; i /= 10, j--)
			{
				product += (i % 10) * j;
			}
//			System.out.println(product);
			if(product % 11 == 0)
				System.out.println("ISBN Number");
			else
				System.out.println("Not an ISBN Number");
		}
		else
			System.out.println("Not an ISBN Number");
	}

}

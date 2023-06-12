package programs.numbers;

import java.util.Scanner;

public class ReverseNumber
{

	public static void main(String[] args)
	{
		int n, r, rev = 0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (int i = n; i > 0 ; i = i / 10)
		{
			r = i % 10;
			rev = rev * 10 + r;
		}
		
		System.out.println(rev);
	}

}

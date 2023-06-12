package programs.numbers;

import java.util.Scanner;

public class NeonNumber
{

	public static void main(String[] args)
	{
		int n, sq, sum = 0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		sq = n * n;
		for (int i = sq; i > 0 ; i/= 10)
		{
			sum += i % 10;
		}
		if ( sum == n)
			System.out.println("Neon Number");
		else
			System.out.println("Not a Neon Number");

	}

}

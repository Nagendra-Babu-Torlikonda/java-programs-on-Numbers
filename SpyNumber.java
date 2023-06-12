package programs.numbers;

import java.util.Scanner;

public class SpyNumber
{

	public static void main(String[] args)
	{
		int n, sum = 0, product = 1;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		for (int i = n; i > 0 ; i/= 10)
		{
			sum += i % 10;
			product *= i%10;
		}
		if ( sum == product)
			System.out.println("Spy Number");
		else
			System.out.println("Not a Spy Number");

	}

}

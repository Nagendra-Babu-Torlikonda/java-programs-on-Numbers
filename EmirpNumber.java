package programs.numbers;

import java.util.Scanner;

public class EmirpNumber
{

	static boolean isPrime(int n)
	{
		int flag = 1;
		for(int i = 2; i < n ; i++)
			if(n % i == 0)
			{
				flag = 0;
				break;
			}
		if(flag == 1)
			return true;
		else
			return false;
	}
	public static void main(String[] args)
	{
		int n = new Scanner(System.in).nextInt();
		if(isPrime(n))
		{
			int r = 0;
			for(int i = n; i > 0; i /= 10)
				r = r * 10 + i % 10;
//			System.out.println(r);
			if(isPrime(r))
				System.out.println("It is an Emirp Number");
			else
				System.out.println("Not an Emirp Number");
		}
		else
			System.out.println("Not an Emirp Number");

	}

}

package programs.numbers;

import java.util.Scanner;

public class BuzzNumber
{

	public static void main(String[] args)
	{
		int n = new Scanner(System.in).nextInt();
//		if(n % 10 == 7 || n % 7 == 0)
//			System.out.println("Buzz Number");
//		else
//			System.out.println("Not a Buzz Number");
		System.out.println((n % 10 == 7 || n % 7 == 0)?"Buzz Number":"Not a Buzz Number");

	}

}

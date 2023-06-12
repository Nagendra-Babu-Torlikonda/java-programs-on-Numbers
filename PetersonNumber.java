package programs.numbers;

import java.util.Scanner;

// if sum of factorials of each digit of a number is equal to same number.

public class PetersonNumber
{

	static int factorial(int n)
	{
		int fact = 1;
		for (int i = n ; i > 0 ; i--)
			fact *= i;
		return fact;
	}
	
	public static void main(String[] args)
	{
		int num, sum = 0, r;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
		for (int i = num; i > 0 ; i /= 10)
			sum += factorial(i % 10);
//		System.out.println(sum);
		if (num == sum)
			System.out.println("Peterson Number");
		else
			System.out.println("Not a Peterson Number");
	}

}

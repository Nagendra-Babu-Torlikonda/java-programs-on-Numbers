package programs.numbers;

// if the last digits of square of a number are same as that number.

import java.math.BigInteger;
import java.util.Scanner;

public class AuotmorphicNumber
{

	public static void main(String[] args)
	{
		int num, r= 0, last, square;
//		BigInteger square;
		Scanner input = new Scanner(System.in);
		num = input.nextInt();
/*		square = BigInteger.valueOf(num * num); */
		square = num * num;
//		System.out.println(square);
		for (int i = num; i > 0; i = i / 10)
		{
			r += 1;
		}
//		last = square.remainder(BigInteger.valueOf((int)Math.pow(10, r))).intValue();
//		System.out.println(square.remainder(BigInteger.valueOf((int)Math.pow(10, r))));
		last = (int) (square % (int)Math.pow(10, r));
		if(num == last)
			System.out.println("Automorphic Number");
		else
			System.out.println("Not an Automorphic Number");
	}

}

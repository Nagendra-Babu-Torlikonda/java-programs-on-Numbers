package programs.numbers;

import java.util.Scanner;

public class TechNumber
{

	public static void main(String[] args)
	{
		int n, sum, r1, r2, l;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		l = String.valueOf(n).length();
		if(l % 2 == 0)
		{
			r1 = (int) (n / Math.pow(10, l / 2));
			r2 = (int) (n % Math.pow(10, l / 2));
//			System.out.println(r1 + "\t" + r2);
			sum = r1 + r2;
			if (n == sum * sum)
				System.out.println("Tech Number");
			else
				System.out.println("Not a Tech Number");
		}
		else
			System.out.println("Not a Tech Number");
	}

}

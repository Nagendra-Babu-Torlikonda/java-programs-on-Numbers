package programs.numbers;

import java.util.Scanner;

public class SunnyNumber
{

	public static void main(String[] args)
	{
		int n, sq;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		sq = n+1;
		if(Math.sqrt(sq) % 1 == 0)
			System.out.println("Sunny Number");
		else
//			System.out.println(Math.sqrt(sq) % 1);
			System.out.println("Not a Sunny Number");
			

	}

}

package programs.numbers;

import java.util.Scanner;

public class EvilNumber
{

	public static void main(String[] args)
	{
		int count = 0 ;
		Scanner input = new Scanner(System.in);
		long binary =Long.parseLong( Integer.toBinaryString(input.nextInt()));
//		System.out.println(binary);
		while(binary != 0)
		{
			if(binary % 10 == 1)
				count++;
			binary /= 10;
		}
//		System.out.println(count);
		if (count % 2 == 0)
			System.out.println("Evil Number");
		else
			System.out.println("Not an Evil Number");

	}

}

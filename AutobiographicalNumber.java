package programs.numbers;

import java.util.Scanner;

public class AutobiographicalNumber
{

	public static void main(String[] args)
	{
		int n , flag = 1;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		int digits[] = new int[String.valueOf(n).length()];
		for(int i = digits.length - 1, j = n; i >= 0 ; i--, j /= 10 )
			digits[i] = j % 10;
		for(int i = 0; i < digits.length; i++)
		{
			int count = 0;
			for(int j = 0; j < digits.length; j++)
			{
				if(i == digits[j])
					count++;
			}
			if(count != digits[i])
			{
				flag = 0;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Autobiographical Number");
		else
			System.out.println("Not an Autobiographical Number");

	}

}





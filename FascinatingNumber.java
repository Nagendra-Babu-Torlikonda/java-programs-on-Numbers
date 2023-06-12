package programs.numbers;

import java.util.Scanner;

public class FascinatingNumber
{

	public static void main(String[] args)
	{
		int n, flag = 1;
		String str;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		str = String.valueOf(n);
		if(str.length() >= 3)
		{
			int count[] = {0,0,0,0,0,0,0,0,0,0};
			str += (n * 2) + "" + (n * 3);
//			System.out.println(str);
			for (int i = 0; i < str.length(); i++)
			{
//				System.out.println(i);
				int j = Character.getNumericValue(str.charAt(i));
//				System.out.println(j);
				count[j]++;
			}
			for (int i = 1; i < 10; i++ )
			{
//				System.out.println(count[i]);
				if (count[i] != 1)
				{
					flag = 0;
					break;
				}
			}
		}
		if (flag == 1)
		{
			System.out.println("Fascinating Number");
		}
		else
			System.out.println("Not a Fascinating Number");

	}

}

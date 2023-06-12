package programs.numbers;

import java.util.Scanner;

public class KaithNumber
{

	public static void main(String[] args)
	{
		int n, sum = 0, len, flag = 0;
		Scanner input = new Scanner(System.in);
		n = input.nextInt();
		len = String.valueOf(n).length();
		int temp[] = new int[len];
		for(int i = n, j = len - 1; i >0 ; i /= 10, j--) temp[j] = i % 10;
//		for(int i = 0; i < len ; i ++) System.out.println(temp[i]);
		while(n > sum)
		{
			sum = 0;
			for(int i = 0; i < len; i ++)
			{
				sum += temp[i];
			}
			for(int i = 0; i < len - 1; i ++)
			{
				temp[i] = temp[i +1];
			}
			temp[len - 1] = sum;
//			System.out.println(sum);
			if(n == sum)
			{
				flag = 1;
				break;
			}
		}
		if (flag == 1)
			System.out.println("Keith Number");
		else
			System.out.println("Not a Keith Number");
	}

}

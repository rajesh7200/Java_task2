package pgm_task2;

import java.util.Scanner;

public class Armstrong {
	static void armstrongNo(int num)
	{
		int copy=num;
		int sum=0;
		while(num!=0)
		{
			int rem=num%10;
			sum=sum+(rem*rem*rem);
			num=num/10;
		}
		if(copy==sum)
		{
			System.out.println(copy+" is a Armstrong Number.");
		}
		else {
			System.out.println(copy+" is not a Armstrong Number.");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number to see number is Armstrong or not.");
		int x=sc.nextInt();
		
		armstrongNo(x);
	}

}

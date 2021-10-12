package question_1;

import java.util.*;

public class driver {
	public static void main(String r[])
	{
		Scanner sc=new Scanner(System.in);
		
		//code to get the transactions done by PayMoney
		System.out.println("Enter the size of transaction array");
		int size=sc.nextInt();
		System.out.println("Enter the values of array");
		int transactions[]=new int[size];
		for(int i=0;i<size;i++) transactions[i]=sc.nextInt();
		
		
		System.out.println("Enter the total no of targets that needs to be achieved");
		int numberOfTargets=sc.nextInt();
		int target;
		int sum, i, j;
		for(i=1;i<=numberOfTargets;i++)
		{
			System.out.println("Enter the value of target");
			target=sc.nextInt();
			// code to find at which transaction PayMoney achieves the target
			sum=0;
			for(j=0;j<=size;j++)
			{
				if(sum<target)
				{
					//target has not been achieved yet
					if(j<size) sum+=transactions[j];
				}
				else
				{
					//target has been achieved
					break;
				}
			}
			if(j>size)
			{
				//target is not achievable
				System.out.println("The target is not achieved\n");
			}
			else
			{
				// here value of j tells the transaction number at which target achieved
				System.out.printf("Target achieved after %d transactions\n\n",j);
			}
		}
		sc.close();
	}
}

package question_2;

import java.util.*;

public class driver {
	public static void main(String f[])
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of currency denominations");
		int size=sc.nextInt();
		int denominations[]=new int[size];
		System.out.println("Enter the curreny denominations value");
		for(int i=0;i<size;i++)
		{
			denominations[i]=sc.nextInt();
		}
		//calling function to sort denominations array as it was given in random order
		MergeSort.mergeSort(denominations, 0, size-1);
		System.out.println("Enter the amount you want to pay");
		int amount=sc.nextInt();
		Map<Integer, Integer> map=new HashMap<>();
		int amountLeft=amount;
		int c;
		//following is the code to find the minimum number of notes that need to be paid
		for(int i=size-1;i>=0;i--)
		{
			if(amountLeft>=denominations[i])
			{
				c=amountLeft/denominations[i];
				map.put(denominations[i], c);
				amountLeft-=denominations[i]*c;
			}
		}
		
		System.out.println("Your payment approach in order to give min no of notes will be");
		for(Map.Entry<Integer,Integer> e:map.entrySet())
		{
			System.out.println(e.getKey()+":"+e.getValue());
		}
		sc.close();
	}
}

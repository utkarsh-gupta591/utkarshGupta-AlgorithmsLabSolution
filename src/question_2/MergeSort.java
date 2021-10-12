package question_2;

public class MergeSort {
	public static void merge(int a[], int lb1, int ub1, int lb2, int ub2)
	{
		int n1=ub1-lb1+1;
		int n2=ub2-lb2+1;
		
		int[] L=new int[n1];
		int[] R=new int[n2];
		
		for(int i=lb1;i<=ub1;i++) L[i-lb1]=a[i];
		for(int i=lb2;i<=ub2;i++) R[i-lb2]=a[i];
		
		int i=0,j=0,k=lb1;
		while(i<n1 && j<n2)
		{
			if(L[i]<=R[j])
			{
				a[k]=L[i];
				i++;
				k++;
			}
			else
			{
				a[k]=R[j];
				j++;
				k++;
			}
		}
		
		while(i<n1)
		{
			a[k]=L[i];
			i++;
			k++;
		}
		while(j<n2)
		{
			a[k]=R[j];
			j++;
			k++;
		}	
	}
	public static void mergeSort(int a[], int low, int high) {
		if(low==high) return;
		int mid=(low+high)/2;
		mergeSort(a, low, mid);
		mergeSort(a, mid+1, high);
		merge(a, low, mid, mid+1, high);
	}
}

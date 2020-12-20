//Q27. WJP to perform ascending order Quick sort

import java.util.*;

public class Assignment_27 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the lenght of the Array :");
		int iArrlen = sc.nextInt();
		int[] iArray = new int[iArrlen];

		int iBegin = 0, iEnd = iArrlen-1;

		System.out.println("Enter the elements of an Array");
		for (int i = 0; i < iArrlen; i++) {
			iArray[i] = sc.nextInt();
		}

		quickSort(iArray, iBegin, iEnd);

		System.out.println("Sorted Array using Quick Sort :");
		for (int i = 0; i < iArrlen; i++)
			System.out.print(iArray[i] + " ");

	}

	public static void quickSort(int[] iArr, int iBegin, int iEnd) {
		int loc;
		if (iBegin < iEnd) {
			loc = partition(iArr, iBegin, iEnd);
			quickSort(iArr, iBegin, loc - 1);
			quickSort(iArr, loc + 1, iEnd);
		}
	}
	
    public static int partition(int a[], int beg, int end)  
    {  
          
        int left, right, temp, loc, flag;     
        loc = left = beg;  
        right = end;  
        flag = 0;  
        while(flag != 1)  
        {  
            while((a[loc] <= a[right]) && (loc!=right))  
            right--;  
            if(loc==right)  
            flag =1;  
            else if(a[loc]>a[right])  
            {  
                temp = a[loc];  
                a[loc] = a[right];  
                a[right] = temp;  
                loc = right;  
            }  
            if(flag!=1)  
            {  
                while((a[loc] >= a[left]) && (loc!=left))  
                left++;  
                if(loc==left)  
                flag =1;  
                else if(a[loc] <a[left])  
                {  
                    temp = a[loc];  
                    a[loc] = a[left];  
                    a[left] = temp;  
                    loc = left;  
                }  
            }  
        }  
        return loc;  
    }   
}

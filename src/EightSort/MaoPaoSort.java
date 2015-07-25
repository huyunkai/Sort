/*
 * 冒泡排序：
 * 思路：在要排序的一组数中，对当前还未排好序的范围内的全部数，自上而下对相邻的两个数
 * 依次进行比较和调整，让较大的数往下沉，较小的往上冒。即：每当两相邻的数比较后发现它
 * 们的排序与排序要求相反时，就将它们互换
 * */
package EightSort;

public class MaoPaoSort {
	public static void main(String []args)
	{
		int[] arr={49,38,65,97,76,13,27,49,78,34,12,64,
				5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int num=0;
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length-1-i;j++)
			{
//				if(arr[j+1]>arr[j])//第一个数去最大比较
//				{
//					num=arr[j+1];
//					arr[j+1]=arr[j];
//					arr[j]=num;
//				}
				if(arr[j]>arr[j+1])
				{
					num=arr[j+1];
					arr[j+1]=arr[j];
					arr[j]=num;
				}
			}
		}
		for(int i=0;i<arr.length;i++)
		{
			System.out.println("arr[i]="+arr[i]);
		}
	}
}

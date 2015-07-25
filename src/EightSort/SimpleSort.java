/*
 * 简单选择排序：
 * 思路：
 * 在排序的一组数中，选出最小的一个数与第一个位置的数交换。
 * 然后在剩下的数当中再找最小的第二个位置的数交换，如此循环
 * 到倒数第二个数和最后一个数比较为止.
 * */
package EightSort;

public class SimpleSort {
	public static void main(String []args)
	{
		int[] a={1,54,3,6,78,34,12,45};
		int pos=0;
		for(int i=0;i<a.length;i++)
		{
			int j=i+1;
			pos=i;
			int num=a[i];
			
			for(;j<a.length;j++)
			{
				if(num>a[j])
				{
					num=a[j];
				     pos=j;
				}
			}

			a[pos]=a[i];
			a[i]=num;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[i]="+a[i]);
		}
	}
}

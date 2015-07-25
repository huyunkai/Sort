/*
 *直接插入排序
 *思路：在排序的一组数中，假设前面的（n-1）的数已经是排好顺序的，现在
 *要把第n个数插到前面的有序数中，使得n个数也是排好顺序的，如此反复循环，
 *知道全部排好顺序。
 * */
package EightSort;

public class DirectSort {
	public static void main(String []args)
	{
		int[] a={12,22,49,38,65,97,76,13,27,49
		       ,78,34,12,64,5,4,62,99,98,54,56,17,18,23,34,15,35,25,53,51};
		int num=0;
		for(int i=1;i<a.length;i++)
		{
			num=a[i];
			int j=i-1;
			for(;j>=0&&num<a[j];j--)
			{
				a[j+1]=a[j];
				
			}
			a[j+1]=num;
		}
		for(int i=0;i<a.length;i++)
		{
			sop("a[i]="+a[i]);
		}
	}
	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}

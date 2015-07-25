/*
 * 希尔排序
 * 思路：先将要排序的一组数按某个增量d分成若干组，每组记录下标相差d，对每组中全部元素进行直接
 * 插入排序，然后再用一个较小的增量对他进行分恩祖，在每组中在进行直接插入排序。当增量减到1时，
 * 进行直接插入排序后，排序完成。
 * 
 * */
package EightSort;

public class XierSort {
	public static void main(String []args)
	{
		int[] a={1,54,3,2,6,12,34,78,45,56,100};
		double d1=a.length;
		int num=0;
		while(true)
		{
			d1=Math.ceil(d1/2);//返回的是跟当前值取大的那个数.
			int d=(int)d1;
			for(int x=0;x<d;x++)
			{
				for(int i=x+d;i<a.length;i+=d)
				{
					int j=i-d;
					num=a[i];
					for(;j>=0&&num<a[j];j-=d)
					{
						a[j+d]=a[j];
					}
					a[j+d]=num;
				}
			}
			if(d==1)
				break;
		}
		for(int i=0;i<a.length;i++)
		{
			System.out.println("a[i]="+a[i]);
		}
	}
}

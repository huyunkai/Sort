/*
 * ��ѡ������
 * ˼·��
 * �������һ�����У�ѡ����С��һ�������һ��λ�õ���������
 * Ȼ����ʣ�µ�������������С�ĵڶ���λ�õ������������ѭ��
 * �������ڶ����������һ�����Ƚ�Ϊֹ.
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

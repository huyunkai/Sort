/*
 *ֱ�Ӳ�������
 *˼·���������һ�����У�����ǰ��ģ�n-1�������Ѿ����ź�˳��ģ�����
 *Ҫ�ѵ�n�����嵽ǰ����������У�ʹ��n����Ҳ���ź�˳��ģ���˷���ѭ����
 *֪��ȫ���ź�˳��
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

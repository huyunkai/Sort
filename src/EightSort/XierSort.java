/*
 * ϣ������
 * ˼·���Ƚ�Ҫ�����һ������ĳ������d�ֳ������飬ÿ���¼�±����d����ÿ����ȫ��Ԫ�ؽ���ֱ��
 * ��������Ȼ������һ����С�������������зֶ��棬��ÿ�����ڽ���ֱ�Ӳ������򡣵���������1ʱ��
 * ����ֱ�Ӳ��������������ɡ�
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
			d1=Math.ceil(d1/2);//���ص��Ǹ���ǰֵȡ����Ǹ���.
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

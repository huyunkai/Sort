/*
 * ð������
 * ˼·����Ҫ�����һ�����У��Ե�ǰ��δ�ź���ķ�Χ�ڵ�ȫ���������϶��¶����ڵ�������
 * ���ν��бȽϺ͵������ýϴ�������³�����С������ð������ÿ�������ڵ����ȽϺ�����
 * �ǵ�����������Ҫ���෴ʱ���ͽ����ǻ���
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
//				if(arr[j+1]>arr[j])//��һ����ȥ���Ƚ�
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

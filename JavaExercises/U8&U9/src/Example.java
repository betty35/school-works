

import java.util.*;

public class Example {
	/*
	 * �˷����������Ƕ�һ���ַ��������ҡ�
	 * ������Ҳ���ATG�򷵻�һ������{-1,-1}
	 * ������ҵ�ATG�Ļ��������һ��Ԫ�ط���ATG�ĺ���һ��λ��
	 * Ȼ��Ӻ����ٿ�ʼ���ң�ÿ3����Ϊһ�ף�����TAG TAA TGA����һ��
	 * �ҵ�����ʹ��������ڶ���Ԫ���� �������ǰ���λ��
	 * �Ҳ����Ļ� ����ڶ���Ԫ�ػ���-1
	 */
	static int[] findGenome(String string, int start) {
		int[] giveback = new int[2];
		giveback[0] = -1;
		giveback[1] = -1;
		int i = string.indexOf("ATG", start);
		if (i == -1)
			return giveback;
		else {
			giveback[0] = i + 3;
			for (int j = i + 3; j < string.length() - 3; j += 3) {
				String tri = string.substring(j, j + 3);
				if (tri.equals("TAG") ||tri.equals("TAA")|| tri.equals("TGA")) {
					giveback[1] = j - 1;
					break;
				}
			}
			return giveback;
		}
	}

	public static void main(String[] args) {
		System.out.print("Enter a genome string please: ");
		Scanner input = new Scanner(System.in);
		String genome = input.nextLine();
		int[] store = findGenome(genome, 0);

		if (store[0] < 0) {//��η���������� ��������ַ������Ƿ���ATG û�оʹ�ӡû�ҵ� �رճ���
			System.out.println("no gene is found");
			System.exit(0);
		}

		for (int i = 0; i < genome.length() - 9; i++) {//�еĻ��ͼ����������ΪɶҪ��9������Ҳ���������9��û��
			store = findGenome(genome, i);//��ѭ���ӵ�һ��λ�ÿ�ʼ������
			if (store[0] < 0)//�Ҳ���ATG���˳�ѭ����
				break;
			else if (store[1] < 0) {//�Ҳ���TAG TAA TGA����2������ѭ������1�� �ܹ�3��λ�� ����
				i += 2;
				continue;
			} else {//������ҵ��ʹ�ӡ Ȼ�������ĵڶ���Ԫ�ط��ص�λ���ٿ�ʼ���� Ҳ����TAG TAA TGA��ǰ��λ��
				System.out.println(genome.substring(store[0], store[1]));//�����ȡ����ATG�����ҵ���TAG TAA TGA֮����ַ��� ������1λ
				i = store[1];
			}
		}
		/*
		 * �����������������˵���ATG�ҵ�֮�� ATG��TAA TAG TGA֮��������3�ı����Ļ� �Ͳ����ӡ�κ����� 
		 * ����֮ ��main����������ѭ����ֱ�Ƕ��� ���Ǻ��滹�еڶ���ATG �����Ҳ���ֱ�Ӵӷ��ص�store[0]�Ǹ�λ�����²���
		 * �����ַ�����adasdasdadaATG123123123123123TAA123456789
		 * ���ؽ����12312312312312
		 */
	}
}
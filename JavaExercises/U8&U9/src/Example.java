

import java.util.*;

public class Example {
	/*
	 * 此方法的作用是对一条字符串做查找。
	 * 如果查找不到ATG则返回一个数组{-1,-1}
	 * 如果查找到ATG的话，数组第一个元素返回ATG的后面一个位置
	 * 然后从后面再开始查找，每3个字为一阶，查找TAG TAA TGA其中一项
	 * 找到结果就存放在数组第二个元素中 存的是其前面的位置
	 * 找不到的话 数组第二个元素还是-1
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

		if (store[0] < 0) {//这段翻译过来就是 我输入的字符串中是否有ATG 没有就打印没找到 关闭程序
			System.out.println("no gene is found");
			System.exit(0);
		}

		for (int i = 0; i < genome.length() - 9; i++) {//有的话就继续，这里……为啥要减9个……也许是最后面9个没用
			store = findGenome(genome, i);//靠循环从第一个位置开始找起来
			if (store[0] < 0)//找不到ATG就退出循环了
				break;
			else if (store[1] < 0) {//找不到TAG TAA TGA就跳2个加上循环还跳1个 总共3个位置 再找
				i += 2;
				continue;
			} else {//如果都找到就打印 然后从数组的第二个元素返回的位置再开始查找 也就是TAG TAA TGA的前面位置
				System.out.println(genome.substring(store[0], store[1]));//这里截取的是ATG到查找到的TAG TAA TGA之间的字符串 并且少1位
				i = store[1];
			}
		}
		/*
		 * 从上面分析看来就是说如果ATG找到之后 ATG和TAA TAG TGA之间间隔不是3的倍数的话 就不会打印任何内容 
		 * 换言之 在main函数中做得循环简直是多余 除非后面还有第二个ATG 那样我不如直接从返回的store[0]那个位置重新查找
		 * 测试字符串：adasdasdadaATG123123123123123TAA123456789
		 * 返回结果：12312312312312
		 */
	}
}
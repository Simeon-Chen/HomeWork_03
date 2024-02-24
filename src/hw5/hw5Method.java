package hw5;

import java.util.ArrayList;

public class hw5Method {

//	1.請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
	public void starSquare(int width, int height) {
		for (int i = 0; i < height; i++) {
			System.out.println();
			for (int j = 0; j < width; j++) {
				System.out.print("*");
			}
		}
	}

//	2. 請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
	public void randAvg() {
		int[] arr = new int[10];

//		先用迴圈將十個亂數整數存進陣列中
		for (int i = 0; i < arr.length; i++) {
			int randomNum = (int) (Math.random() * 101);
			arr[i] = randomNum;
		}

//印出陣列中元素
		int total = 0;
		System.out.println("本次亂數結果:");
		for (int j = 0; j < arr.length; j++) {
			System.out.print(arr[j] + " ");
			total += arr[j];
		}
		System.out.println();
		System.out.println(total / arr.length);
	}

//	3.利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//	   可以找出二維陣列的最大值並回傳,如圖:
	public int maxElement(int x[][]) {
		int bigger = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > bigger) {
					bigger = x[i][j];
				}
			}
		}
		return bigger;
	}

	public double maxElement(double x[][]) {
		double bigger = 0;
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				if (x[i][j] > bigger) {
					bigger = x[i][j];
				}
			}
		}
		return bigger;
	}

//	5. 請設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//    與數字的亂數組合
	public static final char[] chars = {

			'0', '1', '2', '3', '4', '5', '6', '7', '8', '9',

			'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',

			'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z',

			'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N',

			'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z' };

	public static String genAuthCode() {
		ArrayList<Character> list = new ArrayList<>();
		for (int j = 0; j < 8; j++) {
			char ranChar = chars[(int) (Math.random() * 62)];
			list.add(ranChar);
		}
		StringBuilder sb = new StringBuilder();
		for (char c : list) {
			sb.append(c);
		}
		return sb.toString();
	}

}

package hw5;

import java.util.Scanner;

public class hw5 extends hw5Method{

	public static void main(String[] args) {
		
//		1.請設計一個方法為starSquare(int width, int height),當使用者鍵盤輸入寬與高時,即會印出對應的*長方形
		hw5Method method = new hw5Method();
		Scanner sc = new Scanner(System.in);
		System.out.println("請依次輸入寬與高:");
		int width = sc.nextInt();
		int height = sc.nextInt();
		method.starSquare( width, height);
		
//		2.請設計一個方法為randAvg(),從10個 0~100(含100)的整數亂數中取平均值並印出這10個亂數與平均值
		method.randAvg();
		
//		3.利用Overloading,設計兩個方法int maxElement(int x[][])與double maxElement(double x[][]),
//		   可以找出二維陣列的最大值並回傳,如圖:
		int [][] arrInt = {
				{2,6,8,345,643},
				{231,798,694,12,3}
		};
		System.out.println(method.maxElement(arrInt));
		
		double[][] arrDouble = {
			{1.2, 3.5, 2.6, 4.9},
			{7.4, 8.1, 7.9, 9.3}
		};
		System.out.println(method.maxElement(arrDouble));
		
		
//		5. 請設計一個方法genAuthCode(),當呼叫此方法時,會回傳一個8位數的驗證碼,此驗證碼內容包含了英文大小寫
//		    與數字的亂數組合
        System.out.println("本次隨機產生的驗證碼為:" + genAuthCode());
		
	}
}

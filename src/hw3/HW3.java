package hw3;

import java.util.Scanner;

public class HW3 {
	public static void main(String[] args) {
//		請設計一隻程式,使用者輸入三個數字後,輸出結果會為正三角形、等腰
//		三角形、其它三角形或不是三角形,如圖示結果:

		Scanner s = new Scanner(System.in);

		System.out.println("請輸入三個整數");
		int num1 = s.nextInt();
		int num2 = s.nextInt();
		int num3 = s.nextInt();

		if (num1 == 0 || num2 == 0 || num3 == 0) {
			System.out.println("這不是三角形");
		} else if (num1 == num2 && num2 == num3) {
			System.out.println("正三角形");
		} else if (num1 == num2 || num2 == num3 || num1 == num3) {
			System.out.println("等腰三角形");
		} else if (Math.pow(num1, 2) + Math.pow(num2, 2) == Math.pow(num3, 2)
				|| Math.pow(num3, 2) + Math.pow(num2, 2) == Math.pow(num1, 2)
				|| Math.pow(num3, 2) + Math.pow(num1, 2) == Math.pow(num2, 2)) {
			System.out.println("直角三角形");
		} else if (num1 + num2 > num3 || num2 + num3 > num1 || num1 + num3 > num2) {
			System.out.println("其他三角形");
		} else {
			System.out.println("這不是三角形");
			s.close();
		}

		// 請設計一隻程式,會亂數產生一個0~100的數字,然後可以玩猜數字遊戲,猜錯會顯示錯誤訊息(更大or更小),猜
		// 對則顯示正確訊息,如圖示結果:
		int i = (int) (Math.random() * 100)+1;
		System.out.print("請猜一個0到100的數字: ");
		Scanner ran = new Scanner(System.in);
		int userguess = 0;
		do {
			userguess = ran.nextInt();
			if (userguess > i) {
				System.out.println("猜錯囉，數字要再小一點");
			} else if  (userguess < i){
				System.out.println("猜錯囉，數字要再大一點");
			} else {
				System.out.println("答對囉! 答案就是" + i);
			}
		} while (userguess != i);
		

		System.out.println("---------------------------------------------------------");
		
		// 阿文很喜歡簽大樂透(1~49),,但這次他想要依心情決定討厭哪個數字,請您設計一隻程式,
		// 讓阿文可以輸入他不想要的數字(1~9),畫面會顯示他可以選擇的號碼與總數

		int range = 49;
		int ban = 0;
		int count = 0;

		System.out.println("阿文...請輸入你討厭哪一個數字?");
		Scanner scanner = new Scanner(System.in);
		ban = scanner.nextInt();

		for (int j = 1; j <= range; j++) {
			if ((j % 10 != ban) && (j / 10) != ban) {
				count += 1;
				System.out.print(j + " ");
			}
		}
		scanner.close();
		ran.close();
		System.out.println("總共有" + count + "個數字可選");
	}
}
package hw4;

import java.util.Scanner;

public class hw4 {
	public static void main(String[] args) {
//		1.取平均與大於平均的數
		int[] x = { 29, 100, 39, 41, 50, 8, 66, 77, 95, 15 };
		int sum = 0;

		for (int i = 0; i < x.length; i++) {
			sum += x[i];
		}
		int avg = (sum / x.length);
		System.out.println("陣列平均數為:" + avg);

		int count = 0;
		for (int i = 0; i < x.length; i++) {
			if (x[i] > avg) {
				count++;
			}
		}

		int[] greaterThanAvg = new int[count];
		int index = 0;

		for (int i = 0; i < x.length; i++) {
			if (x[i] > avg) {
				greaterThanAvg[index] = x[i];
				index++;
			}
		}
		System.out.println("陣列中大於平均數的數字有:");
		for (int i = 0; i < greaterThanAvg.length; i++) {
			System.out.print(greaterThanAvg[i] + " ");
		}
		System.out.println();
		System.out.println("=======================================================");

//		2.請建立一個字串,經過程式執行後,輸入結果是反過來的
		String hello = "Hello!JAVA!";
		String reverse = "";
		for (int j = hello.length() - 1; j >= 0; j--) {
			reverse += hello.charAt(j);
		}
		System.out.println(reverse);
		System.out.println("=======================================================");

//		3.有個字串陣列如下 (八大行星):
//	       {“mercury”, “venus”, “earth”, “mars”, “jupiter”, “saturn”, “uranus”, “neptune”}
//		   請用程式計算出這陣列裡面共有多少個母音(a, e, i, o, u)

		String[] planet = { "mercury", "venus", "earth", "mars", "jupiter", "saturn", "uranus", "neptune" };
		int count1 = 0;
		for (int k = 0; k < planet.length; k++) {
			for (int j = 0; j < planet[k].length(); j++) {
				if (planet[k].charAt(j) == ('a') || planet[k].charAt(j) == ('e') || planet[k].charAt(j) == ('i')
						|| planet[k].charAt(j) == ('o') || planet[k].charAt(j) == ('u')) {
					count1++;
				}
			}
		}
		System.out.println("該陣列中共有:" + count1 + "個母音");
		System.out.println("=======================================================");

//		4.請設計一個程式,可以讓小華輸入欲借的金額後,便會顯示哪些員工編號的同事
//			有錢可借他;並且統計有錢可借的總人數:例如輸入 1000 就顯示「有錢可借的
//			員工編號: 25 19 27 共 3 人!」

		int[][] colleague = { { 25, 32, 8, 19, 27 }, { 2500, 800, 500, 1000, 1200 } };
		Scanner sc = new Scanner(System.in);
		System.out.println("阿文，這次又想借多少?");
		int howMuch = sc.nextInt();

		int count2 = 0;
		System.out.println("這次可以借你錢的人有:");
////		遍歷員工編號
		for (int m = 0; m < colleague[0].length; m++) {
////			檢查金額陣列
			if (colleague[1][m] >= howMuch) {
				System.out.print(colleague[0][m] + " ");
				count2++;
			}
		}
		System.out.println("共" + count2 + "位");
		System.out.println("=======================================================");

//		請設計由鍵盤輸入三個整數,分別代表西元yyyy年,mm月,dd日,執行後會顯示是該年的第幾天
//     例:輸入 1984 9 8 三個號碼後,程式會顯示「輸入的日期為該年第252天」

		int[][] days = { { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 },
				{ 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 } };
		Scanner sc1 = new Scanner(System.in);
		System.out.println("請依次輸入年、月、日以計算該日為該年的第幾天:");
		int year = sc1.nextInt();
		int month = sc1.nextInt();
		int day = sc1.nextInt();

//		加上二月的判斷
		if (month == 2) {
			if (days[1][1] == 29 && day > 29) {
				System.out.println("閏年的二月最多有29天");
				return;
			} else if (day > 28) {
				System.out.println("非閏年的二月最多有28天");
				return;
			}
		}

//        判斷該年是否是閨年
		int countDays = 0;
		if ((year % 400) == 0 || (year % 4 == 0 && year % 100 != 0)) {
			days[1][1] = 29;
		}
		;

		for (int n = 0; n < days[0].length; n++) {
			if (month != (days[0][n])) {
				countDays += days[1][n];
			} else {
				countDays += day;
				break;
			}
		}
		System.out.println("輸入的日期為該年的第" + countDays + "天");
		System.out.println("=======================================================");
		int[][] score = { { 10, 35, 40, 100, 90, 85, 75, 70 }, { 37, 75, 77, 89, 64, 75, 70, 95 },
				{ 100, 70, 79, 90, 75, 70, 79, 90 }, { 77, 95, 70, 89, 60, 75, 85, 89 },
				{ 98, 70, 89, 90, 75, 90, 89, 90 }, { 90, 80, 100, 75, 50, 20, 99, 75 } };
		int[] bestScoCount = new int[score[0].length]; // 初始化一維陣列，長度為每次考試的人數

		for (int p = 0; p < score.length; p++) {
			int top = 0; // 重置最高分
			for (int q = 0; q < score[p].length; q++) {
				if (score[p][q] > top) {
					top = score[p][q]; // 更新最高分
				}
			}
			// 將該次考試最高分的人數加 1
			for (int q = 0; q < score[p].length; q++) {
				if (score[p][q] == top) {
					bestScoCount[q] += 1;
				}
			}
		}

		// 將每個學生考過最高分的次數印出來
		int num = 1;
		for (int s = 0; s < bestScoCount.length; s++) {
			System.out.println(num + "號學生考過最高分的次數是" + bestScoCount[s]);
			num++;
		}

	}
}
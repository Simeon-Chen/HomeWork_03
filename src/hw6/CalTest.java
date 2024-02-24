package hw6;

import java.util.Scanner;

public class CalTest {

//	 呼叫方法
	public static void main(String[] args) {
		
        Scanner scanner = new Scanner(System.in);
        int x = 0;
        while (true) {
            System.out.print("請輸入x的值：");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt();
                break;
            } else {
                System.out.println("請輸入有效的正整數。");
                scanner.next(); 
            }
        }
        
        int y = 0;
        while (true) {
            System.out.print("請輸入y的值：");
            if (scanner.hasNextInt()) {
                y = scanner.nextInt();
                break;
            } else {
                System.out.println("請輸入有效的正整數。");
                scanner.next(); // 將無效的輸入略過
            }
        }
		
		try {
			System.out.println(Calculator.powerXY(x, y));
		} catch (CalException ce) {
			System.out.println( ce.getMessage());
		}	
		 scanner.close();
	}
}

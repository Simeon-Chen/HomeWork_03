package hw1;

public class HW1 {

//Q1. 計算12,6和&積
	public static void main(String[] args) {
		int a = 12, b = 6;
		System.out.println("12加 6和為" + (a + b));
		System.out.println("12加 6積為" + a * b);

		System.out.println("------------------------------");

//Q2.	200EGGS幾打幾顆?
		int eggs = 200;
		int dozen = 12;
		System.out.println("200顆蛋共是" + (eggs / dozen) + "打又" + (eggs % dozen) + "顆");

		System.out.println("------------------------------");

//Q3. 256559sec = ?day ?hour ? min ?sec	

		long target = 256559;
		int days = (int) target / 86400;
		int hours = (int) (target % 86400) / 3600;
		int mins = (int) ((target % 86400) % 3600) / 60;
		int secs = (int) ((target % 86400) % 3600) % 60;
		System.out.println(target + "為" + days + "天" + hours + "小時" + mins + "分鐘" + secs + "秒");

		System.out.println("------------------------------");

//Q4.定義一常數PI = 3.1415, 並計算 r=5 圓面積&圓周長
		final double PI = 3.1415;
		int r = 5;
		System.out.println("半徑為" + r + "的圓面積為" + (r * r * PI) + "，" + "圓周長為" + ((r + r) * PI));

		System.out.println("------------------------------");
//	Q5.BANK裡有150萬利率2%, 利息持續存入計算10年後本金加利息總額    
//FV(總額)=PV(本金)*(1+I(利率)) 的N次方-期數   (目前錯 再改)  
		long pv = 1500000;
	    double i = 0.02f;
		double fv = 0;
		int years = 10;
		
//    fv =(pv *( Math.pow ((1+i), 10)));
		for (int count = 1; count <= years; count++) {
			fv =(int) (pv * Math.pow(1 + i, count));
		}
		System.out.println("十年後本金加利息共" + fv+ "元");

//Q6.
		System.out.println(5 + 5);
		// 視為數字相加為10
		System.out.println(5 + '5');
		// 視為字元串接unocode
		System.out.println(5 + "5");
		// 視為字串作串接數字5 接 字串5

	}

}

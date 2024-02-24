package hw6;

public class Calculator {

//	寫被呼叫的方法
//在Calculator.java裡有個自訂方法為powerXY(int x, int y),功能是會計算x的y次方並回傳結果。

	 public static double powerXY(int x, int y) throws CalException {
	        if (x == 0 && y == 0) {
	            throw new CalException("x與y同時為0，無意義");
	        }
	        if (y < 0) {
	            throw new CalException("y為負值,而導致x的y次方結果不為整數");
	        }
	        return Math.pow(x, y);
	    }
}

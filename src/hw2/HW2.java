package hw2;

public class HW2 {
	public static void main(String[] args) {
		int number = 1000;
		int total = 0;
		for (int i = 1; i <= 1000; i++) {
				if (i % 2 == 0) {
					total += i;
				} 
		}
		System.out.println("1～1000的偶數和=" + total);
		
		System.out.println("------------------------------");
		int sum = 1 ;
		for(int i2 = 1;  i2<=10; i2++) {
			sum *=i2;
		}
		System.out.println("1～10的連乘積(for迴圈)=" + sum);
		
		System.out.println("------------------------------");
		int sum3 = 1;
		int i3 = 1;
		while(i3<=10) {
			sum3 *=i3;
			i3++;
		}
		System.out.println("1～10的連乘積(while迴圈)=" + sum3);
		
		System.out.println("------------------------------");
		double i4 = 1;
		double add = 3;
		for(i4=1; add<100; i4++) {
			add = Math.pow(i4, 2);
			System.out.printf("%.0f  ",add);
		}
		System.out.println("");
		System.out.println("------------------------------");
		
		int count = 1;
		int range = 49;
		for(int i5 =1; i5<=range; i5++) {
			if ((i5% 10 != 4) && (i5/10) != 4) {
				count +=1;
				System.out.println("阿文可以選擇的數字有:" +i5 +"");
			} 
		}
		System.out.println("總共有:" +count +"個數字可以選擇");
		System.out.println("------------------------------");
		
		int [] array = {1,2,3,4,5,6,7,8,9,10};
		for(int i =10; i >= 0; i--) {
				for(int j = 1; j <=i; j++) {
					System.out.print(j);
				}
				System.out.print("\n"); 
			}
		System.out.println("------------------------------");
		char [] array1 =new char[] {'A' ,'B' ,'C', 'D','E','F'};
		for (int i = 0;   i<array1.length  ; i++) {
			for(int j = 0; j<=i ; j++) 
				System.out.print(array1[i] );
				System.out.print("\n");
		}	
		}			
	}
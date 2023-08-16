package com.test.question;

public class Q060 {
	
	public static void main(String[] args) {
		//요구사항] 아래와 같이 출력하시오
		//조건] 마지막 숫자가 100이 넘기 전까지 출력하시오.
		/*출력]
		  1 + 1 + 2 + 3 + 5 + 8 + 13 + 21 + 34 + 55 + 89 +  = 232
		  		+1 +1  +2 +3 +5
		  
		 */
		
		int sum = 1;
		int a = 0;
		int b = 1;
		int temp = 0;
		String txt = "1 + ";
		
		while(true) {
			
			temp = a + b;
			
			if(temp > 100) {
				break;
			}
			
			txt += temp +" + ";
			sum += temp;
			
			a = b;
			b = temp;
		}
		
		System.out.printf("%s = %d\n", txt, sum);
		
	}//main

}/*피보나치 수열 메소드 만들어서 구하는 방법도 있다.

private static int fibonacci(int index) {
		if (index == 0)
			return 1;
		else if (index == 1)
			return 1;
		return fibonacci(index - 2) + fibonacci(index - 1);
*/

// 1 + 1 + 2 + 3 + 5...
// 1+1+2+3+5...
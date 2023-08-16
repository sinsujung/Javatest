package com.test.question;

public class Q054 {

	public static void main(String[] args) {
		
		//요구사항] 2부터 100사이의 소수를 구하시오
		//조건 ] 소수: 1과 자기 자신으로 밖에 나눠지지 않는 수
		/*우선 우리는 2와 100안에 있는 소수를 구해야해.
		 내가 j이면 약수가 1과 j이다. 
		 따라서 1이 아닌 수로 나누면 나머지가 무조건 나옴.
		 그러면 우리는 2부터 100까지의 수 중에서 2,3,4,5,6,7,8,9로 나눴을때 	
		 */
		
		int i = 0 ;
		int j = 0 ;
		int count = 0;
		
		for(i=2; i<100; i++) {
			for(j=1; j<=i; j++) {
				if(i % j == 0) {
					count += 1;						
				}
			}
			
			if (count == 2) {
			System.out.print(i+ ", "); 
			}
			count = 0;//ㄱㅖ속 누적 되기 때문에 꼭 초기화하기
			
		}
	}
}

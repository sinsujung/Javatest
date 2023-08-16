package com.test.java.collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import java.util.Comparator;

public class Ex67_sort {

	public static void main(String[] args) {

		// Ex67_sort.java

		//m1();
		//m2();
		//m3();
		//m4();
		m5();
		
		
	}// main

	private static void m5() {
		
		//컬렉션의 정렬
		//1. ArrayList(순서가 있는 목록) > 정렬 가능
		//2. HashMap(순서가 없는 데이터) > 정렬 불가능
		//3. Queue(순서가 있지만 정렬하지 않는다(순서가 중요한 컬렉션이라서))
		//4. Stack(순서가 있지만 정렬하지 않는다(순서가 중요한 컬렉션이라서))
		//5. HashSet(방번호 자체가 없음) > 정렬 불가능
		
		ArrayList<Integer>list = new ArrayList<Integer>();
		for(int i=0; i<10 ; i++) {
			list.add((int)(Math.random() * 100)); // 0~99
		}
		
		System.out.println(list);
		
		//Collections.sort(list);//Arrays.sort()랑 같은 아이 
//		Collections.sort(list, new Comparator<Integer>() {//comparator -> 오버라이드해서 사용~
//
//			@Override
//			public int compare(Integer o1, Integer o2) {
//				
//				return o2-o1;
//			}
//			
//		});
		
		list.sort(new Comparator<Integer>() {

			@Override
			public int compare(Integer o1, Integer o2) {
				return o1 - o2;
			}
			
		});
		
		System.out.println(list);
	}

	private static void m4() {
		
		//객체 정렬
		Score[] list = new Score[5];
		
		list[0] = new Score("홍길동", 100, 90, 80);
		list[1] = new Score("신수정", 98, 78, 88);
		list[2] = new Score("황은하", 78, 95, 79);
		list[3] = new Score("황주원", 56, 78, 76);
		list[4] = new Score("아무개", 99, 67, 79);
		
		System.out.println(Arrays.toString(list));
	
		
		
		//Arrays.sort(list);// > 오름차순 정렬해주세요~ 뭐로 정렬할지 알려줘야지~ 모르잖아요~ 그래서 에러나는거에요~
		Arrays.sort(list, new Comparator<Score>() {

			@Override
			public int compare(Score o1, Score o2) {
				
				//return o1.getName().compareTo(o2.getName());//이름 내림차순
				//return o2. getKor() - o1.getKor();//국어점수 내림차순
				return (o2.getKor() + o2.getEng() + o2.getMath())
						-(o1.getKor() + o1.getEng() + o1.getMath());//총점 내림차순
			}
			
		}); 
		
		System.out.println(Arrays.toString(list));
	}

	private static void m3() {
		Calendar[] dates = new Calendar[5];
		
		for(int i=0; i<dates.length; i++) {
			dates[i] = Calendar.getInstance();
		}
		
		dates[0].add(Calendar.DATE, 7);
		dates[1].add(Calendar.DATE, -2);
		dates[2].add(Calendar.DATE, 1);
		dates[3].add(Calendar.DATE, 0);
		dates[4].add(Calendar.DATE, 3);
		
		for(int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		Arrays.sort(dates);
		
		for(int i=0; i<dates.length; i++) {
			System.out.printf("%tF\n", dates[i]);
		}
		System.out.println();
		
		Arrays.sort(dates, new Comparator<Calendar>() {
			@Override
			public int compare(Calendar o1, Calendar o2) {
				
				//return(int) (o2.getTimeInMillis() - o1.getTimeInMillis());// 날짜 내림차순 이렇게 할 수 있는데 위험부담 있다~
				//return o2.compareTo(o1); //그래서 이렇게 하면 안전하다~ 날짜 내림차순
				
				//일~토
				return o1.get(Calendar.DAY_OF_WEEK) - o2.get(Calendar.DAY_OF_WEEK); //요일별로 정렬
			}
			
		});
		for(int i=0; i<dates.length; i++) {
			System.out.printf("%tF %tA\n", dates[i], dates[i]);
		}
		System.out.println();
	}

	private static void m2() {
		//자료형별 정렬
		//1. 숫자
		//2. 문자(열) > 문자코드값 > 숫자
		//3. 날짜시간 > 숫자
		//4. 객체(***)
		
		String txt1 ="ABC";
		String txt2 = "abc";
		
		//System.out.println(txt1 > txt2);//주솟값은 에러 /...........
		//문자열 > 문자열 : 불가능(참조값)
		//문자 > 문자 : 가능(값)
		
		//System.out.println('A' > 'B');
		
		int n = 0;
		for (int i=0; i<3; i++) {
			char c1 = txt1.charAt(i);
			char c2 = txt2.charAt(i);
			
			if(c1 > c2) {
				n=1;
				break;
			}else if(c1 < c2) {
				n=-1;
				break;
			}
		
		}
		System.out.println(n);
		System.out.println(txt1.compareTo(txt2));
		System.out.println(txt1.compareToIgnoreCase(txt2));
		
		
		String[] names = {"홍길동", "아무개", "유재석", "박명수", "이순신", "훈", "김철"};
		
		//가나다순으로 정렬
		System.out.println(Arrays.toString(names));
		
		//Arrays.sort(names);
		
		System.out.println(Arrays.toString(names));
		
		Arrays.sort(names,new Comparator<String>() {

			@Override
			public int compare(String o1, String o2) {
				
				//return o2.compareTo(o1);//앞에 o1이 오면 오름차순, o2가 오면 내림차순//문자 코드값 비교 > 가나다
				
				//return o1.length() - o2.length(); //글자 수 비교
				
				if(o1.length() > o1.length()) {
					return 1;
				}else if(o1.length() < o2.length()) {
					return -1;
				}else {
					return o2.compareTo(o1);
				}
			}
			
		});
		
		System.out.println(Arrays.toString(names));
		
	}

	private static void m1() {
		Integer[] nums = { 1, 5, 3, 2, 4 };

		System.out.println(Arrays.toString(nums));
		
		//오름차순 정렬
		//Arrays.sort(nums); //Quick Sort
		
		
		// 내림차순 정렬 > 지원 안함 > 직접 구현
		// Arrays.sort(배열, Comparator);
		Arrays.sort(nums, new MyComparator());
		System.out.println(Arrays.toString(nums));

		// 쓸모 없ㅇ므..
		MyComparator mc1 = new MyComparator();
		System.out.println(mc1.compare(10, 20));

		Double[] nums2 = { 2.5, 7.1, 3.8, 9.2, 8.9 };
		Arrays.sort(nums2, new Comparator<Double>() {

			@Override
			public int compare(Double o1, Double o2) {

				if (o1 < o2) {
					return 1;
				} else if (o1 > o2) {
					return -1;
				} else {
					return 0;
				}
			}

		});
		System.out.println(Arrays.toString(nums2));
	}
}

//정렬 때문에 선언한 클래스
class MyComparator implements Comparator<Integer> {
	@Override
	public int compare(Integer o1, Integer o2) {

		// o1 vs o2
		// 1. 오름 차순
		// a. o1이 더 크면 > 양수 반환 > 1
		// b. o2가 더 크면 > 음수 반환 > -1
		// c. 같으면 > 0 반환

		// 2. 내림 차순
		// a. o1이 더 크면 > 음수 반환 > -1
		// b. o2가 더 크면 > 양수 반환 > 1
		// c. 같으면 > 0 반환

//		if (o1 > o2) {
//			return 1;
//		} else if (o1 < o2) {
//			return -1;
//		} else {
//			return 0;
//		}
		return (int)Math.ceil(o2 - o1 * 10);// Math.ceil > 올림 해주는거 0.1 , 0.2 > 1로
		//return o2 - o1;
	}
}



class Score {
	
	private String name;
	private int kor;
	private int eng;
	private int math;
	

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public Score(String name, int kor, int eng, int math) {
		super();
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}
	
	@Override
	public String toString() {
		return "Score [name=" + name + ", kor=" + kor + ", eng=" + eng + ", math=" + math + "]\n";
	}
	
}
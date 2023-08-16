package com.test.java.collection;

import java.util.TreeMap;
import java.util.Vector;

public class Ex71_TreeMap {
	
	public static void main(String[] args) {
		
		//Ex72_TreeMap.java
		
		//TreeMap
		//-Tree > 이진 탐색 트리 > 자동 정렬
		//- Map > 키 + 값 > 연관 배열
		
		TreeMap<String,String> map = new TreeMap<String,String>();
		
		map.put("white", "흰색");
		map.put("black", "검정");
		map.put("red", "빨강");
		map.put("yellow", "노랑");
		map.put("blue", "파랑");
		map.put("orange", "주황");
		map.put("green", "초록");

		System.out.println(map.size());
		
		System.out.println(map);//key가 자동으로 정렬되어있다~
		
		System.out.println(map.get("green"));//key를 요청해서 return값 받기~
		
		map.put("green", "녹색");
		
		System.out.println(map.get("green"));
		
		System.out.println(map.firstKey());
		System.out.println(map.lastKey());
		
		System.out.println(map.headMap("m"));// m으로 시작하는 전값 까지 가져옴~
		System.out.println(map.tailMap("m"));// m이후의 값을 가져옴~
		System.out.println(map.subMap("r", "y"));//r,y 사이 값 가져오기 r 포함
		
		Vector<Integer> list = new Vector<Integer>();
		
		list.add(10);
		System.out.println(list.get(0));
		
		/*
		 
		 	List
		 	- ArrayList > 배열이 필요할 때 / 삽입, 삭제(X)*****
		 	- LinkedList > ArrayList 대체제 /삽입, 삭제 (O)
		 	- Stack > 스택구조 필요하면 쓸 수 밖에없고 
		 	- Queue > 큐 구조 필요하면 이거 쓸 수 밖에 없죠
		 	- Vector 
		 	
		 	Set
		 	- HashSet > 중복값 배제, 유일한 집합*****
		 	- TreeSet > HashSet에 정렬이 필요하다고 느껴질 때 사용 // 근데 해시셋에 정렬 쓸 상황 거의 없음
		 	
		 	Map
		 	- HashMap > 키/값 연관 배열이 필요할 때*****
		 	- TreeMap > HashMap + 정렬
		 	- HashTable: HashMap 이전에 쓰던 애
		 	
		 	- Properties > JSON, XML
		 	
		 
		 */
		
		
		
	}//main

}




























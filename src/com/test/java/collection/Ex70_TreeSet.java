package com.test.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class Ex70_TreeSet {
	
	public static void main(String[] args) {
		
		//Ex70_TreeSet.java
		
		/*
		 
		 	TreeSet
		 	- Tree 구조 > 이진 트리 구조(이진 탐색 트리 , Binary Search Tree):가지가 최대 2개까지 밖에 못 만드는 구조, 정렬이 이미 되어있는 구조
		 	- Set 사용법
		 	
		 	Set
		 	- 순서가 없다.
		 	- 중복값을 가지지 않는다.
		 
		 
		 */
		
		HashSet<Integer> set1 = new HashSet<Integer>();
		TreeSet<Integer> set2 = new TreeSet<Integer>();
		
		set1.add(10);
		set1.add(30);
		set1.add(40);
		set1.add(20);
		set1.add(50);

		set2.add(10);
		set2.add(30);
		set2.add(40);
		set2.add(20);
		set2.add(50);
	
		System.out.println(set1);
		System.out.println(set2);//역순은 못해요~ 그정도까지 바라시면 안되고~
		
		//탐색 > for / iterator
		
		for (int n : set2) {
			System.out.println(n);
		}
		
		Iterator<Integer> iter = set2.iterator();
		
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println();
		
		//TreeSet 고유 기능
		System.out.println(set2.first());//가장 작은 요소 뽑기
		System.out.println(set2.last());// 가장 큰 요소 뽑기
		
		System.out.println(set2.headSet(30));// 부분집합이 반환 되거든요~ 첫번째꺼부터 30이란 숫자를 만나기 전까지~ //exclusive
		System.out.println(set2.tailSet(30));// 이후에 있는 나머지 애들 반환 30포함 //inclusive
		System.out.println(set2.subSet(20,40));//20(앞에꺼)포함, 40(뒤에꺼) 포함 x // 20,30 반환
		System.out.println(
				);
		
		HashSet<Integer> set3 = new HashSet<Integer>();
		
		set3.add(20);
		set3.add(50);
		set3.add(30);
		set3.add(10);
		set3.add(40);
		
		System.out.println(set3);
		
		ArrayList<Integer> list = new ArrayList<Integer>(set3);//HashSet 정렬하는 방법 list로 바꿔서 sort한다
		
		Collections.sort(list);
		
		System.out.println(list);
		
		
		
	}//main

}
















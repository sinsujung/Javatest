package com.test.question.q97;

public class Refrigerator {
	/*
	 * -Refrigerator 객체의 정보 Refrigerator 객체의 사용 Item을 냉장고에 넣는다. void add(Item item);
	 * Item을 냉장고에서 꺼낸다. Item get(String name); 냉장고에 있는 Item의 개수를 확인한다. int count();
	 * 냉장고에 있는 Item을 확인한다. void listItem();
	 * 
	 * 
	 */

	private Item[] items = new Item[100];
	private static int count = 0;// 냉장고에 음식 집어 넣을라고

	public void add(Item item) {
		items[count] = item;
		count++;
		System.out.printf("'%s'를 냉장고에 넣었습니다.\n", item.getName());
	}

	public Item get(String name) {
		for (int i = 0; i < items.length; i++) {
			if (items[i].getName().equals(name)) {
				Item item = items[i];
				items[i] = null;
				count--;
				return item;
			}
		}
		return null;
	}

	public int count() {
		return count;
	}

	public void listItem() {
		System.out.println("[냉장고 아이템 목록]");
		for (int i = 0; i < items.length; i++) {
			if (items[i] != null) {
				System.out.printf("%s(%s)\n", items[i].getName(), items[i].getExpiration());
			}
		}
	}
}
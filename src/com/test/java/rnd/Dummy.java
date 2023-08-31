package com.test.java.rnd;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;

public class Dummy {

	public static void main(String[] args) {

		contents();

	}

	private static void contents() {
		try {

			String[] str1 = { "오늘은 힘든 날 입니다. ", "오늘 날이 참 좋습니다. ", "강의실이 바뀌었어요. ", "강사님이 바뀌었어요. ", "새로 수강하시는 분들은 준비물을 꼭 챙겨주세요. ", "화이팅" };
			String[] str2 = { "수강신청한 수강생 여러분들께 ", "정원이 차지 않아서 강좌를 진행할 수 없습니다. ", "점심 맛있게 드세요. ", "좋은 주말 보내세요. ", "좋은 휴일 보내세요. ", "더위조심하세요. " };
			String[] str3 = { "비가 많이 와서 교육이 어렵습니다. ", "오늘은 집에서 쉬시면 좋을 것 같습니다. ", "수강생 여러분들 오늘 하루도 힘내세요. ", "오전 강의는 쉬겠습니다. ", "오후 강의는 쉬겠습니다. ", "듣고 싶은 수업을 생각해오세요. " };
			String[] str4 = { "오늘은 출석체크를 하지 않습니다.", "쉬실 분들은 쉬세요. ", "수강 도중의 수강취소는 환불이 어렵습니다. ", "강의실 잘 찾아오세요. ", "조심히 오세요. ", "모두들 기운냅시다. " };

			Random rnd = new Random();

			BufferedWriter writer = new BufferedWriter(new FileWriter("data\\contents.txt"));

			for (int i = 0; i < 157; i++) {

				String str = str1[rnd.nextInt(str1.length)] + str2[rnd.nextInt(str2.length)]
						+ str3[rnd.nextInt(str1.length)] + str4[rnd.nextInt(str2.length)];

				String s = String.format("%s\r\n", str);
				writer.write(s);
			}

			writer.close();
		} catch (Exception e) {
			System.out.println("at Dummy.main");
			e.printStackTrace();

		}
	}

}

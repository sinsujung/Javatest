package com.test.question;

import java.util.Scanner;

public class Q091 {
	
	public static void main(String[] args) {
		//요구사항] 연산식을 입력받아 실제 연산을 하시오.
		/*조건] 
			산술 연산자만 구현하시오.(+, -, *, /, %)
			연산식의 공백은 자유롭게 입력 가능합니다.
			산술 연산자가 반드시 존재하는지 체크하시오.
			피연산자의 갯수가 2개인지 체크하시오.
		*/

		String op = "";
		String[] temp = new String[2];
		int result = 0;

		Scanner scan = new Scanner(System.in);

		System.out.print("입력: ");
		String cal = scan.nextLine();

		cal = cal.replace(" ", "");

		op = operator(cal);

		if (!op.equals("")) {

			temp = cal.split("\\"+op);

			if (temp.length == 2) {
				int n1 = Integer.parseInt(temp[0]);
				int n2 = Integer.parseInt(temp[1]);

				if (op.equals("+")) {
					result = n1 + n2;
				} else if (op.equals("-")) {
					result = n1 - n2;
				} else if (op.equals("*")) {
					result = n1 * n2;
				} else if (op.equals("/")) {
					result = n1 / n2;
				} else if (op.equals("%")) {
					result = n1 % n2;

				}
				System.out.printf("%d %s %d = %d\n", n1, op, n2, result);
			} else {
				System.out.println("피연산자가 부족합니다.");
			}

		} else {
			System.out.println("연산자가 올바르지 않습니다.");
		}
	}// main

	private static String operator(String cal) {
		if (cal.contains("+")) {
			return "+";
		} else if (cal.contains("-")) {
			return "-";
		} else if (cal.contains("*")) {
			return "*";
		} else if (cal.contains("/")) {
			return "/";
		} else if (cal.contains("%")) {
			return "%";
		}
		return "";
	}

}

package Ch2;

import java.util.Scanner;

public class Season4 {
	public static void main(String[] args) { // 김종현
		Scanner sc = new Scanner(System.in);

		System.out.println("봄/여름/가을/겨울 중에 입력하시오:");
		String season = sc.next();
		char c = season.charAt(0);
		
		if (c == '봄') { // 기본데이터 타입 (정수, 실수, 문자, 불린) 비교연산자 사용 가능
			System.out.println("3~5월입니다.");
		}
		if (season.equals("봄")) {
			System.out.println("3~5월입니다.");
		}
		
		sc.close();
	}
}

package Ch2;

import java.util.Scanner;

public class Season2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("봄/여름/가을/겨울 중에 입력하시오:");
		String season = sc.next();
		char c = season.charAt(0); // 문자열에서 문자로 추출 (문자입력은 문자열에서 처리)
		
		switch (season) {		
		case "봄":
			System.out.println("3~5월입니다.");
			break;
		case "여름":
			System.out.println("6~8월입니다.");
			break;
		case "가을":
			System.out.println("9~11월입니다.");
			break;
		case "겨울":
			System.out.println("12~2월입니다.");
			break;
		default:
			System.out.println("잘못된 입력입니다.");
		}
		sc.close();
	}
}

package Ch2;

import java.util.Scanner;

public class Ch02_Ex10 {

	public static void main(String[] args) { // 김종현
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("커피 주문하세요>>");
		String coffee = sc.next();
		int num = sc.nextInt();

		switch (coffee) {
		case "에스프레소":
			if (num >= 10)
				System.out.println((2000 * num * 95 / 100) + "원입니다.");
			else
				System.out.println(2000 * num + "원입니다.");
			break;
		case "아메리카노":
			System.out.println(2500 * num + "원입니다.");
			break;
		case "카푸치노":
			System.out.println(3000 * num + "원입니다.");
			break;
		case "카페라떼":
			System.out.println(3500 * num + "원입니다.");
			break;
		default:
			System.out.println("잘못 주문하셨습니다.");
		}

		sc.close();
	}

}

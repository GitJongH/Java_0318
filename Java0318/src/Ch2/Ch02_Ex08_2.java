package Ch2;

import java.util.Scanner;

public class Ch02_Ex08_2 {

	public static void main(String[] args) { // 김종현
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		System.out.print("커피 주문하세요>>");
		String coffee = sc.next();
		int num = sc.nextInt();
		
		if (coffee.equals("에스프레소")) {
			System.out.println(2000*num + "원입니다.");
		}
		if (coffee.equals("아메리카노")) {
			System.out.println(2500 * num + "원입니다.");
		}
		if (coffee.equals("카푸치노")) {
			System.out.println(3000 * num + "원입니다.");
		}
		if (coffee.equals("카페라떼")) {
			System.out.println(3500 * num + "원입니다.");
		}
		
		sc.close();
	}

}

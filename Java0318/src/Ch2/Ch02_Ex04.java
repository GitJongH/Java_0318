package Ch2;

import java.util.Scanner;

public class Ch02_Ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점 (x, y)의 좌표를 입력하세요>>");
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if ((x >= 50 && x <= 100) && (y >= 50 && y <= 100)) {
			System.out.println("점 (" + x + ", " + y + ") 은 (50, 50)과 (100, 100)의 사각형 내에 있습니다.");
		}
		else {
			System.out.println("\"점 (" + x + ", " + y + ") 은 (50, 50)과 (100, 100)의 사각형 내에 없습니다.");
		}
		
		sc.close();
	}

}

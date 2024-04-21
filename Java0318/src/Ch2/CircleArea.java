package Ch2;

public class CircleArea {
	public static final double PI = 3.14; // 원주율을 상수로 선언
	
	public static void main(String[] args) {
		double radius = 10.2;					// 원의 반지름
		double circleArea = radius*radius*PI;	// 원의 면적
		
		// 원의 면적을 화면에 출력한다.
		System.out.print("반지름 " + radius + ", ");
		System.out.println("원의 면적 = " +  circleArea);
	}

}

package main;

public class Quiz4 {

	public static void main(String[] args) {

//		String str = "1.23";
//		int num = Integer.parseInt(str);		//실수를 정수로 변환하려고해서 에러남 대상이 잘못 되었어요 
//		int num =  정수클래스. 문자열정수 -> 숫자형 정수

		try {
			String str = "1.23";
			int num = Integer.parseInt(str);
		} catch (NumberFormatException e) {
			System.out.println(e);
		}
		System.out.println("정상종료요");
		

	}

}

package main;

public class Quiz1 {

	public static void main(String[] args) {

//		int num = 5 / 0; => 0으로 나눌 수 없어서 에러
//		System.out.println("프로그램 정상종료요");
//		프로그램 정상 종료되도록 예외처리하세요

		try {
			int num = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println(e);			// 사실 꼭 있어야 하는건 아니
		}
		System.out.println("프로그램 정상종료 기기");

		
	}
	
	

}

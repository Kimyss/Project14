package main;

public class Quiz2 {

	public static void main(String[] args) {

//		String s = null;
//		System.out.println(s.length());
//		System.err.println("프로그램 정상종료요");

//		개체를 선언만하고 길이 출력하여 에러 빈 객체는 사용할 수 없어서 에러

//		예외선언하세요

		try {
			String s = null;
			System.out.println(s.length());
		} catch (NullPointerException e) {
			System.out.println(e);
		}
		System.out.println("프로그램 정상종료요");

	}

}

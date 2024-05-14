package main;

public class Ex5 {

	public static void main(String[] args) {
		
		try {

			int[] arr = new int[5];
			arr[5] = 5;

		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);	// 에러 메세지만 출력
			e.printStackTrace();	// 에러 발생 위치와 에러메세지 함께 출력
		}
		System.out.println("프로그램 정상 종료");
		
		
//		Exception 모든 클래스의 부모클래스 사용하면 모든 에러를 처리할 수 있음

	}

}

package main;

public class Ex4 {

	public static void main(String[] args) {

//		int[] arr = new int[5];
//		arr[5] = 5;
//		★ try 안으로 넣어줘

		try {

			int[] arr = new int[5];
			arr[5] = 5;

		} catch (ClassCastException e) {
			System.out.println(e);
		} catch (ArithmeticException e) {
			System.out.println(e);
		}
		System.out.println("프로그램 정상 종료");
		
//		예외 처리를 했다고 해서 다 되는건 아니다 다른 오류문쓰면 안돼

	}

}

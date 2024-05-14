package main;

public class Ex3 {

	public static void main(String[] args) {

		/*
		 * 에러가 발생한 / 발생시킬 수 있는 오류를 try안에 넣어주세요 
		 * catch가 전달 받을 수 있도록 매개변수 만드세요. 
		 * 오류코드 부분을 자료형으로 하세요
		 * 에러코드 모를땐 에러 발생시켜서 그냥 복붙하세요
		 */

		try {
			int[] arr = new int[5];
			arr[5] = 5;

		} catch (ArrayIndexOutOfBoundsException e) {

			System.out.println(e);
		}
		System.out.println("프로그램이 정상 종료되요");

	}

}

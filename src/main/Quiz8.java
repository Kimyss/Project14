package main;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class Quiz8 {

	public static void openTextFile() throws FileNotFoundException {
//		객체 생성하지 않고 메소드 만들기 static 붙여주세요
		
//		정적메소드
		FileInputStream fis = new FileInputStream("src/main/a.txt");

	}

	public static void main(String[] args) {
//		throw던졌기 때문에 여기서 에러나요 openTextFile();
		
		try {
			openTextFile();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
	}

}

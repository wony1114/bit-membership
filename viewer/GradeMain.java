package viewer;

import java.util.Scanner;

import gradebook.GradeDTO;

public class GradeMain {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		GradeDTO grade = null;
		while (true) {
			System.out.println("0.종료 1. 성적등록 2. 등수발표(이름, 합계, 평균)");
			switch (scanner.next()) {
			case "1":
				grade = new GradeDTO();
				System.out.println("이름: ");
				grade.setName(scanner.next());
				System.out.println("국어: ");
				grade.setName(scanner.next());
				System.out.println("영어: ");
				grade.setName(scanner.next());
				System.out.println("수학: ");
				grade.setName(scanner.next());

				break;

			case "2":

				break;
			case "0":
				System.out.println("시스템 종료");
				break;
			}
		}

		

	}

}

package confirm.ch03;
/*
 * 날짜 : 2023/07/18
 * 이름 : 최정민
 * 내용 : 교재 107p
 */
public class Test3 {
	public static void main(String[] args) {
		int pencils = 534;
		int students = 30;
		
		// 학생 한 명이 가지는 연필 수 
		int pencilsPerStudent = pencils / students;
		System.out.println(pencilsPerStudent);
		
		// 남는 연필 수 
		int pencilsLeft = pencils % students;
		System.out.println(pencilsLeft);
	}
}

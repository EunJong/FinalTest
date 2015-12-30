import java.util.ArrayList;

import student.Course;
import student.Student;

public class TestGradeStrategy {

	private static ArrayList<Student> mathStudents = new ArrayList<Student>();
	private static ArrayList<Student> englishStudents = new ArrayList<Student>();

	public static void main(String[] args) {
	
		
		Student s1 = new Student(141213, "이승기", "수학");
		Student s2 = new Student(141518, "김수현", "영어");
		Student s3 = new Student(141230, "주원", "수학");
		Student s4 = new Student(141255, "김우빈", "수학");
		Student s5 = new Student(141590, "이민호", "영어");
		

		mathStudents.add(s1);
		mathStudents.add(s3);
		mathStudents.add(s4);
		englishStudents.add(s2);
		englishStudents.add(s5);
		
		
		Course math = new Course(mathStudents, "수학");
		Course english = new Course(englishStudents, "영어");
		
		System.out.println("수학 과목의 학생 리스트");
		System.out.println(math.getStudentName());
		
		System.out.println("영어 과목의 학생 리스트");
		System.out.println(english.getStudentName());
		
		s1.setScore("수학", 95);
		s1.setScore("영어", 20);
		s2.setScore("수학", 90);
		s2.setScore("영어", 1000);
		s3.setScore("수학", 76);
		s3.setScore("영어", 60);
		s4.setScore("수학", 85);
		s4.setScore("영어", 89);
		s5.setScore("수학", 90);
		s5.setScore("영어", 95);
		
		System.out.println("각 학생들의 성적");
		System.out.println(s1.getAllGrade());
		System.out.println(s2.getAllGrade());
		System.out.println(s3.getAllGrade());
		System.out.println(s4.getAllGrade());
		System.out.println(s5.getAllGrade());
		
	}
	
}

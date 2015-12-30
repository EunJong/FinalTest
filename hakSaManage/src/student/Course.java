package student;

import java.util.ArrayList;

public class Course {

	int id=0;
	String major;
	ArrayList<Student> studentList = new ArrayList<Student>();
	String names = null;
	
	
	public Course(ArrayList<Student> students, String major){
		this.major = major;
		this.studentList = students;
		id++;

	}
	
	public String getStudentName(){
		
		
		for(int i =0; i<studentList.size();i++){
			names += studentList.get(i).name;
			names += " ";
		}
		
		return names;
	}
}

package student;

import java.util.ArrayList;

import strategy.MajorStrategy;
import strategy.MinorStrategy;

public class Student {

	int hakBun;
	String name;
	public String major;
	
	ArrayList<Score> scores = new ArrayList<Score>();
	int id = 0;
	
	public Student(int hakBun, String name, String major){
		this.hakBun = hakBun;
		this.name = name;
		this.major = major;
		
	}
	
	public void setScore(String courseName, int score){
		
		Score tempScore = new Score(this.name, courseName, score);
		this.scores.add(tempScore);
		id++;
		
	}
	
	public ArrayList<Score> getScore(){
		return scores;
	}
	
	public String getAllGrade(){
		
		MajorStrategy majorStrategy = new MajorStrategy();
		MinorStrategy minorStrategy = new MinorStrategy();
		String result;
		
		result = name + "의 전공은 "+ major +"입니다.";
		
		for(int i = 0; i < scores.size(); i++){
			if(major == scores.get(i).courseName){
				result += scores.get(i).courseName + "의 학점은 " + majorStrategy.getGrade(scores.get(i).score) +"입니다.";
			}else{
				result += scores.get(i).courseName + "의 학점은 " + minorStrategy.getGrade(scores.get(i).score) + "입니다.";
			}
		}	
		 
		return result;
	}
	
	
}

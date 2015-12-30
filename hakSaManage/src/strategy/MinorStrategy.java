package strategy;

public class MinorStrategy implements GradeStrategy {


	@Override
	public String getGrade(int score) {
		String grade = null;
		
		if(score >89){
			grade = "A";
		}else if(score >79){
			grade = "B";
		}else if(score >69){
			grade = "C";
		}else if(score >54){
			grade = "D";
		}else{
			grade = "F";
		}
		
		return grade;
	}
}

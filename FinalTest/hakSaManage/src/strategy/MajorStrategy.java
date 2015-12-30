package strategy;

public class MajorStrategy implements GradeStrategy {


	@Override
	public String getGrade(int score) {
		String grade = null;
		
		if(score >94){
			grade = "S";
		}else if(score >89){
			grade = "A";
		}else if(score >79){
			grade = "B";
		}else if(score >69){
			grade = "C";
		}else if(score >59){
			grade = "D";
		}else{
			grade = "F";
		}
		
		return grade;
	}

}

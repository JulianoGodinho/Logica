package model;

public class SchoolAverage {

	private String subject;
	private float grade1;
	private float grade2;
	private float average;
	private short absent;
	
	public SchoolAverage(String subject, float grade1, float grade2, short absent) {
		this.subject = subject;
		this.grade1 = grade1;
		this.grade2 = grade2;
		this.absent = absent;
	}

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public float getGrade1() {
		return grade1;
	}

	public void setGrade1(float grade1) {
		this.grade1 = grade1;
	}

	public float getGrade2() {
		return grade2;
	}

	public void setGrade2(float grade2) {
		this.grade2 = grade2;
	}
	
	public void verifyAverage() {
		this.average = (this.grade1 + this.grade2) / 2;
	}
	
	public String verifyApprovals() {
		if (this.absent > 4) {
			return "Aluno reprovado na disciplina " + this.subject + " por faltas! \n";
		} else if (this.average >= 6){
			return "O aluno esta aprovado na disciplina " + this.subject + " com nota média " + this.average;
		} else {
			return "Aluno reprovado na disciplina de " +this.subject + " com nota média " + this.average;
		}
	}
	
}

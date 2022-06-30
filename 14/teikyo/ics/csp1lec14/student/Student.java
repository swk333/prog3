package teikyo.ics.csp1lec14.student;
import teikyo.ics.csp1lec14.*;

public class Student extends Person implements Learner{

	Study study;
	
	public Student(){
		this.study = new Programming();
		this.age = 20;
		this.name = "Hanako";
	}
	
	public Study getStudy(){
    return study;
	}

	public void printInfo(){
		System.out.println(name + "/" + age + "/" + study.getStudyName());
	}

	public void setValues(String name, int age, Study subject){
		this.name = name;
		this.age = age;
		this.study = subject;
	}
}
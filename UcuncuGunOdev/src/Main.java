
public class Main {

	public static void main(String[] args) {
	
		
		// öðrenci 
		
Student student = new Student();
		
		student.setStudentNo("125");
		student.setFirstNAme("Ýsmail");
		student.setLastName("ALKURT");
		student.setStudentNo("115");
		student.setBolum("Bilgisayar Bilimi");
		
		// öðretmen
		Instructor instructor = new Instructor();
		instructor.setFirstNAme("Engin");
		instructor.setLastName("DEMÝROÐ");
		instructor.setAlani("Yazýlým Mühendisi");
		instructor.setMernisNo("12666666");
		
		
		
	StudentManager studentmanager = new StudentManager();
	studentmanager.Add(student);
	
	StudentLogger studentlogger = new StudentLogger();
	studentlogger.log();

	InstructorManager instructormanager = new InstructorManager();
	instructormanager.Add(instructor);
	
	InstructorLogger instructorlogger = new InstructorLogger();
	instructorlogger.log();
	
	
	}

}

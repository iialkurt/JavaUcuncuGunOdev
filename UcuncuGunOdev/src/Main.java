
public class Main {

	public static void main(String[] args) {
	
		
		// ��renci 
		
Student student = new Student();
		
		student.setStudentNo("125");
		student.setFirstNAme("�smail");
		student.setLastName("ALKURT");
		student.setStudentNo("115");
		student.setBolum("Bilgisayar Bilimi");
		
		// ��retmen
		Instructor instructor = new Instructor();
		instructor.setFirstNAme("Engin");
		instructor.setLastName("DEM�RO�");
		instructor.setAlani("Yaz�l�m M�hendisi");
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

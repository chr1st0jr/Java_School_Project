import java.util.ArrayList;

public class SchoolClass {
	ArrayList<String> studentList;
	ArrayList<String> classList;
	String classRepresentative;
	String mainTeacher;
	
	public SchoolClass() {
		studentList = new ArrayList<String>();
		classList = new ArrayList<String>();
		
	}
	
	public void addStudent(String student) {
		studentList.add(student);
	}
	
	public void addClass(String newClass) {
		classList.add(newClass);
		showClass();
	}
	
	public void showClass() {
		//for (String Clist: classList) {
		// System.out.println("class list: + Clist");
		for(int i = 0; i < classList.size(); i++) {
			System.out.println("class list: " + classList.get(i));
		}
	}
	public void showStudent() {
		for(String student : studentList) {
			System.out.println("student list: " + student);
		}
	}
	
}

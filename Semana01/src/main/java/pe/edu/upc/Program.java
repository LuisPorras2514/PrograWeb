package pe.edu.upc;

public class Program {

	public static void main(String[] args) {
		
		Student student = new Student();
		student.setFirstName("Luis Alfredo Porras Tarifeño");
		System.out.println(student.getFirstName());
		student.setId(1L);
		System.out.println(student);
	}

}

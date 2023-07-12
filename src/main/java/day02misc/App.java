package day02misc;

public class App {
	
	public static void main(String[] args) {
		Academy accademy = new Academy();
		accademy.setName("Freshworks Software Accademy");
		accademy.setId(1234);
		accademy.setCode("FSSA");

		Student student1 = new Student();
		student1.setName("Nandakumar");
		student1.setEmail("nandakumar@gmail.com");
		student1.setId(5678);
		System.out.println("Instence: " + Student.count);

		Student student2 = new Student();
		student2.setName("Siva");
		student2.setEmail("siva@gmail.com");
		student2.setId(7891);
		System.out.println("Instence: " + Student.count);

	}

}

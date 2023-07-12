package day02.practice;

class UserDetails {
	String email;
	int id;
	String name;
	String password;

	public String getName() {
		return name;
	}

	public void setName(String newName) {
		name = newName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String newPassword) {
		password = newPassword;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String newEmail) {
		email = newEmail;
	}

	public int getId() {
		return id;
	}

	public void setId(int newId) {
		id = newId;
	}
}

public class User {

	public static void main(String[] args) {

		UserDetails user = new UserDetails();
		user.setName("Nandakumar");
		user.setId(23456);
		user.setPassword("nanda@123");
		user.setEmail("nanda@gmail.com");

		System.out.println("Name: " + user.getName());
		System.out.println("Email: " + user.getEmail());
		System.out.println("Id: " + user.getId());
		System.out.println("Password: " + user.getPassword());

	}

}
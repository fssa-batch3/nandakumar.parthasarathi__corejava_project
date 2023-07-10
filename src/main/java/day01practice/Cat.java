package day01practice;
public class Cat {
	
	private int age;
	private String color;
	
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	public void speaks() {
		 System.out.print("Meow!"+"\n");
	}
	
	 public static void main(String[] args) {
		
		 Cat cat1 = new Cat();
		 cat1.setAge(10);
		 cat1.setColor("orange");
		 System.out.println("Cat 1:");
		 System.out.println("Age: "+ cat1.getAge());
		 System.out.println("Color: "+ cat1.getColor());
		 System.out.print("Speaks: ");
		
		 cat1.speaks();
		
		 Cat cat2 = new Cat();
		 cat2.setAge(100);
		 cat2.setColor("White");
		 System.out.println("Cat 2:");
		 System.out.println("Age: "+ cat2.getAge());
		 System.out.println("Color: "+ cat2.getColor());
		 System.out.print("Speaks: ");
		 cat2.speaks();
		
		
	 }
	
	
}
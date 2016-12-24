package ArrayList;

public class student {
	private String name;
	private int roll;
	private int age;
	private String hall;
	
	
	public student(String name, int roll, int age, String hall) {
		super();
		this.name = name;
		this.roll = roll;
		this.age = age;
		this.hall = hall;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getRoll() {
		return roll;
	}
	public void setRoll(int roll) {
		this.roll = roll;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getHall() {
		return hall;
	}
	public void setHall(String hall) {
		this.hall = hall;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+" "+roll+" "+age+" "+hall;
	} 
	
	

}

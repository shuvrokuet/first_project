package ArrayList;
import java.util.ArrayList;
import java.util.Scanner;


public class kuet {

	public static void main(String[] args) {
	    
		//Scanner scan=new Scanner(System.in);
		String name,hall;
		int roll,age;
		// TODO Auto-generated method stub
		ArrayList<student> students=new ArrayList<student>();
		
        
		student s1=new student("shuvro", 1207027, 22, "lalon");
		student s2=new student("shovon", 1405009, 20, "lalon");

		
		students.add(s1);
		students.add(s2);
		
		for(student s:students)
		{
			System.out.println(s);
		}

	}

}

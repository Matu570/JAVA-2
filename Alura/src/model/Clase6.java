package model;

import java.util.ArrayList;
import java.util.List;

public class Clase6 {
	public static void main(String[] args) {
		Course course1=new Course("JAVA", 30);
		course1.addAula(new Aula("ArrayList"));
		course1.addAula(new Aula("List"));
		course1.addAula(new Aula("LinkedList"));
		
		ArrayList<Course>courses=new ArrayList<>();
		courses.add(course1);
		
		
		System.out.println(courses.get(0).getClaseList());
	}
}
package model;

import java.util.ArrayList;
import java.util.List;

public class Clase7 {
	public static void main(String[] args) {
		Course course1=new Course("JAVA", 30);
		course1.addAula(new Aula("ArrayList"));
		course1.addAula(new Aula("List"));
		course1.addAula(new Aula("LinkedList"));
		course1.addAula(new Aula("Inmutable"));

		
		//List<Aula>aulaList=course1.getClaseList();
		//aulaList.add(new Aula("Inmutable"));
		List<Aula>aulaList=course1.getAulaList();
		
		ArrayList<Course>courses=new ArrayList<>();
		courses.add(course1);
		
		
		System.out.println(aulaList);
	}
}
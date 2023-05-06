package model;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class Course {
	private String name;
	private int time;
	private List<Aula> aulaList = new LinkedList<>();

	public Course(String name, int time) {
		this.name = name;
		this.time = time;
	}

	public Course(String name, int time, List<Aula> claseList) {
		this.name = name;
		this.time = time;
		this.aulaList = aulaList;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTime() {
		return time;
	}

	public void setTime(int time) {
		this.time = time;
	}

	public List<Aula> getClaseList() {
		return aulaList;
	}

	public void setClaseList(List<Aula> claseList) {
		this.aulaList = claseList;
	}
	
	public void addAula(Aula clase) {
		this.aulaList.add(clase);
	}

	@Override
	public String toString() {
		return this.name;
	}
	
	public List<Aula>getAulaList(){
		return Collections.unmodifiableList(aulaList);
	}
}

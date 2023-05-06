package model;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Clase8 {

	public static final List<List<Integer>> listas = new ArrayList<List<Integer>>() {
		{
			add(new LinkedList<>());
			add(new ArrayList<>());
		}
	};

	public static void main(String[] args) {

		for(List<Integer>lista:listas) {
			final String implementationName= lista.getClass().getSimpleName();
			//add
			long inicio=System.currentTimeMillis();
			for(int i=0; i<100000;i++) {
				lista.add(i);
			};
			long fin=System.currentTimeMillis();
			long duracion=fin-inicio;
			
			System.out.println(implementationName + " add: " + duracion);
			
			
			//get
			inicio=System.currentTimeMillis();
			for(int i=0; i<100000;i++) {
				lista.get(i);
			};
			
			fin=System.currentTimeMillis();
			duracion=fin-inicio;
			System.out.println(implementationName + " get: " + duracion);

			
			
			
			//remove
		
			inicio=System.currentTimeMillis();
			for(int i=99999; i>=0;i--) {
				lista.remove(i);
			};
			
			fin=System.currentTimeMillis();
			duracion=fin-inicio;
			System.out.println(implementationName + " remove: " + duracion);
		};
	}
}
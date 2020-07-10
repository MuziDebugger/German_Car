package com.generics.germancar.debugger;
import java.util.*;

public class AssemblyLine<T extends German_Car> {
	private String modelname;
	int numcars;
	private ArrayList <T> assembly = new ArrayList<>();
	
	public AssemblyLine (String modelname) {
		this.modelname = modelname;
	}

	public String getModelname() {
		return modelname;
	}
	
	public boolean addCar(T germancar) {
		if(assembly.contains(germancar)) {
			System.out.println(germancar.getModel() + " is already in the assembly line");
		return false;
		// if on file do not add to assembly line
	} else {
		assembly.add(germancar);
		System.out.println("The " + germancar.getModel() + " has been successfully added to the " + this.modelname + " assembly line");
		return true;
		// nice!
	}
}
		public int numCars() {
		return this.assembly.size();
 }
}

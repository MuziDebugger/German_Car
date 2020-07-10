package com.generics.germancar.debugger;

public class Main {
	public static void main(String[] args) {
		
		
		AssemblyLine<Audi> audi = new AssemblyLine<>("Audi");
		Audi audi1 = new Audi("AUDI RS6");
		Audi audi2 = new Audi("AUDI R8");
		Audi audi3 = new Audi("AUDI RS7");

		audi.addCar(audi1);
		audi.addCar(audi2);
		audi.addCar(audi3);
		System.out.println(audi.numCars() + " cars have been added to the "   +  audi.getModelname() + " assembly line" + "\n");
		
		
		AssemblyLine<BMW> bmw = new AssemblyLine<>("BMW");
		BMW bmw1 = new BMW("BMW M4");
		BMW bmw2 = new BMW("BMW M4");
		BMW bmw3 = new BMW("BMW M4");
		
		bmw.addCar(bmw1);
		bmw.addCar(bmw2);
		bmw.addCar(bmw3);
		System.out.println(bmw.numCars() + " cars have been added to the "   + bmw.getModelname() +  " assembly line" + "\n");
		
		
		AssemblyLine<Mercedes_Benz> merc = new AssemblyLine<>("Mercedes Benz");
		Mercedes_Benz merc1 = new Mercedes_Benz("Mercedes E63");
		Mercedes_Benz merc2 = new Mercedes_Benz("Mercedes A45");
		Mercedes_Benz merc3 = new Mercedes_Benz("Mercedes AMG GT");
		
		merc.addCar(merc1);
		merc.addCar(merc2);
		merc.addCar(merc3);
		System.out.println(merc.numCars() + " cars have been added to the " + merc.getModelname() + " assembly line");


	}
}

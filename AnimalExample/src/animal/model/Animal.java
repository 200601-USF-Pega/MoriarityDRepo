package animal.model;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public abstract class Animal {

	private boolean domesticated;
	private String species;
	private int numberOfLegs;
	private int numberOfNoises;
	
	public abstract void move();
	public abstract void eat();
	
	public void makeNoise(String noise) {
		System.out.println("The animal says: " + noise);
		try {
			File file = new File("src/resources/AnimalNoise.txt");
			BufferedWriter write = new BufferedWriter(new FileWriter(file));
			this.numberOfNoises++;
			Integer temp = this.numberOfNoises;
			write.append(temp.toString());
			
			write.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("This " + this.getClass().getName().substring(13,16) + " made a noise: " + this.numberOfNoises + " times");
		
	}
	
	public Animal() {
		
	}
	public Animal(boolean domesticated, String species, int numberOfLegs) {
		super();
		this.domesticated = domesticated;
		this.species = species;
		this.numberOfLegs = numberOfLegs;
	}
	public boolean isDomesticated() {
		return domesticated;
	}
	public void setDomesticated(boolean domesticated) {
		this.domesticated = domesticated;
	}
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public int getNumberOfLegs() {
		return numberOfLegs;
	}
	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}
	@Override
	public String toString() {
		return "[domesticated=" + domesticated + ", species=" + species + ", numberOfLegs=" + numberOfLegs + "]";
	}
	
	
	
}

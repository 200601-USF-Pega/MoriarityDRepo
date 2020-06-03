package animal.model;

public class Dog extends Animal{

	private boolean domesticated;
	private String animalNoise;
	private int numberOfLegs;
	@Override
	public void move() {
		// TODO Auto-generated method stub
		System.out.println("The dog walked.");
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		System.out.println("The dog ate some kibble");
	}
	
	public void bark() {
		super.makeNoise(this.animalNoise);
	}

	public Dog() {
		
	}

	public Dog(boolean domesticated, String animalNoise, int numberOfLegs) {
		super();
		this.domesticated = domesticated;
		this.animalNoise = animalNoise;
		this.numberOfLegs = numberOfLegs;
	}

	public boolean isDomesticated() {
		return domesticated;
	}

	public void setDomesticated(boolean domesticated) {
		this.domesticated = domesticated;
	}

	public String getAnimalNoise() {
		return animalNoise;
	}

	public void setAnimalNoise(String animalNoise) {
		this.animalNoise = animalNoise;
	}

	public int getNumberOfLegs() {
		return numberOfLegs;
	}

	public void setNumberOfLegs(int numberOfLegs) {
		this.numberOfLegs = numberOfLegs;
	}

	@Override
	public String toString() {
		return "[domesticated=" + domesticated + ", animalNoise=" + animalNoise + ", numberOfLegs=" + numberOfLegs + "]";
	}
	
	
}

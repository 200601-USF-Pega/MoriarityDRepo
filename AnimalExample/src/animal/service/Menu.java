package animal.service;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

import animal.model.Dog;

public class Menu {

	public void Menu() {
		Dog myDog = new Dog(true, "bark", 4);
		System.out.println("Dog bark sim:");
		System.out.println("[0] make the dog bark");
		System.out.println("[1] Exit");
			Scanner sc = new Scanner(System.in);
			
			while (true) {
				String input = sc.nextLine();
				switch(input) {
					case "0":
						myDog.bark();
						
						break;
					case "1":
						File file = new File ("src/resources/AnimalNoise.txt");
						try {
							BufferedReader read = new BufferedReader(new FileReader(file));
							int num = Integer.parseInt(read.readLine());
							System.out.println("The dog barked a total of " + num + " times");
							read.close();
						} catch (IOException e) {
							e.printStackTrace();
						}
						System.exit(0);
						break;
					default:
						System.out.println("please make a proper selection");
						continue;
				}
			}	
	}
	
}

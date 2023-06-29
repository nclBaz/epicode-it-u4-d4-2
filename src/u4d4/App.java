package u4d4;

import u4d4.entities.Animal;
import u4d4.entities.Cat;
import u4d4.entities.Dog;

public class App {
	public static void main(String[] args) {
//		Rectangle r1 = new Rectangle(-10, -20);
//
//		r1.setHeight(-1000);
//		System.out.println(r1.getHeight());

//		Student aldo = new Student("Aldo", "Baglio", StudentType.FULLSTACK);
//		System.out.println(aldo);

		Dog fido = new Dog("Fido", 10, "Pastore tedesco");
		Cat felix = new Cat("Felix", 2);


		Animal[] animals = { fido, felix, new Cat("Tom", 5) };
		for (Animal animal : animals) {
			animal.walk();
			if (animal instanceof Dog)
				((Dog) animal).bark();
		}
//		for (int i = 0; i < animals.length; i++) {
//			animals[i].walk();
//			if (animals[i] instanceof Dog)
//			((Dog) animals[i]).bark();
//		}
	}
}

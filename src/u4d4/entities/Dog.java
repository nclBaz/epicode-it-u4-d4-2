package u4d4.entities;

public class Dog extends Animal implements Runner, Jumper {

	String breed;

	public Dog(String name, int age) {
		super(name, age); // Richiama il costruttore del padre
	}

	public Dog(String name, int age, String breed) {
		super(name, age); // Richiama il costruttore del padre
		this.breed = breed;
	}

	public void bark() {
		System.out.println("BAU");
	}

	@Override
	public void walk() {
		System.out.println("Sono un cane e sto camminando veloce");
	}

	public void walk(int numPassi) { // Esempio di Overload
		System.out.println("Sono un cane e sto camminando veloce, ho fatto tot passi:" + numPassi);
	}

	@Override
	public void getInfo() {
		System.out.println("Ciao sono un cane e mi chiamo:" + this.name);

	}

	@Override
	public void run() {
		System.out.println("Sto correndo");

	}

	@Override
	public void jump() {
		System.out.println("Sto saltando");

	}

}

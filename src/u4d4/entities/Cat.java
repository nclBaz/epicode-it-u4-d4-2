package u4d4.entities;

public class Cat extends Animal implements Runner {

	public Cat(String name, int age) {
		super(name, age);
	}

	@Override
	public void getInfo() {
		System.out.println("Ciao sono un gatto e mi chiamo:" + this.name);

	}

	@Override
	public void run() {
		System.out.println("Sto correndo");

	}

}

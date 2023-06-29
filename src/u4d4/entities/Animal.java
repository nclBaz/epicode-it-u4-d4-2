package u4d4.entities;

public abstract class Animal {
	String name;
	int age;

	public Animal(String name, int age) {
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void walk() {
		System.out.println("Sono un animale e sto camminando");
	}

	abstract public void getInfo();
	// Un metodo dichiarato come abstract serve per
	// obbligare i figli ad implementare tale metodo

}

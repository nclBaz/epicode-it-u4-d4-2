package u4d4.entities;

import java.util.Random;

public class Student implements Jumper {
	// Lista attributi di istanza
	private String name;
	private String surname;
	private int id;

	private StudentType studentType; // restringo i possibili valori per questo campo a quelli definiti nell'Enum

	// Lista attributi statici (attributi di classe)
	static final String school = "Epicode";

	// Lista costruttori


	public Student(String name) { // COSTRUTTORE I
		Random rndm = new Random();
		this.name = name;
		this.id = rndm.nextInt();

	}

	public Student(String name, String surname, StudentType type) { // COSTRUTTORE II
		this(name); // Richiamo il I costruttore
		this.surname = surname;
		this.studentType = type;
	}

	// GETTERS & SETTERS
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getId() {
		return id;
	}

	public StudentType getStudentType() {
		return studentType;
	}

	public void setStudentType(StudentType studentType) {
		this.studentType = studentType;
	}

	// Lista metodi
	public void sayHello() {
		System.out.println("Ciao sono " + this.name + " " + this.surname);
	}

	public void sayHello(String qualcosa) { // OVERLOADING di sayHello
		System.out.println("Ciao sono " + this.name + " " + this.surname + " e dico " + qualcosa);
	}

	public static void staticMethod() {
		System.out.println("Ciao sono un metodo statico!");
		// System.out.println(this.name); NON posso usare this all'interno dei metodi
		// statici
		System.out.println(Student.school);
	}

	@Override // Annotazione per specificare che sto sovrascrivendo il comportamento di
				// default ereditato da Object
	public boolean equals(Object obj) { // Tutte le classi ereditano da Object una serie di metodi, tra i quali c'è
										// equals
		Student s = (Student) obj;
		if (this.name == s.name && this.surname == s.surname) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", surname=" + surname + ", id=" + id + ", studentType=" + studentType + "]";
	}

	@Override
	public void jump() {
		System.out.println("Sto saltando");

	}

}

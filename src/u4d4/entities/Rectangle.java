package u4d4.entities;

public class Rectangle {
	// double width, height;
	// Se non specifico nessun modificatore di visibiltà gli attributi avranno una
	// visibilità "package-friendly", che significa che saranno visibili solo a
	// classi dello stesso package
	private double width, height; // "private" significa visibile solo all'interno di questa classe

	public Rectangle(double x, double y) { // "public" significa visibile a tutte le classi del progetto
		this.setHeight(x);
		this.setHeight(y);
	}

	public double getArea() {
		return this.width * this.getHeight();
	}

	public double getPerimeter() {
		return (this.width + this.getHeight()) * 2;
	}


	public double getHeight() { // Metodo Getter
		return height;
	}

	public void setHeight(double height) { // Metodo Setter
		if (height <= 0)
			System.out.println("L'altezza deve essere sempre maggiore di zero!");
		else
			this.height = height;
	}

	public double getWidth() { // Metodo Getter
		return width;
	}

	public void setWidth(double width) { // Metodo Setter
		if (width <= 0)
			System.out.println("La larghezza deve essere sempre maggiore di zero!");
		else
			this.width = width;

	}

	@Override
	public String toString() {

		return "Rectangle [width=" + width + ", height=" + height + ", perimeter=" + this.getPerimeter() + "]";
	}

}

package PCK_EjemploWebHerenciaMultiple;

public class Circle implements Shape {

	private int x;
	private int y;
	private int wide;
	private int high;
		
	
	/**
	 * @param x
	 * @param y
	 * @param wide
	 * @param high
	 */
	public Circle(int x, int y, int wide, int high) {
		
		this.x = x;
		this.y = y;
		this.wide = wide;
		this.high = high;
	}


	@Override
	public void area() {
		// calculo area
		System.out.println("calculo area circulo");
	}

}

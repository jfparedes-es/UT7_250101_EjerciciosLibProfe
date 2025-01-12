package PCK_EjemploWebHerenciaMultiple;

public class Poly implements Shape{

	int[] x;
	int[] y;
	
	
	
	/**
	 * @param x
	 * @param y
	 */
	public Poly(int[] x, int[] y) {
		this.x = x;
		this.y = y;
	}



	@Override
	public void area() {

		// calculo area
		System.out.println("calculo area poligono");
	}

}

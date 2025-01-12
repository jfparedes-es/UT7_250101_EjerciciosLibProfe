package PCK_Agregacion;

public class Ordenador {

	private Teclado teclado;
	
	public Ordenador (Teclado teclado) { this.teclado = teclado; }
	
	public Teclado getTeclado () {return teclado; }
	
	public void setTeclado (Teclado teclado) { this.teclado = teclado; }
}

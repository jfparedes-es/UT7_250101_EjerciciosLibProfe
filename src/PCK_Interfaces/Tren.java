package PCK_Interfaces;

public class Tren implements Operable {
	
	private String id;
	
	private int velocidad;
	
	public Tren (String id, int velocidad) {
		this.id = id;
		this.velocidad = velocidad;
	}
	
	public String getIdVehiculo () {
		return ("Tren con ID: " + id);
	}
	
	public void acelerar () { velocidad++; }
	
	public void frenar () { velocidad--; }
	
	public int getVelocidad () { return velocidad; }
	
	public void resumirMetodosTren () {
		System.out.println ("Resumen Metodos Tren: ");
	}

}

package PCK_Interfaces;

public interface Operable {

	public String getIdVehiculo ();
	public void acelerar ();
	public void frenar ();
	
	default public void imprimirUbicacionGeografica() {
		System.out.println("Implementacion por defecto en interface");
	}
	public static void resumirMetodosInterface() {
		System.out.println("getIdVehiculo, acelerar, frena"
				+ ", imrpimirUbicacionGeorgrafica, resumirMetodosInterface");
	}

}

package PCK_HerenciaMultiple;

public class SubClaseHerencia extends SuperClase implements Interface {

	public void metodoInterface () {
		System.out.println("Metodo Interface");
	}
	
	@Override
	public void metodoSuperclase () {
		System.out.println ("Metodo Clase Hija");
	}
}

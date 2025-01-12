package PCK_Composicion;

public class Casa {
	private Habitacion habitacion;

	/**
	 * @param habitacion
	 */
	public Casa() {
		
		this.habitacion = new Habitacion(30);
	}

	public Habitacion getHabitacion() {
		return habitacion;
	}
	
	
	

}

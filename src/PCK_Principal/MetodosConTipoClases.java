package PCK_Principal;

import PCK_Composicion.*;
import PCK_Abstracto.*;
import PCK_Agregacion.*;
//import PCK_Agregacion.Ordenador;
import PCK_Agregacion.Teclado;
import PCK_Interfaces.*;
import PCK_HerenciaMultiple.*;
import PCK_EjemploWebHerenciaMultiple.*;


public class MetodosConTipoClases {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// Bloque Agregacion
		Teclado t1 = new Teclado ("Logitech");
		Teclado t2 = new Teclado ("Logitech");
		
		Ordenador ord1 = new Ordenador(t1);
		Ordenador ord2 = new Ordenador(t2);
		
		System.out.println("El ordenador ord1 tiene un teclado modelo " + ord1.getTeclado().getModelo());
		
		System.out.println("El ordenador ord2 tiene un teclado modelo " + ord2.getTeclado().getModelo());
		
		System.out.println("¿Comparten teclado ord1 y ord2 ? " + (ord1.getTeclado() == ord2.getTeclado()));
		
		// FIN Bloque Agregacion
		
		// Bloque Composicion
		
		Casa casa = new Casa ();
		
		System.out.println("La casa se compone de un salón de " + casa.getHabitacion().getMetrosCuadrados());
	
		// FIN Bloque Composicion
		
		
		// Bloque Interface
		Tren tren = new Tren ("013", 0);
		
		System.out.println (tren.getIdVehiculo());
		
		System.out.println ("Velocidad: " + tren.getVelocidad());
		
		for(int i= 0; i < 20; i++) {
			tren.acelerar();
		}
		System.out.println ("Velocidad: " + tren.getVelocidad());
		tren.imprimirUbicacionGeografica();
		
		tren.resumirMetodosTren();
		
		// FIN Bloque Interface
		
		// Bloque Abstracto
		
		// Forma 1
		new Subclase().metodoAbstracto();
		
		// Forma 2
		Subclase subclase = new Subclase();
		subclase.metodoAbstracto();
		
		// FIN Bloque Abstracto
		
		// Bloque HerenciaMultiple
		SubClaseHerencia obj = new SubClaseHerencia();
		obj.metodoInterface();
		obj.metodoSuperclase();
		
		// FIN Bloque HerenciaMultiple
		
		// Bloque EjemploWebHerenciaMultipleWeb
		
		new ShowShapes();
		
		
		// FIN Bloque EjemploWebHerenciaMultipleWeb
		
	}

}

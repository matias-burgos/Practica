package Paquete;

public class Profesor {
	String nombre;
	int edad;
	int aniosConsolidados;
	
	public Profesor()
	{
		nombre="";
		edad=0;
		aniosConsolidados=0;
	}
	
	public Profesor(String nombre, int edad, int aniosConsolidados)
	{
		this.nombre=nombre;
		this.edad=edad;
		this.aniosConsolidados=aniosConsolidados;
	}
}

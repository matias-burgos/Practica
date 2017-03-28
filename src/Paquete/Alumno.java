package Paquete;

public class Alumno extends Persona{
	String legajo;
	
	
	public Alumno()
	{
		super();
		legajo="";
		
	}
	
	public Alumno(String Nombre, String Apellido, String DNI, Fecha Fecha, String legajo)
	{
		super(Nombre, Apellido, DNI, Fecha);
		this.legajo=legajo;
		
	}
	
	public Alumno(Alumno a)
	{
		super(a);
		legajo=a.legajo;
	}
	//Metodos.
	
	public void setLegajo(String legajo)
	{
		this.legajo=legajo;
	}
	public String getLegajo()
	{
		return legajo;
	}
	
}

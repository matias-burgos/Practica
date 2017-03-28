package Paquete;



public class Persona {
	String nombre;
	String apellido;
	Fecha nacimiento;
	String DNI;
	
	
	
	public Persona()
	{
		nombre="";
		apellido="";
		nacimiento=new Fecha();
		DNI="";
	}
	
	//Asigna valores pasados desde el main a la persona.
	public Persona(String nombre, String apellido, String DNI, Fecha Nacimiento) 
	{
		this.nombre=nombre;
		this.apellido=apellido;
		this.DNI=DNI;
		this.nacimiento=Nacimiento;
	}
	
	//Copia los valores de una persona a otra.
	public Persona(Persona P)
	{
		apellido=P.apellido;
		nombre=P.nombre;
		DNI=P.DNI;
		nacimiento=new Fecha(P.nacimiento);
	}
	
	//Metodos.
	public void setNombre(String nombre)
	{
		this.nombre=nombre;
	}
	public String getNombre()
	{
		return nombre;
	}
	
	public void setApellido(String apellido)
	{
		this.apellido=apellido;
	}
	public String getapellido()
	{
		return apellido;
	}
	
	public void setDNI(String DNI)
	{
		this.DNI=DNI;
	}
	public String getDNI()
	{
		return DNI;
	}
	
	public void setNacimiento(Fecha nacimiento)
	{
		this.nacimiento=nacimiento;
	}
	public Fecha getNacimiento()
	{
		return nacimiento;
	}
}

package Paquete;

public class Fecha {
	int dia;
	int mes;
	int anio;
	
	public Fecha()
	{
		dia=0;
		mes=0;
		anio=0;
	}
	
	public Fecha(int NDia, int NMes, int NAnio)//Asigna valores a una variable Fecha.
	{
		this.dia=NDia;
		this.mes=NMes;
		this.anio=NAnio;
	}
	
	
	public Fecha(Fecha nuevo)//Copia los datos de una variable fecha a otra.
	{
		dia=nuevo.dia;
		mes=nuevo.mes;
		anio=nuevo.anio;
	}
	
	//Metodos.
	
	public void setDia(int dia)//Ingresa valor pasado por parametros con el metodo set.
	{
		this.dia=dia;
	}
	public int getDia()//Retorna valor por medio del metodo get.
	{
		return dia;
	}
	
	public void setMes(int mes)
	{
		this.mes=mes;
	}
	public int getMes()
	{
		return mes;
	}
	
	public void setAnio(int anio)
	{
		this.anio=anio;
	}
	public int getAnio()
	{
		return anio;
	}
	
}

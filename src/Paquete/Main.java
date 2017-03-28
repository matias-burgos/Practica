package Paquete;

import java.util.Scanner;
import java.util.ArrayList;
public class Main 
{

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
	
		int dia1=12;
		int mes1=5;
		int anio1=1998;
		Fecha nacimiento1=new Fecha(dia1, mes1, anio1);
		Persona p1=new Persona("Elsa", "Pato", "1234562", nacimiento1);
		System.out.println("Nombre: " +p1.nombre);
		System.out.println("Apellido: "+p1.apellido);
		System.out.println("DNI: "+p1.DNI);
		System.out.println("Fecha de nacimiento: "+p1.nacimiento.dia+"/"+p1.nacimiento.mes+"/"+p1.nacimiento.anio);
		
		
		
		
		Alumno p2=new Alumno();
		//Ingreso de valores por teclado usando Set.
		System.out.println("Ingresar nombre: ");
		String nombre=sc.nextLine();
		p2.setNombre(nombre);
		System.out.println("Ingresar apellido: ");
		String apellido=sc.nextLine();
		p2.setApellido(apellido);
		System.out.println("Ingresar DNI: ");
		String DNI=sc.nextLine();
		p2.setDNI(DNI);
		System.out.println("Ingresar fecha de nacimiento: ");
		System.out.println("Dia:  ");
		int dia=sc.nextInt();
		System.out.println("Mes:  ");
		int mes=sc.nextInt();
		System.out.println("Anio:  ");
		int anio=sc.nextInt();	
		Fecha nacimiento=new Fecha(dia, mes, anio);
		p2.nacimiento=nacimiento;
		System.out.println("Ingrese legajo: ");
		sc.nextLine();
		String legajo=sc.nextLine();
		p2.setLegajo(legajo);
		
		//Muestreo usando Get.
		System.out.println("Nombre del Alumno: "+p2.getNombre());
		System.out.println("Apellido del Alumno: "+p2.getapellido());
		System.out.println("DNI del Alumno: "+p2.getDNI());
		System.out.println("Nacimiento del Alumno: "+p2.nacimiento.getDia()+"/"+p2.nacimiento.getMes()+"/"+p2.nacimiento.getAnio());
		System.out.println("Legajo del Alumno: "+p2.getLegajo());
		//Muestreo
		
		
		System.out.println("Nombre del alumno: "+ p2.nombre);
		System.out.println("Apellido: "+p2.apellido);
		System.out.println("DNI: "+p2.DNI);
		System.out.println("Legajo: "+p2.legajo);;
		System.out.println("Fecha de naciomiento: "+p2.nacimiento.dia+"/"+p2.nacimiento.mes+"/"+p2.nacimiento.anio);
		
		
		
		//Listas.
		
		ArrayList<Persona>ListaPersona=new ArrayList<>();
		
		ListaPersona.add(p1);
		ListaPersona.add(p2);
		int i=1;
		for (Persona aux: ListaPersona)
		{
	
			System.out.println("Apellido de la persona "+i+":" +aux.getapellido()+"\n");
			i++;
		}
		
		
		int cantVariables=ListaPersona.size();
		
		System.out.println("Cantidad de elementos en la lista: "+cantVariables);
		for( i=0; i<cantVariables; i++)
		{
			Persona auxiliar=ListaPersona.get(i);
			if(auxiliar.getNombre().equals("a"))
			{
				ListaPersona.remove(i);
			}
		}	
		cantVariables=ListaPersona.size();
		System.out.println("Cantidad de elementos en la lista: "+cantVariables);
		
		for (Persona aux: ListaPersona)
		{
	
			System.out.println("Apellido de la persona "+i+":" +aux.getapellido()+"\n");
			i++;
		}
		
		 
		
		
	}

}

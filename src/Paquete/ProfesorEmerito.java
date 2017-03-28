package Paquete;

public class ProfesorEmerito extends Profesor {
		private int aniosEmerito;
		
		public ProfesorEmerito()
		{
			super();
			aniosEmerito=0;
			
		}
		
		public ProfesorEmerito(String nombre, int edad, int aniosConsolidados, int aniosEmerito)
		{
			super(nombre, edad, aniosConsolidados);
			this.aniosEmerito=aniosEmerito;
		}
		
		
		
		//Metodo.
		/*
		public double obtenerSalarioBase()
		{
			
		}*/
		
}

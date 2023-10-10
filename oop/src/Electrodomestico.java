

import java.util.Scanner;

public class Electrodomestico {

	Double precioBase;
	String color;
	char consumoEnergetico;
	int peso;
	
	private static final Double PRECIOBASE_POR_DEFECTO = 100.0; 
	private static final String COLOR_POR_DEFECTO = "blanco"; 
	private static final int PESO_POR_DEFECTO = 5; 
	private static final int CONSUMOENERGETICO_POR_DEFECTO = 'F'; 

	
	
	public Electrodomestico() {
		this.precioBase =  PRECIOBASE_POR_DEFECTO;
		this.color =  COLOR_POR_DEFECTO ;
		this.consumoEnergetico = CONSUMOENERGETICO_POR_DEFECTO;
		this.peso = PESO_POR_DEFECTO;
	}
	
	public Electrodomestico(Double precioBase, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = COLOR_POR_DEFECTO;
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	public Electrodomestico(Double precioBase, String color, char consumoEnergetico, int peso) {
		this.precioBase = precioBase;
		this.color = opcionesDeColor(color);
		this.consumoEnergetico = consumoEnergetico;
		this.peso = peso;
	}
	
	
	 public Double getPrecioBase() {
		return precioBase;
	}

	public void setPrecioBase(Double precioBase) {
		this.precioBase = precioBase;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public char getConsumoEnergetico() {
		return consumoEnergetico;
	}

	public void setConsumoEnergetico(char consumoEnergetico) {
		this.consumoEnergetico = consumoEnergetico;
	}

	public int getPeso() {
		return peso;
	}

	public void setPeso(int peso) {
		this.peso = peso;
	}

	private String opcionesDeColor(String color) {
	        String[] coloresValidos = {"blanco", "negro", "rojo", "azul", "gris"};

	        for (String clr : coloresValidos) {
	            if (color.equalsIgnoreCase(clr)) {
	                return color.toLowerCase(); 
	            }
	        }
	        return COLOR_POR_DEFECTO;
	    }
	
	private char opcionesConsumoEnergitico(char consumoEnergetico) {
		char[] opciones = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		 for (char opcion : opciones) {
	            if (consumoEnergetico == opcion) {
	                return consumoEnergetico; 
	            }
	        }
	        return CONSUMOENERGETICO_POR_DEFECTO;
	}
	
	
	  @Override
	public String toString() {
		return "Electrodomestico [precioBase=" + precioBase + ", color=" + color + ", consumoEnergetico="
				+ consumoEnergetico + ", peso=" + peso + "]";
	}

	public static void main(String[] args) {
		  Electrodomestico electrodomestico = new Electrodomestico();
		  Scanner scanner = new Scanner(System.in);
		  
		  System.out.print("Escribir un numero de A a F para el valor del consumo energetico");
		  String input = scanner.next();
		  char opcion = input.charAt(0);
		  

		  char consumoEnergetico = electrodomestico.opcionesConsumoEnergitico(opcion);
	      System.out.println("Consumo energético: " + consumoEnergetico);	
	     
	      
	      System.out.print("Eligir un color, (blanco, negro, rojo, azul, y gris) el color por defecto si no has eligido nada es " + COLOR_POR_DEFECTO);
		  String color = scanner.next();
		  
		  String colorElectrodomestuco = electrodomestico.opcionesDeColor(color);

	      System.out.println("El color ahora seria " + colorElectrodomestuco);	
	      
	      scanner.close();
	  }
}

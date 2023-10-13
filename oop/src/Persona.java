

public class Persona {
	private String nombre;
	private int edad;
	private String dni;
	private double peso;
	private char sexo;
	private double altura;
	
	private static final char SEXO_POR_DEFECTO = 'H'; 
	
	  public Persona() {
	        this.nombre = "";
	        this.edad = 0;
	        this.sexo = SEXO_POR_DEFECTO;
	        this.dni = "";
	        this.peso = 0.0;
	        this.altura = 0.0;
	    }
	
	  public Persona(String nombre, int edad, char sexo) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = sexo;
	        this.dni = "";
	        this.peso = 0.0;
	        this.altura = 0.0;
	    }

	    public Persona(String nombre, int edad, char sexo, String dni, double peso, double altura) {
	        this.nombre = nombre;
	        this.edad = edad;
	        this.sexo = sexo;
	        this.dni = dni;
	        this.peso = peso;
	        this.altura = altura;
	    }

		public String getNombre() {
			return nombre;
		}

		public void setNombre(String nombre) {
			this.nombre = nombre;
		}

		public int getEdad() {
			return edad;
		}

		public void setEdad(int edad) {
			this.edad = edad;
		}

		public String getDni() {
			return dni;
		}

		public void setDni(String dni) {
			this.dni = dni;
		}

		public double getPeso() {
			return peso;
		}

		public void setPeso(double peso) {
			this.peso = peso;
		}

		public char getSexo() {
			return sexo;
		}

		public void setSexo(char sexo) {
			this.sexo = sexo;
		}

		public double getAltura() {
			return altura;
		}

		public void setAltura(double altura) {
			this.altura = altura;
		}
		
		
		
		@Override
		public String toString() {
			return "Persona [nombre=" + nombre + ", edad=" + edad + ", dni=" + dni + ", peso=" + peso + ", sexo=" + sexo
					+ ", altura=" + altura + "]";
		}

		public static void main(String[] args) {
			Persona persona = new Persona("Carl", 45, 'F', "H7668889F", 67.0, 167.0 );
			
			System.out.println(persona);
		}
		
		
	   
}

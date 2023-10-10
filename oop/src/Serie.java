

public class Serie {

	String titulo;
	int numeroDeTemporada;
	boolean entregado;
	String genero;
	String creador;
	
	private static final int NUMERO_DE_TEMPORADA_POR_DEFECTO = 3; 
	private static final boolean ENTREGADO_POR_DEFECTO = false; 
	
	
	public Serie() {
		this.titulo = "";
		this.numeroDeTemporada =  NUMERO_DE_TEMPORADA_POR_DEFECTO;
		this.entregado = ENTREGADO_POR_DEFECTO;
		this.genero = "";
		this.creador = "";
	}
	
	public Serie(String titulo, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporada =  NUMERO_DE_TEMPORADA_POR_DEFECTO;
		this.entregado = ENTREGADO_POR_DEFECTO;
		this.genero = "";
		this.creador = creador;
	}
	
	public Serie(String titulo, int numeroDeTemporada, boolean entregado, String genero, String creador) {
		this.titulo = titulo;
		this.numeroDeTemporada = numeroDeTemporada;
		this.entregado = entregado;
		this.genero = genero;
		this.creador = creador;
	}
	
	
	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public int getNumeroDeTemporada() {
		return numeroDeTemporada;
	}

	public void setNumeroDeTemporada(int numeroDeTemporada) {
		this.numeroDeTemporada = numeroDeTemporada;
	}

	public boolean isEntregado() {
		return entregado;
	}

	public void setEntregado(boolean entregado) {
		this.entregado = entregado;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getCreador() {
		return creador;
	}

	public void setCreador(String creador) {
		this.creador = creador;
	}

	
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numeroDeTemporada=" + numeroDeTemporada + ", entregado=" + entregado
				+ ", genero=" + genero + ", creador=" + creador + "]";
	}
	
	
	public static void main(String[] args) {
		Serie serie = new Serie("Titanic", 45, true, "drama", "Thomas" );
		
		System.out.println(serie);
	}

}

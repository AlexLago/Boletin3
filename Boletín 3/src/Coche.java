
class Coche extends Vehiculo {
	private int numeroPlazas;
	
	public Coche(String Matricula, String Tipo, int velocidadMaxima, int numeroPlazas ) {
		this.Matricula = Matricula;
		this.Tipo = Tipo;
		this.velocidadMaxima = velocidadMaxima;
		this.numeroPlazas = numeroPlazas;
	}
}

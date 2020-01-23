
class Camion extends Vehiculo {
	private int altura;
	private Remolque Remolque;
	public Camion(String Matricula, String Tipo, int velocidadMaxima, Remolque Remolque) {
		this.Matricula = Matricula;
		this.Tipo = Tipo;
		this.velocidadMaxima = velocidadMaxima;
		this.Remolque = Remolque;
	}
}

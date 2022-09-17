package Poligonos;

public abstract class Poligono {
	
	protected int numeroLados;
	
	
public Poligono(int numeroLados) {
	this.numeroLados=numeroLados;
}



public int getNumeroLados() {
	return numeroLados;
}

@Override
public  String toString() {
	return "Cantidad de lados:" + numeroLados;
}

public abstract double area(); 
	

}

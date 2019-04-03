package vehiculos;

public class Coche extends Vehiculo {

	//constructor
	public Coche(int kilometrosRecorridos) {
		super(kilometrosRecorridos);
	}

	void quemaRueda() {
		System.out.println("*QUEMANDO RUEDA*");
	}
}

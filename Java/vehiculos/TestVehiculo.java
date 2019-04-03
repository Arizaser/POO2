package vehiculos;

import java.util.Scanner;

public class TestVehiculo {

	public static void main(String[] args) {
		Coche miCoche = new Coche(0);
		Bicicleta miBike = new Bicicleta(0);
		Scanner sc = new Scanner(System.in);
		int a;
		int km;
		
		do {
			mostrarMenu();
			a=sc.nextInt();
			switch (a) {
			case 1:
				System.out.println("cuantos km quieres que recorra la bici?");
				km=sc.nextInt();
				System.out.println();
				miBike.anda(km);
				break;

			case 2:
				miBike.caballito();
				break;
				
			case 3:
				System.out.println("cuantos km quieres que recorra el coche?");
				km=sc.nextInt();
				System.out.println();
				miCoche.anda(km);
				break;

			case 4:
				miCoche.quemaRueda();
				break;

			case 5:
				System.out.println("Kilometraje de la bici: "+ miBike.getKilometrosRecorridos()+"\n");
				break;

			case 6:
				System.out.println("Kilometraje del coche: "+ miCoche.getKilometrosRecorridos()+"\n");
				break;

			case 7:
				System.out.println("Kilometraje del coche: "+ Vehiculo.getKilometrosTotales()+"\n");
				break;

			case 8:
				System.out.println("Adios");
				break;
			default:
				System.out.println("Introduce una opción válida.");				
				break;

			}
		} while (a!=8);
		


	
	}



	static void mostrarMenu() {
		System.out.println("1. Anda con la bicicleta");
		System.out.println("2. Haz el caballito con la bicicleta");
		System.out.println("3. Anda con el coche");
		System.out.println("4. Quema rueda con el coche");
		System.out.println("5. Ver kilometraje de la bicicleta");
		System.out.println("6. Ver kilometraje del coche");
		System.out.println("7. Ver kilometraje total");
		System.out.println("8. Salir");
	}
}
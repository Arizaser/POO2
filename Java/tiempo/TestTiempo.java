package tiempo;

public class TestTiempo {

	public static void main(String[] args) {
		Tiempo t = new Tiempo(1, 30, 0);
		System.out.println(t);
		
		t.restar(0, 35, 0);
		System.out.println(t);
		
	}
	

}

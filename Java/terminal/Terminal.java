package terminal;

/**
 * Implementa la clase Terminal. Un terminal tiene asociado un n�mero. Los
 * terminales se pueden llamar unos a otros y el tiempo de conversaci�n corre
 * para ambos. A continuaci�n se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla.
 * 
 * 
 * @author ariza
 *
 */

public class Terminal {
	int seg;
	String tlfno;

	// Constructor
	public Terminal(String a) {
		tlfno = a;
	}
	
	void llama(Terminal x, int a) {
		seg+=a;
		x.seg+=a;
	}

	// toString
	public String toString() {
		return "N�" +  tlfno +"- "+ seg +"s de conversaci�n";
	}
}

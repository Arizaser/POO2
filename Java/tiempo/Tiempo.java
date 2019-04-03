package tiempo;

/**
 * Crea la clase Tiempo con los métodos suma y resta. Los objetos de la clase
 * Tiempo son intervalos de tiempo y se crean de la forma Tiempo t = new
 * Tiempo(1, 20, 30) donde los parámetros que se le pasan al constructor son las
 * horas, los minutos y los segundos respectivamente. Crea el método toString
 * para ver los intervalos de tiempo de la forma 10h 35m 5s. Si se suman por
 * ejemplo 30m 40s y 35m 20s el resultado debería ser 1h 6m 0s. Realiza un
 * programa de prueba para comprobar que la clase funciona bien.
 * 
 * @author ariza
 *
 */

public class Tiempo {
	private int hor;
	private int min;
	private int seg;
	
	// Constructor
	public Tiempo(int hor, int min, int seg) {
		super();
		this.hor = hor;
		this.min = min;
		this.seg = seg;
	}

	// toString
	public String toString() {
		return hor + "h " + min + "m " + seg + "s";
	}

	// getters y setters
	public int getHor() {
		return hor;
	}

	public void setHor(int hor) {
		this.hor = hor;
	}

	public int getMin() {
		return min;
	}

	public void setMin(int min) {
		this.min = min;
	}

	public int getSeg() {
		return seg;
	}

	public void setSeg(int seg) {
		this.seg = seg;
	}
	
	//Sumar y Restar
	int transformarSeg() {
		this.seg=(this.hor*3600)+(this.min*60)+this.seg;
		return this.seg;
	}
	
	void transformarHMS() {
		this.hor = (this.seg / 3600);
  	this.min = ((this.seg-this.hor*3600)/60);
  	this.seg = this.seg-(this.hor*3600+this.min*60);
	}
	
	
	void sumar(int x, int y, int z) {
		this.hor+=x;
		this.min+=y;
		this.seg+=z;
		
		this.transformarSeg();
		this.transformarHMS();
	}
	
	void restar(int x, int y, int z) {
		this.hor-=x;
		this.min-=y;
		this.seg-=z;
		
		this.transformarSeg();
		this.transformarHMS();
	}

}

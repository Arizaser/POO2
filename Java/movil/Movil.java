package terminal;

import java.text.DecimalFormat;

/**
 * Implementa la clase Movil como subclase de Terminal (la clase del ejercicio
 * anterior que ya no hace falta modificar). Cada m�vil lleva asociada una
 * tarifa que puede ser �rata�, �mono� o �bisonte�. El coste por minuto es de 6,
 * 12 y 30 c�ntimos respectivamente. Se tarifican los segundos exactos.
 * Obviamente, cuando un m�vil llama a otro, se le cobra al que llama, no al que
 * recibe la llamada. A continuaci�n se proporciona el contenido del main y el
 * resultado que debe aparecer por pantalla. Para que el total tarificado
 * aparezca con dos decimales, puedes utilizar DecimalFormat.
 *
 * @author ariza
 *
 */

public class Movil extends Terminal{
	private String tarifa;
	private double tarificado;

	public Movil(String telefono, String tarifa) {
		super(telefono);
		this.tarifa = tarifa;
		this.tarificado = 0;
	}

	public String getTarifa() {
		return tarifa;
	}

	public void setTarifa(String tarifa) {
		this.tarifa = tarifa;
	}

	public double getTarificado() {
		return tarificado;
	}

	public void setTarificado(double tarificado) {
		this.tarificado = tarificado;
	}

	@Override
	void llama(Terminal t, int s) {
		super.llama(t, s);
		double min = (double) s / 60;

		if (this.tarifa == "rata") {
			this.tarificado += min * 0.06;
		}

		if (this.tarifa == "mono") {
			this.tarificado += min * 0.12;
		}

		if (this.tarifa == "bisonte") {
			this.tarificado += min * 0.30;
		}
	}

	@Override
	public String toString() {
		DecimalFormat formato = new DecimalFormat("0.00");
		return super.toString() + " - tarificados " + formato.format(getTarificado()) + " euros";
	}

}

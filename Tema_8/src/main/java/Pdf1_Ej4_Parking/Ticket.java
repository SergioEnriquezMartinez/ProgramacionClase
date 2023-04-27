package Pdf1_Ej4_Parking;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Objects;

public class Ticket {
	
	private String matricula;
	private LocalDateTime horaEntrada;
	private LocalDateTime horaActual;
	private boolean pagado;
	private final float TARIFA_DIA = 17;
	private final float TARIFA_HORA = 1.7f;
	private final float TARIFA_MIN = 0.03f;
	
	
	public Ticket(String matricula) {
		this.matricula = matricula;
		this.horaEntrada = LocalDateTime.now();
		this.pagado = false;
	}
	
	
	/*Supongamos un precio de 0.10€ por minuto*/
	public float calcularPrecio(String matricula) throws TicketException {
		horaActual = LocalDateTime.now();
		Duration duracion = Duration.between(horaEntrada, horaActual);

		if (duracion.isNegative()) {
			throw new TicketException("La hora de entrada es posterior a la hora actual");
		}

		long dias = duracion.toDays();
		long horas = duracion.toHours();
		long minutos = duracion.toMinutes();

		float costo = (dias * TARIFA_DIA) + (horas * TARIFA_HORA) + (minutos * TARIFA_MIN);
		
		return costo;
	}



	public String getMatricula() {
		return matricula;
	}
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	public LocalDateTime getHora() {
		return horaEntrada;
	}


	public boolean isPagado() {
		return pagado;
	}
	public void setPagado(boolean pagado) {
		this.pagado = pagado;
	}


	@Override
	public int hashCode() {
		return Objects.hash(horaEntrada, matricula, pagado);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ticket other = (Ticket) obj;
		return Objects.equals(horaEntrada, other.horaEntrada) && Objects.equals(matricula, other.matricula) && pagado == other.pagado;
	}


	@Override
	public String toString() {
		return "Ticket [matricula=" + matricula + ", hora=" + horaEntrada + ", pagado=" + pagado + "]";
	}
	
	
	
}

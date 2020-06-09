package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;
import java.util.GregorianCalendar;
/**
 * Entity implementation class for Entity: Ticket
 *
 */
@Entity

public class Ticket implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int numero;
	@Temporal(TemporalType.DATE)
	private GregorianCalendar fechaIngreso;
	@Temporal(TemporalType.DATE)
	private GregorianCalendar fechaSalida;
	@OneToOne
	@JoinColumn
	private Vehiculo vehiculo;
	
	
	public Ticket() {
		super();
	}


	public Ticket(GregorianCalendar fechaIngreso, GregorianCalendar fechaSalida, Vehiculo vehiculo) {
		super();
		this.fechaIngreso = fechaIngreso;
		this.fechaSalida = fechaSalida;
		this.vehiculo = vehiculo;
	}


	public int getNumero() {
		return numero;
	}


	public void setNumero(int numero) {
		this.numero = numero;
	}


	public GregorianCalendar getFechaIngreso() {
		return fechaIngreso;
	}


	public void setFechaIngreso(GregorianCalendar fechaIngreso) {
		this.fechaIngreso = fechaIngreso;
	}


	public GregorianCalendar getFechaSalida() {
		return fechaSalida;
	}


	public void setFechaSalida(GregorianCalendar fechaSalida) {
		this.fechaSalida = fechaSalida;
	}

	public Vehiculo getVehiculo() {
		return vehiculo;
	}


	public void setVehiculo(Vehiculo vehiculo) {
		this.vehiculo = vehiculo;
	}
   
}

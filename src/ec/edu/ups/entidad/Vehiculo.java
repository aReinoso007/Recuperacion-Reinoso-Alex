package ec.edu.ups.entidad;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Vehiculo
 *
 */
@Entity

public class Vehiculo implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private String placa;
	private String marca;
	private String modelo;
	@OneToOne(cascade = CascadeType.PERSIST, mappedBy = "vehiculo")
	private Ticket ticket;
	@ManyToOne
	@JoinColumn
	private Cliente cliente;

	public Vehiculo() {
		super();
	}

	public Vehiculo(String placa, Cliente cliente, String marca, String modelo) {
		super();
		this.placa = placa;
		this.cliente = cliente;
		this.marca = marca;
		this.modelo = modelo;
	}

	public Vehiculo(String placa, String marca, String modelo, Ticket ticket, Cliente cliente) {
		super();
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.ticket = ticket;
		this.cliente = cliente;
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public Ticket getTicket() {
		return ticket;
	}

	public void setTicket(Ticket ticket) {
		this.ticket = ticket;
	}

}

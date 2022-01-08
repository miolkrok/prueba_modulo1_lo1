package ec.edu.uce.modelos;

import java.math.BigDecimal;

public class Vehiculos {
	private String marca;
	private String paisOrigen;
	private String placa;
	private String tipo;
	private String propietario;
	private BigDecimal precio;
	private String valorMatricula;
	
	
	//Metodos SET Y GET
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getPaisOrigen() {
		return paisOrigen;
	}
	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	public String getPropietario() {
		return propietario;
	}
	public void setPropietario(String propietario) {
		this.propietario = propietario;
	}

	public BigDecimal getPrecio() {
		return precio;
	}
	public void setPrecio(BigDecimal precio) {
		this.precio = precio;
	}
	public String getValorMatricula() {
		return valorMatricula;
	}
	public void setValorMatricula(String valorMatricula) {
		this.valorMatricula = valorMatricula;
	}
	@Override
	public String toString() {
		return "Vehiculos [marca=" + marca + ", paisOrigen=" + paisOrigen + ", placa=" + placa + ", tipo=" + tipo
				+ ", propietario=" + propietario + ", precio=" + precio + ", valorMatricula=" + valorMatricula + "]";
	}
	

	

}

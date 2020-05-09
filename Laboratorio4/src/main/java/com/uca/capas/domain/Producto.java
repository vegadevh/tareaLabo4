package com.uca.capas.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Producto {

	@Size(message="El nombre no debe tener mas de 15 caracteres", max=15)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String nombre;
	
	@Size(message="El nombre no debe tener mas de 30 caracteres", max=30)
	@NotEmpty(message="Este campo no puede estar vacio")
	private String descripcion;
	
	@NotNull(message="Este campo no puede estar vacio")
	@Min(value=0, message="Precio no puede ser negativo")
	private Double precio;
	
	@NotEmpty(message="Este campo no puede estar vacio")
	@Pattern(regexp="^([0-2][0-9]|3[0-1])(\\/)(0[1-9]|1[0-2])\\2(\\d{4})$", message="El formato debe ser dia/mes/año")
	private String fechaVencimiento;
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	public String getFechaVencimiento() {
		return fechaVencimiento;
	}
	public void setFechaVencimiento(String fechaVencimiento) {
		this.fechaVencimiento = fechaVencimiento;
	}
	
	
}

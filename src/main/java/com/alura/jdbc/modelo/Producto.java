package com.alura.jdbc.modelo;

public class Producto {
	private Integer id;
	private String nombre ;
	private String descripcion;
	private Integer cantidad;
	private Integer categoriaId;

	public Producto(String nombre, String descripcion, Integer cantidad) {	
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.cantidad = cantidad;
	}
	
	public Producto(Integer id, String nombre,  String descripcion, Integer cantidad) {
		this.id = id;
		this.nombre = nombre ;  
		this.descripcion = descripcion;
		this.cantidad = cantidad;
		 
	}
	
	public Producto(Integer id, String nombre, Integer cantidad) {
		this.nombre = nombre;
		this.id = id;
		this.cantidad = cantidad;
	}

	public Integer getId() {
		return this.id;
	}
	public String getNombre() {
		return nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public Integer getCantidad() {
		return cantidad;
	}
	
	public void setId(Integer id) {
		this.id = id;
	}
	
	public int getCategoriaId() {

		return this.categoriaId;
	}
	
	public void setCategoriaId(Integer categoriaId) {
		this.categoriaId = categoriaId;
		
		
	}
	
	
	
	@Override
	public String toString() {
		return String.format(
				"{id: %s,nombre: %s,descripcion: %s,cantidad: %d}",
				this.id,
				this.nombre,
				this.descripcion,
				this.cantidad);
	}

	

	

	
	

}

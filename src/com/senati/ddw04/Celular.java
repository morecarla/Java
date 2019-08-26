package com.senati.ddw04;

public class Celular {
	//Atributo de las clases
	int id;
	String modelo;
	float precio;
	//constructor se emplea al momento de crear el objeto
	//este constructor recibe automaticamente los parametros de inicio
	public Celular(int id, String modelo, float precio) {
		super();
		this.id = id;
		this.modelo = modelo;
		this.precio = precio;
	}
	//constructor que no recibe parametros
	public Celular() {
		super();
	}
	//Getters y Setters
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Celular [id=" + id + ", modelo=" + modelo + ", precio=" + precio + "]";
	}
	
	
	
	
}

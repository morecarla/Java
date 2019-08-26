package com.senati.ddw04;

public class ImplementaCelular {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//crear un objeto celular1 de la clase celular
		//clase objeto = new clase(1,"huawey",900)
		//clase objeto = new clase();
		//objeto.id=1;
		//objeto.marca="huawey";
		//objeto.precio=900f;
		
		Celular Cel1 = new Celular ();
		Cel1.id=1;
		Cel1.modelo = "Venus 2019";
		Cel1.precio =900f;
		
		
		System.out.println("Datos registrados");
		System.out.println(Cel1.toString());
		//crea un objeto cel2 y agrega sus caracteristicas
		Celular Cel2 = new Celular(2,"Spire 2018",350);
		System.out.println("Datos registrados");
		System.out.println(Cel2.toString());

	}

}

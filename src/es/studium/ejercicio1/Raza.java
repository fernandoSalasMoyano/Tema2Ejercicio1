package es.studium.ejercicio1;

public class Raza
{
	//Atributos
	private String nombreRaza;
	
	//Constructor vacio
	public Raza()
	{
		nombreRaza = "";
	}

	//Constructor por parámetros
	public Raza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}

	//Metodos Get y Set
	public String getNombreRaza()
	{
		return nombreRaza;
	}

	public void setNombreRaza(String nombreRaza)
	{
		this.nombreRaza = nombreRaza;
	}
	
	
}

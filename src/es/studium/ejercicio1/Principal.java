package es.studium.ejercicio1;

public class Principal
{
	public static void main(String[] args)
	{
		//Creamos el objeto raza1 de la clase Raza
		Raza raza1 = new Raza("Mastín");
		//Creamos los objetos perro de la clase Perro
		Perro perro1 = new Perro(raza1, 0.50f, 4, "naranja");
		Perro perro2 = new Perro(raza1, 0.60f, 2, "rojo");
		Perro perro3 = new Perro(raza1, 0.70f, 1, "azul");
		Perro perro4 = new Perro(raza1, 0.20f, 2, "blanco");
		Perro perro5 = new Perro(raza1, 0.30f, 5, "negro");
		
		//Mostramos la raza, tamaño, edad y color de cada perro
		System.out.println("La raza del perro 1 es: " + perro1.getRaza().getNombreRaza() + ", su tamaño es: " + perro1.getTamano() + ", su edad es: " + perro1.getEdad() + " y es de color " + perro1.getColor());
		System.out.println("La raza del perro 2 es: " + perro2.getRaza().getNombreRaza() + ", su tamaño es: " + perro2.getTamano() + ", su edad es: " + perro2.getEdad() + " y es de color " + perro2.getColor());
		System.out.println("La raza del perro 3 es: " + perro3.getRaza().getNombreRaza() + ", su tamaño es: " + perro3.getTamano() + ", su edad es: " + perro3.getEdad() + " y es de color " + perro3.getColor());
		System.out.println("La raza del perro 4 es: " + perro4.getRaza().getNombreRaza() + ", su tamaño es: " + perro4.getTamano() + ", su edad es: " + perro4.getEdad() + " y es de color " + perro4.getColor());
		System.out.println("La raza del perro 5 es: " + perro5.getRaza().getNombreRaza() + ", su tamaño es: " + perro5.getTamano() + ", su edad es: " + perro5.getEdad() + " y es de color " + perro5.getColor());
	}
}

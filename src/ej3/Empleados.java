package ej3;

import java.util.Scanner;

public class Empleados {
	Scanner teclado = new Scanner(System.in);
	protected String nombreEmpresa;
	protected String nombre;
	protected int edad;
	protected int incrementoSueldo;
	protected int sueldo;

	public Empleados() {

		nombreEmpresa = "Eléctrica, SA";
		sueldo = 1000;
		setIncrementoSueldo();
		meterDatos();

	}

	public String getNombreEmpresa() {
		return nombreEmpresa;
	}

	public void setNombreEmpresa(String nombreEmpresa) {
		this.nombreEmpresa = nombreEmpresa;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}

	public int getIncrementoSueldo() {
		return incrementoSueldo;
	}

	public void setIncrementoSueldo() {
	System.out.println("introduce el porcentaje de subida: ");	
		
		incrementoSueldo = teclado.nextInt();
		incrementoSueldo = (sueldo * incrementoSueldo) / 100;
		sueldo += sueldo + incrementoSueldo;

	}


	public int getSueldo() {
		return sueldo;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
		setIncrementoSueldo();
	}

	public void meterDatos() {

		System.out.println("introduce nombre: ");
		nombre = teclado.next();

		System.out.println("introduce edad: ");
		edad = teclado.nextInt();
	}
	
	public String imprimeEmpleado() {
		return "nombre dde la empresa: " + nombreEmpresa + " nombre: " + nombre + " edad: " + edad + " sueldo: " + sueldo;
		
	}
	
public void modificarSueldo() {
	sueldo = teclado.nextInt();
	
}

}

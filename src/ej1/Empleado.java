package ej1;

public class Empleado {
	protected int sueldo;
	protected String nombre;
	
	
	
	public int getSueldo() {
		return sueldo;
	}
	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String imprimeEmpleado() {
		return "nombre: " + nombre + " sueldo: " + sueldo;
	}
	
	
}

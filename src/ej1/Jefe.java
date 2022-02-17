package ej1;

public class Jefe extends Empleado {
	private String titulo;
	private String nombreDepartamento;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getNombreDepartamento() {
		return nombreDepartamento;
	}

	public void setNombreDepartamento(String nombreDepartamento) {
		this.nombreDepartamento = nombreDepartamento;
	}

	public void setSueldo(int sueldo) {
		this.sueldo = sueldo;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	protected String imprimeJefe() {
		return super.imprimeEmpleado() + " titulo: " + titulo + " nombre departamento: " + nombreDepartamento;
	}
}

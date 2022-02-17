package ej3;

public class Jefe extends Empleados {

	private int plus;
	private String departamento;

	public Jefe() {
		plus = 250;
		setSueldo();
		System.out.println("introduce nombre del departamento");
		departamento = teclado.next();

	}

	public int getPlus() {
		return plus;

	}

	public void setPlus(int plus) {
		this.plus = plus;
		setSueldo();
	}

	public String getDepartamento() {
		return departamento;
	}

	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}

	public void setSueldo() {
		sueldo += plus;
	}

	public String imprimeJefe() {
		return super.imprimeEmpleado() + " nombre de departamento: " + departamento;

	}
	public void modificarPlus() {
		plus = teclado.nextInt();
	}

}

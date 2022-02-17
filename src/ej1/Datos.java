package ej1;

import java.util.Scanner;

public class Datos {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		int nPersonas;
		String nombre;
		int sueldo;
		String titulo;
		String departamento;

		System.out.println("indica el numero de empleados quieres hacer");

		nPersonas = teclado.nextInt();
		Empleado[] empleado = new Empleado[nPersonas];
		for (int i = 0; i < empleado.length; i++) {
			empleado[i] = new Empleado();

			System.out.println("introduce nombre: ");
			empleado[i].setNombre(nombre = teclado.next());

			System.out.println("introduce sueldo: ");
			empleado[i].setSueldo(sueldo = teclado.nextInt());

		}

		System.out.println("indica el numero de jefes quieres hacer");

		nPersonas = teclado.nextInt();
		Jefe[] jefe = new Jefe[nPersonas];

		for (int i = 0; i < jefe.length; i++) {
			jefe[i] = new Jefe();

			System.out.println("introduce nombre: ");
			jefe[i].setNombre(nombre = teclado.next());

			System.out.println("introduce sueldo: ");
			jefe[i].setSueldo(sueldo = teclado.nextInt());

			System.out.println("introduce titulo: ");
			jefe[i].setTitulo(titulo = teclado.next());

			System.out.println("introduce departamento: ");
			jefe[i].setNombreDepartamento(departamento = teclado.next());

		}
		System.out.println("Datos de los empleados: ");
		for (int i = 0; i < empleado.length; i++) {
			System.out.println(empleado[i].imprimeEmpleado());
		}
		
		System.out.println();
		for (int i = 0; i < jefe.length; i++) {
			System.out.println(jefe[i].imprimeJefe());
		}
	}
}

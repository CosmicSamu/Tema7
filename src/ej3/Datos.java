package ej3;

import java.util.Scanner;

public class Datos {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int cantidad, opcion;
		boolean exit = true;
		System.out.println("cuantos empleados quieres?");
		cantidad = teclado.nextInt();

		Empleados[] empleados = new Empleados[cantidad];

		for (int i = 0; i < empleados.length; i++) {
			empleados[i] = new Empleados();

		}

		System.out.println("cuantos jefes quieres?");
		cantidad = teclado.nextInt();

		Jefe[] jefes = new Jefe[cantidad];
		for (int i = 0; i < jefes.length; i++) {
			jefes[i] = new Jefe();
		}

		System.out.println("Datos de los empleados: ");
		for (int i = 0; i < empleados.length; i++) {
			System.out.println(empleados[i].imprimeEmpleado());
		}

		System.out.println();
		for (int i = 0; i < jefes.length; i++) {
			System.out.println(jefes[i].imprimeJefe());
		}

		System.out.println("DADO EL SIGUIENTE MENÚ:\r\n" + "1. Modificar el sueldo base de todos los empleados.\r\n"
				+ "2. Modificar el plus de todos los jefes.\r\n" + "3. Visualizar los datos de todos los empleados.\r\n"
				+ "4. Salir.\r\n" + "ELIJA UNA OPCIÓN:");

		while (exit) {
			switch (opcion = teclado.nextInt()) {
			case 1:

				int sueldo = teclado.nextInt();
				for (int i = 0; i < empleados.length; i++) {
					empleados[i].setSueldo(sueldo);
				}
				break;
			case 2:
				int plus = teclado.nextInt();
				for (int i = 0; i < jefes.length; i++) {
					jefes[i].setPlus(plus);
				}
				break;
			case 3:

				System.out.println("Datos de los empleados: ");
				for (int i = 0; i < empleados.length; i++) {
					System.out.println(empleados[i].imprimeEmpleado());
				}

				System.out.println();
				for (int i = 0; i < jefes.length; i++) {
					System.out.println(jefes[i].imprimeJefe());
				}
				break;
			case 4:
				exit = false;
				break;

			}
		}

	}

}

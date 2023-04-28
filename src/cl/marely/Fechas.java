/*
 * ESTE PROGRAMA REALIZA LA COMPARACIÓN DE LAS FECHAS DE NACIMIENTO DE DOS PERSONAS
 * DEBE ENTREGAR COMO RESULTADO LA PERSONA DE MAYOR EDAD
 */
package cl.marely;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Fechas {
	static boolean validado;

//	METODO VALIDACION DE FECHA
	private static String validaFormatoFecha(String fechaIngresada) {

		validado = false;
		String fechaValidada = "";

		SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yy");
		formatoFecha.setLenient(false);
		/*
		 * El método setLenient(boolean leniency) en la clase DateFormat se usa para
		 * especificar si la interpretación de la fecha y la hora de este objeto
		 * DateFormat debe ser indulgente o no.
		 */
		try {

			Date fecha = formatoFecha.parse(fechaIngresada);

			SimpleDateFormat nuevoFormatoFecha = new SimpleDateFormat("dd/MM/yyyy");
			fechaValidada = nuevoFormatoFecha.format(fecha);
			validado = true;

		} catch (ParseException e) {
			System.out.println("ERROR. DATO INCORRECTO!\n");

		}
		return fechaValidada;
	}

	// metodo principal
	public static void main(String[] args) {
		String fecha1, fecha2;
		Scanner sc = new Scanner(System.in);

		System.out.println("**** QUIEN ES EL MAYOR ? ****\n");

		// proceso de validación de fecha PERSONA 1
		do {
			System.out.println("PERSONA 1 \nIngrese fecha de nacimiento, 'dd/mm/yyyy'");
			fecha1 = validaFormatoFecha(sc.nextLine());
		} while (!validado);
		System.out.println(fecha1 + "  FECHA VALIDA");

		do {
			System.out.println("\nPERSONA 2 \nIngrese fecha de nacimiento, 'dd/mm/yyyy'");
			fecha2 = validaFormatoFecha(sc.nextLine());
		} while (!validado);
		System.out.println(fecha2 + "  FECHA VALIDA");

		sc.close();

		int diaFecha1 = Integer.parseInt(fecha1.substring(0, 2)); // dia primera fecha
		int diaFecha2 = Integer.parseInt(fecha2.substring(0, 2)); // dia segunda fecha
		int mesFecha1 = Integer.parseInt(fecha1.substring(3, 5)); // mes primera fecha
		int mesFecha2 = Integer.parseInt(fecha2.substring(3, 5)); // mes segunda fecha
		int agnoFecha1 = Integer.parseInt(fecha1.substring(6, 10)); // año primera fecha
		int agnoFecha2 = Integer.parseInt(fecha2.substring(6, 10)); // año segunda fecha

		// proceso de comparación de fechas

		int edadMayor = (agnoFecha1 < agnoFecha2) ? 1:
			(agnoFecha1 > agnoFecha2) ? 2:
				(mesFecha1 < mesFecha2) ? 1:
					(mesFecha1 > mesFecha2) ? 2:
						(diaFecha1 < diaFecha2) ? 1 :
							(diaFecha1 > diaFecha2) ? 2 : -1;
		System.out.println((edadMayor != -1) ? "\nRESULTADO\n*** LA PERSONA " + edadMayor + " ES MAYOR ***"
				: "TIENEN LA MISMA EDAD");
	}
}

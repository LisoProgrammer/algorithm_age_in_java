//algorithm_age_in_java



import java.io.*;

import javax.swing.JOptionPane;

//import javax.swing.plaf.ComboBoxUI;
public class edad {

	public static void main(String args[]) throws IOException {
		String name = JOptionPane.showInputDialog(null, "¿Cuál es su nombre?");
		Integer edad = Integer
				.parseInt(JOptionPane.showInputDialog(null, "¿Usted es mayor de edad? Por favor ingrese su edad."));
		String typeTimePerson = "error";

		if (edad != null) {

			if (edad <= 10) {
				typeTimePerson = "en edad de Niñez";
			}
			if (edad <= 18 && edad >= 11) {
				typeTimePerson = "en estado de Adolescencia";
			}
			if (edad <= 35 && edad >= 19) {
				typeTimePerson = "Adulta";
			}
			if (edad <= 60 && edad >= 36) {
				typeTimePerson = "Madura";
			}
			if (edad > 60) {
				typeTimePerson = "Anciana";
				System.out.println(typeTimePerson);
			}
			JOptionPane.showConfirmDialog(null,
					name + ", su edad es de " + edad + " año(s), por tanto usted es una persona " + typeTimePerson
							+ " aún.",
					"Según los datos ingresados...", JOptionPane.CLOSED_OPTION, JOptionPane.INFORMATION_MESSAGE);
		}

	}

}

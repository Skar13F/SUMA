/*Autor: Oscar Fuentes Alvarado
 *Fecha de creación: 14 de marzo de 2022
 *Fecha de actualización:
 *Descripción: clase para imprimir los rangos de los datos primitivos ademas de un ejemplo de ellos
 */

package principal;

public class Principal {
	public static void main(String args[]) {
		// primitivos
		int numero = 20;
		float uno = 36.8F;
		double dos = 9.786;
		byte tres = 125;
		short cuatro = 3;
		long cinco = 54237;
		char letra = 'c';
		boolean opcion = true;

		System.out.println();
		System.out.println("	._________________________________________________________________________.");
		System.out.println("	|  NOMBRE     |  LONGITUD                                   |  EJEMPLO    |");
		System.out.println("	|_____________|_____________________________________________|_____________|");
		System.out
				.println("	|  int        |  -2147483648 a 2147483647                   |  " + numero + "         |");
		System.out.println("	|-------------|---------------------------------------------|-------------|");
		System.out.println("	|  float      |   1.4 E -45 a 3.4028235 E 38                |  " + uno + "       |");
		System.out.println("	|-------------|---------------------------------------------|-------------|");
		System.out.println("	|  double     |   4.9 E -324 a 1.7976931348623157 E 308     |  " + dos + "      |");
		System.out.println("	|-------------|---------------------------------------------|-------------|");
		System.out.println("	|  byte       |  -128 a 127                                 |  " + tres + "        |");
		System.out.println("	|-------------|---------------------------------------------|-------------|");
		System.out
				.println("	|  short      |  -32768 a 32767                             |  " + cuatro + "          |");
		System.out.println("	|-------------|---------------------------------------------|-------------|");
		System.out.println("	|  long       |  -9223372036854775808 a 9223372036854775807 |  " + cinco + "      |");
		System.out.println("	|-------------|---------------------------------------------|-------------|");
		System.out
				.println("	|  char       |  -128 a 127                                 |  " + letra + "          |");
		System.out.println("	|-------------|---------------------------------------------|-------------|");
		System.out.println("	|  booleano   |   0 o 1                                     |  " + opcion + "       |");
		System.out.println("	|_____________|_____________________________________________|_____________|");

	}

}

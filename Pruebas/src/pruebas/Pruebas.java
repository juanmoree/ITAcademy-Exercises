package pruebas;

import java.util.*;

public class Pruebas {

	public static void main(String[] args) {
		System.out.println("Introduzca un numero");

		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		String asterisk = "";
		char c = '*';
		
		for (int i = 0; i < num; i++) {
			asterisk += c;
			System.out.println(asterisk);
		}
		
		for (int j = 0; j < num; j++) {
			for (int k = num - 1; k > j; k--) {
				System.out.print(c);
			}
			System.out.println();
		}
		sc.close();
	}
}
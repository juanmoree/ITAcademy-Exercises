package extradiezmil;

import java.util.*;

public class ExtraDiezMil {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int total, sum, count, num;
		total = sum = count = 0;
		float media;
		ArrayList<Integer> numbers = new ArrayList<Integer>();
		System.out.println("Vamos a sumar a partir de 10000.");
		do {
			System.out.println("Introduzca un numero:");
			num = sc.nextInt();
			total = num + total;
			numbers.add(num);
		} while (total < 10000);
		for (int i = 0; i < (numbers.size()); i++) {
			sum = (numbers.get(i) + sum);
			count++;
		}
		media = (float) sum / count;
		System.out.println(
				"El total es " + total + ", los numeros introducidos son: " + numbers + " y la media es: " + media);
		sc.close();
	}
}

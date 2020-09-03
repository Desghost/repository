package Tarefa1;
import java.util.Scanner;

public class Tarefa1 {
		
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		double lado1, lado2, base, altura, raio;
		int op;

		System.out.print("Informe qual Calculo deseja fazer:");
		System.out.print("\n1- Calcular a área de um retângulo");
		System.out.print("\n2- Calcular a área de uma Circunferencia");
		System.out.print("\n3- Calcular a área de um triangulo");
		op = entrada.nextInt();

		switch (op) {
		case 1:
			System.out.println("Informe o lado 1: ");
			lado1 = entrada.nextDouble();
			System.out.println("Informe o lado 2: ");
			lado2 = entrada.nextDouble();
			Teste.calculaAreaRetangulo(lado1, lado2);
			break;

		case 2:
			System.out.println("Informe o raio: ");
			raio = entrada.nextDouble();
			Teste.calculaAreaCircunferencia(raio);
			break;

		case 3:
			System.out.println("Informe a base: ");
			base = entrada.nextDouble();
			System.out.println("Informe a altura: ");
			altura = entrada.nextDouble();
			Teste.calculaAreaTriangulo(base, altura);
			break;

		default:
			break;

		}
		entrada.close();

	}
		
}	
		


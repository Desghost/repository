package Tarefa1;

public class Teste {

	public double resArea;

	public static double calculaAreaRetangulo(double lado1, double lado2) {
		try {
			if (lado1 < 0 || lado2 < 0) {
			     throw new IllegalArgumentException("Use apenas números positívos!");
			}
			System.out.println("Área do retangulo é: " + lado1 * lado2);

		} catch (IllegalArgumentException e) {
			e.printStackTrace();
			
		}
		return 0;
	}

	public static double calculaAreaCircunferencia(double raio) {
		try {
			if (raio < 0) {
			     throw new IllegalArgumentException("Use apenas números positívos!");
			}
			System.out.println("Área da circunferência: " + raio * raio);
		} catch (RuntimeException e) {
			e.printStackTrace();		}
		return 0;

	}

	public static double calculaAreaTriangulo(double base, double altura) {
		try {
			if (base < 0 || altura < 0) {
			     throw new IllegalArgumentException("Use apenas números positívos!");
			}
			System.out.println("Área do triangulo é: " + (base * altura)/2);
		} catch (RuntimeException e) {
			e.printStackTrace();
		}
		return 0;
	}
}

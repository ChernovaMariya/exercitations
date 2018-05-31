import java.util.Scanner;

/**
 * Задание №2
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation2 {

	/**
	 * Метод расчёта суммы 2 переменных
	 * 
	 * @param number1
	 * @param number2
	 */
	void writeSumm(int number1, int number2) {
		System.out.println(number1 + " + " + number2 + " = " + (number1 + number2));
	}

	/**
	 * Метод расчёта разности 2 переменных
	 * 
	 * @param number1
	 * @param number2
	 */
	void writeDifference(int number1, int number2) {
		System.out.println(number1 + " - " + number2 + " = " + (number1 - number2));
	}

	/**
	 * Вычисление НОДа 2-х чисел
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	double gcd(int number1, int number2) {
		return number2 == 0 ? number1 : gcd(number2, number1 % number2);
	}

	/**
	 * Вычисление НОКа 2-х чисел
	 * 
	 * @param number1
	 * @param number2
	 * @return
	 */
	double lcm(int number1, int number2) {
		return number1 / gcd(number1, number2) * number2;
	}

	public static void main(String[] args) {
		Exercitation2 exercitation2 = new Exercitation2();
		Scanner scan = new Scanner(System.in);

		int number1 = 0;
		int number2 = 0;
		System.out.print("введите два числа: ");

		/*
		 * Проверка на ввод целых чисел
		 */
		try {
			number1 = scan.nextInt();
			number2 = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Ошибка. Неверный ввод");
		}

		exercitation2.writeSumm(number1, number2);
		exercitation2.writeDifference(number1, number2);

		System.out.println(
				"НОД(" + number1 + "," + number2 + ")= " + String.format("%.0f", exercitation2.gcd(number1, number2)));
		System.out.println(
				"НОК(" + number1 + "," + number2 + ")= " + String.format("%.0f", exercitation2.lcm(number1, number2)));

	}

}

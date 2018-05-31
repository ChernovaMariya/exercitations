import java.util.Scanner;

/**
 * Задание №1
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation1 {

	/**
	 * Метод проверки переменной number на чётность или нечётность. Если число
	 * number - чётное, то метод вернёт true, иначе false.
	 * 
	 * @param number
	 * @return
	 */
	boolean checkEvenOdd(double number) {
		if (number % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Метод проверки: является ли переменная number простым или составным числом.
	 * 
	 * @param number
	 * @return
	 */
	boolean isPrime(double number) {
		boolean temp = true;

		if (number <= 1) {
			System.out
					.println("По определению отрицательное число, 0 и 1 не относятся к простым или составным числам.");
		}

		for (int i = 2; i <= Math.sqrt(number); i++) {
			temp = number % i == 0;
		}

		return temp;
	}

	public static void main(String[] args) {
		Exercitation1 exercitation1 = new Exercitation1();
		Scanner scan = new Scanner(System.in);

		System.out.println("Введите число:");

		/*
		 * Проверяем введённое пользователем число. Если число - целое, то проверяем на
		 * чётность-нечётность, простое-составное и выводим соответствующее сообщение.
		 */
		if (scan.hasNextInt()) {
			int number = scan.nextInt();
			if (exercitation1.checkEvenOdd(number)) {
				System.out.println(number + "- чётное число");
			} else {
				System.out.println(number + "- нечётное число");
			}
			if (exercitation1.isPrime(number)) {
				System.out.println(number + "- простое число");
			} else {
				System.out.println(number + "- составное число");
			}
		} else {
			System.out.print("Ошибка. Неверный ввод");
		}
	}
}

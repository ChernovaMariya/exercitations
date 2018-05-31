import java.util.Scanner;

/**
 * Задание №10
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation9 {

	/**
	 * Метод, который проверяет является ли число чётным.
	 * 
	 * @param Checknumber
	 * @return
	 */
	boolean isEvenNumber(int Checknumber) {
		if (Checknumber % 2 == 0) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Метод считающий суммы чётных чисел от 0 до заданного числа
	 * 
	 * @param number
	 * @return
	 */
	int summa(int number) {
		int summa = 0;

		for (int i = 0; i <= number; i++) {
			if (isEvenNumber(i)) {
				summa += i;
			} else {
				summa = summa + 0;
			}
		}

		return summa;
	}

	public static void main(String[] args) {
		Exercitation9 exercitation9 = new Exercitation9();
		Scanner scan = new Scanner(System.in);
		System.out.println("Введите число: ");
		int number = 0;

		try {
			number = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Ошибка. Повторите ввод числа");
		}

		System.out.println("Сумма чётных чисел из диапазона [0;" + number + "] = " + exercitation9.summa(number));

	}

}

import java.util.Scanner;

/**
 * Задание №3
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation3 {

	/**
	 * Проверка на палиндромность. Посимвольное сравнивание.
	 * 
	 * @param str
	 * @return
	 */
	Boolean isPalindrome(String str) {
		for (int i = 0; i < str.length() / 2; ++i) {
			if (str.charAt(i) != str.charAt(str.length() - i - 1)) {
				return false;
			}
		}

		return true;
	}

	public static void main(String[] args) {
		Exercitation3 exercitation3 = new Exercitation3();
		Scanner scan = new Scanner(System.in);

		String str = "";
		System.out.print("Введите слово: ");

		try {
			str = scan.nextLine();
		} catch (Exception e) {
			System.out.println("Ошибка. Неверный ввод");
		}

		// Если ввели счлучайно несколько слов, то берём 1-ое из них.
		String str1 = str.contains(" ") ? str.split(" ")[0] : str;

		// Удаляем знаки пунктуации
		str1 = str1.replaceAll("(?U)[\\pP\\s]", "").toLowerCase();

		if (exercitation3.isPalindrome(str1)) {
			System.out.println("Слово \"" + str1 + "\" является палиндромом.");
		} else {
			System.out.println("Слово \"" + str1 + "\" не является палиндромом.");
		}
	}
}

import java.util.ArrayList;
import java.util.Scanner;

/**
 * Задание №5
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation5 {

	/**
	 * Выделение из текста только слов, без спец.символов и знаком пунктуации.
	 * Разбиение текста (без спец. символов и знаков пунктуации) на отдельные слова.
	 * 
	 * @param text
	 * @return
	 */
	ArrayList<String> splitText(String text) {
		ArrayList<String> arrayList = new ArrayList<>();
		text = text.replaceAll("[^a-zA-Zа-яА-Я]", " ");

		for (String word : text.split("\\s+")) {
			arrayList.add(word);
		}

		return arrayList;
	}

	/**
	 * Подсчёт количества совпадений с заданным словом.
	 * 
	 * @param arrayList
	 * @param word
	 * @return
	 */
	int numberOfWordRepetitions(ArrayList<String> arrayList, String word) {
		int count = 0;

		for (String temp : arrayList) {
			if (word.equalsIgnoreCase(temp)) {
				count++;
			}
		}

		return count;
	}

	public static void main(String[] args) {
		Exercitation5 exercitation5 = new Exercitation5();
		Scanner scan = new Scanner(System.in);

		ArrayList<String> arrayList = new ArrayList<>();
		String text = "", word = "";
		System.out.println("Введите текст");

		try {
			text = scan.nextLine();
			System.out.println("Введите слово для поиска");
			word = scan.nextLine();
		} catch (Exception e) {
			System.out.println("Ошибка. Неверный ввод.");
		}

		arrayList.addAll(exercitation5.splitText(text));
		System.out.println("Количество повторений слова \"" + word + "\": "
				+ exercitation5.numberOfWordRepetitions(arrayList, word));
	}
}

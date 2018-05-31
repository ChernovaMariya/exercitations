import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/**
 * Задание №4
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation4 {

	/**
	 * Метод разбиение предложения на отдельные слова. Разделителями служит "," и
	 * пробел.
	 * 
	 * @param str
	 * @return
	 */
	ArrayList<String> splitWord(String str) {
		ArrayList<String> arrayList = new ArrayList<>();

		for (String val : str.split("[\\,\\s]+")) {
			arrayList.add(val.toLowerCase());
		}

		return arrayList;
	}

	/**
	 * Вывод отсортированного динамического массива.
	 * 
	 * @param arrayList
	 */
	void printSortList(ArrayList<String> arrayList) {
		for (String word : arrayList) {
			System.out.println(word);
		}
	}

	public static void main(String[] args) {
		Exercitation4 exercitation4 = new Exercitation4();
		Scanner scan = new Scanner(System.in);

		String str = "";
		ArrayList<String> arrayList = new ArrayList<>();

		System.out.println("Введите текст. Из разделителей используйте только пробел и запятую, пожалуйста");

		try {
			str = scan.nextLine();
		} catch (Exception e) {
			System.out.println("Ошибка. Неверный ввод");
		}

		arrayList.addAll(exercitation4.splitWord(str));
		System.out.println("Количество слов в предложении составило: " + arrayList.size());
		Collections.sort(arrayList);
		exercitation4.printSortList(arrayList);
	}
}

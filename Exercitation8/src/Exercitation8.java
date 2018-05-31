import java.util.ArrayList;
import java.util.Scanner;
/**
 * Задание №8
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation8 {

	/**
	 * Метод "переворачивания" числа, другими словами получение обратного числа
	 * 
	 * @param value
	 * @return
	 */
	int reverse(int value) {
		int result = 0;
		
		while (value > 0) {
			result = result * 10 + value % 10;
			value /= 10;
		}
		
		return result;
	}

	/**
	 * Вывод найденных палиндровом из динамического массива
	 * 
	 * @param arrayList
	 * @param number
	 */
	void printPalindrome(ArrayList<Integer> arrayList, int number) {
		if (arrayList.size() != 0) {
			System.out.println(
					"Количество найденных палиндромов в последовательности [0;" + number + "]= " + arrayList.size());
			System.out.print("Найденные палиндромы: ");
			
			for (int element : arrayList) {
				System.out.print(element + " ");
			}
			
		} else {
			System.out.println("В заданном промежутке [0;" + number + "] палиндромов не найдено.");
		}
	}

	public static void main(String[] args) {

		Exercitation8 exercitation8 = new Exercitation8();
		Scanner scan = new Scanner(System.in);
		int number = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		System.out.println("введите число, но не более 100: ");

		try {
			number = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Ошибка. Повторите ввод.");
		}
		if (number<=100) {
			
			for (int i = 0; i <= number; i++) {
				if (i == exercitation8.reverse(i)) {
					arrayList.add(i);
				}
			}
			
			exercitation8.printPalindrome(arrayList, number);
		}else {
			System.out.println("Вы превысили лимит последовательности.");
		}
	}
}

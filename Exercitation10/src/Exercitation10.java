import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Collectors;

/**
 * Задание №10
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation10 {

	/**
	 * Дробление числа на цифры и запись последних в численный динамический массив
	 * 
	 * @param number
	 * @return
	 */
	ArrayList<Integer> fragmentationNumber(int number) {
		ArrayList<Integer> arrayList = new ArrayList<>();

		while (number > 0) {
			arrayList.add(number % 10);
			number = number / 10;
		}

		return arrayList;
	}

	/**
	 * Составление 3-хзначных комбинаций
	 * 
	 * @param arrayList
	 * @return
	 */
	ArrayList<Integer> composingCombinations(ArrayList<Integer> arrayList) {
		int size = 3;
		int arr[] = new int[size];
		String number = "";
		ArrayList<Integer> arrayListCombinations = new ArrayList<>();

		outer: while (true) {
			for (int index : arr) {
				number += (arrayList.get(index)).toString();
			}

			arrayListCombinations.add(Integer.parseInt(number));
			number = "";

			int i = size - 1;
			while (arr[i] == arrayList.size() - 1) {
				arr[i] = 0;
				i--;
				if (i < 0)
					break outer;
			}
			arr[i]++;
		}

		return arrayListCombinations;
	}

	public static void main(String[] args) {
		Exercitation10 exercitation10 = new Exercitation10();
		Scanner scan = new Scanner(System.in);

		int number1 = 0;
		int number2 = 0;
		int number3 = 0;
		ArrayList<Integer> arrayList = new ArrayList<>();
		ArrayList<Integer> arrayListCombinations = new ArrayList<>();

		System.out.println("Введите три числа:");

		try {
			number1 = scan.nextInt();
			number2 = scan.nextInt();
			number3 = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Ошибка. Неверный ввод.");
		}

		int[] arrayNumber = { number1, number2, number3 };
		int i = 0;

		// получение цифр из трёх введённых значений
		while (i <= arrayNumber.length) {
			arrayList.addAll(exercitation10.fragmentationNumber(i));
			i++;
		}

		// удаление повторяющихся цифр
		arrayList = (ArrayList<Integer>) arrayList.stream().distinct().collect(Collectors.toList());
		arrayListCombinations.addAll(exercitation10.composingCombinations(arrayList));

		System.out.println("Количество возможных комбинаций = " + arrayListCombinations.size());
		System.out.println("Получившиеся комбинации:");

		for (int element : arrayListCombinations) {
			System.out.print(element + " ");
		}
	}
}

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;

/**
 * Задание №7
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation7 {

	/***
	 * Генерация случайного числа
	 * 
	 * @param min
	 * @param max
	 * @return
	 */
	int getRandom(int min, int max) {
		Random random = new Random();
		int number = random.nextInt(max - min) + 1;

		return number;
	}

	/**
	 * Метод для создания массива и заполнения его рандомными двухзначными числами.
	 * 
	 * @param sizeArray
	 * @return
	 */
	ArrayList<Integer> createFillArray(int sizeArray) {
		ArrayList<Integer> arrayList = new ArrayList<>(sizeArray);
		int temp = 0;
		int randomNumber;

		while (temp <= sizeArray) {
			randomNumber = getRandom(-99, 99);

			if (randomNumber > -9 && randomNumber > 9) {
				arrayList.add(randomNumber);
				temp++;
			}
		}

		return arrayList;
	}

	/***
	 * Метод вывода динамического массива
	 * 
	 * @param arrayList
	 */
	void printArray(ArrayList<Integer> arrayList) {
		System.out.print("Сгенерированный массив: ");

		for (int element : arrayList) {
			System.out.print(element + " ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Exercitation7 exercitation7 = new Exercitation7();
		Scanner scan = new Scanner(System.in);
		int sizeArray = 0;
		System.out.println("Введите размерность создаваемого массива: ");

		try {
			sizeArray = scan.nextInt();
		} catch (Exception e) {
			System.out.println("Ошибка. Непраильный ввод");
		}

		ArrayList<Integer> arrayList = new ArrayList<>(sizeArray);

		arrayList.addAll(exercitation7.createFillArray(sizeArray));
		exercitation7.printArray(arrayList);
		Collections.sort(arrayList);
		System.out.println("Максимальный элемени массива = " + arrayList.get(arrayList.size() - 1));
		System.out.println("Минимальный элемент массива = " + arrayList.get(0));

	}

}

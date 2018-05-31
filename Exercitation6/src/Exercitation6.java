import java.util.Scanner;

/**
 * Задание №6
 * 
 * @author Chernova Mariya
 *
 */
public class Exercitation6 {

	/**
	 * Проверка 3 введённых величин на существование треугольника
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 * @return
	 */
	boolean isTriangle(float side1, float side2, float side3) {
		if (side1 > 0 && side2 > 0 && side3 > 0 && side1 + side2 > side3 && side1 + side3 > side2
				&& side2 + side3 > side1) {
			return true;
		} else {
			return false;
		}
	}

	/**
	 * Проверка 3 введённых величин на существование прямоугольного треугольника
	 * 
	 * @param side1
	 * @param side2
	 * @param side3
	 * @return
	 */
	boolean isRightTriangle(float side1, float side2, float side3) {
		if (Math.pow(side1, 2) + Math.pow(side2, 2) == Math.pow(side3, 2)
				|| Math.pow(side1, 2) + Math.pow(side3, 2) == Math.pow(side2, 2)
				|| Math.pow(side2, 2) + Math.pow(side3, 2) == Math.pow(side1, 2)) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {
		Exercitation6 exercitation6 = new Exercitation6();
		Scanner scan = new Scanner(System.in);
		float side1 = 0;
		float side2 = 0;
		float side3 = 0;

		try {
			System.out.println("введите 1-ый отрезок");
			side1 = scan.nextFloat();
			System.out.println("введите 2-ой отрезок");
			side2 = scan.nextFloat();
			System.out.println("введите 3-ий отрезок");
			side3 = scan.nextFloat();
		} catch (Exception e) {
			System.out.println("Ошибка. Неправильный ввод");
		}

		if (exercitation6.isTriangle(side1, side2, side3)) {
			if (exercitation6.isRightTriangle(side1, side2, side3)) {
				System.out.println("Прямоугольный треугольник со сторонами " + (String.format("%.0f", side1)) + ","
						+ (String.format("%.0f", side2)) + "," + (String.format("%.0f", side3)) + " существует");
			} else {
				System.out.println("Прямоугольный треугольник со сторонами " + (String.format("%.0f", side1)) + ","
						+ (String.format("%.0f", side2)) + "," + (String.format("%.0f", side3)) + " не существует");
			}
		} else {
			System.out.println("Треугольник со сторонами " + (String.format("%.0f", side1)) + ","
					+ (String.format("%.0f", side2)) + "," + (String.format("%.0f", side3)) + " не существует");
		}
	}
}

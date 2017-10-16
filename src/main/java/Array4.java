/**
 * Created by ASudarenko on 15.10.2017.
 */
public class Array4 {
    public static void main(String[] args) {

        int[] array = new int[20];
        for (int i = 0; i < array.length; i++) {
            array[i] = ((int) (Math.random() * 21) - 10);
            System.out.print(array[i] + " ");

        }

        int minVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > minVal & array[i] < 0) minVal = array[i];
        }
        System.out.println(minVal < 0 ? "Максимальное отрицательное знчение: " + minVal : "Максимальное отрицательное значение не найдено");

        int maxVal = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > 0 & array[i] < maxVal) maxVal = array[i];
        }
        System.out.println(maxVal > 0 ? "Минимальное положительное значение: " + maxVal : "Минимальное положительное значение не найдено");
    }

}


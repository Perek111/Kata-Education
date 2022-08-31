/*Напишите метод printOddNumbers, который принимает массив и выводит в консоль только нечетные числа из него, через запятую. Конец вывода должен перевести курсор на новую строку.

Пример ввода: [3,5,20,8,7,3,100]

Пример вывода: 3,5,7,3



Требования:
Сигнатура метода должна быть: printOddNumbers(int[] arr)*/
package primitiveTypes;

public class Task_2_4_16 {
    public static void printOddNumbers(int[] arr) {
        String result = "";
        for (int i : arr) {
            if (i % 2 != 0) {
                result = result + i + ",";
            }
        }
        if (result.length() > 0) {
            System.out.println(result.substring(0, result.length() - 1));
        }
    }
}

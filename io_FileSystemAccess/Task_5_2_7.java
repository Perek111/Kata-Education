/*Напишите метод int sumOfStream(InputStream inputStream), который принимает InputStream и возвращает сумму всех его элементов.

Пример ввода: 1, 2, 4, 10

Пример вывода: 17

Требования:
1. Метод должен быть публичным.
2. Параметр должен иметь тип InputStream.
3. Сигнатура метода должна быть: sumOfStream(InputStream inputStream)*/
package io_FileSystemAccess;

public class Task_5_2_7 {
    public int sumOfStream(InputStream inputStream) throws IOException {
        int buff;
        int result = 0;
        while ((buff = inputStream.read()) != -1) {
            result += (byte) buff;
        }
        return result;
    }
}

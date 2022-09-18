/*Напишите метод void print(InputStream inputStream, OutputStream outputStream) который принимает InputStream и OutputStream, считывает все байты из inputStream и записывает в OutputStream только четные.

Пример ввода: 3, 10, 4, 5, 7

Пример вывода: 10, 4

Требования:
1. Метод должен быть публичным.
2. Параметры должны иметь тип InputStream inputStream и OutputStream outputStream.
3. Сигнатура метода должна быть: print(InputStream inputStream, OutputStream outputStream)*/
package io_FileSystemAccess;

public class Task_5_2_8 {
    public static void print(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte result;
        int i;
        while ((i = inputStream.read()) != -1) {
            if ((result = (byte) i) % 2 == 0) {
                outputStream.write(result);
            }
        }
        outputStream.flush();
    }
}

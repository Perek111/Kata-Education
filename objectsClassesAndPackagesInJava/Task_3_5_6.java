/*Напишите статический класс AsciiCharSequence, реализующий компактное хранение последовательности ASCII-символов (их коды влезают в один байт) в массиве байт. По сравнению с классом String из Java 8, хранящим каждый символ как char, AsciiCharSequence будет занимать в два раза меньше памяти

Класс AsciiCharSequence должен:

реализовывать интерфейс java.lang.CharSequence;
иметь конструктор, принимающий массив байт;
определять методы length(), charAt(), subSequence() и toString()

Сигнатуры методов и ожидания по их поведению смотрите в описании интерфейса java.lang.CharSequence (JavaDoc или исходники).

В данном задании методам charAt() и subSequence() всегда будут подаваться корректные входные параметры, поэтому их проверкой и обработкой ошибок заниматься не нужно. Тем более мы еще не проходили исключения.*/
package objectsClassesAndPackagesInJava;

import java.util.Arrays;

public class Task_3_5_6 {
    public static class AsciiCharSequence implements CharSequence {
        private byte[] content;

        public AsciiCharSequence(byte[] content) {
            this.content = content;
        }

        @Override
        public int length() {
            return content.length;
        }

        @Override
        public char charAt(int index) {
            return (char) content[index];
        }

        @Override
        public CharSequence subSequence(int start, int end) {
            return new AsciiCharSequence(Arrays.copyOfRange(content, start, end));
        }

        @Override
        public String toString() {
            return new StringBuilder(subSequence(0, content.length)).toString();
        }
    }

}

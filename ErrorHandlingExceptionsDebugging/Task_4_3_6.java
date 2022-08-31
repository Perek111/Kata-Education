/*Создайте в статичном публичном методе logging логгер с именем com.javamentor.logging.Test, залогируйте им два сообщения: первое "Все хорошо" с уровнем INFO и второе "Произошла ошибка" с уровнем WARNING.

java.util.logging.* импортирован за вас*/
package ErrorHandlingExceptionsDebugging;

import java.util.logging.Logger;

public class Task_4_3_6 {
    public static void logging() {
        Logger log = Logger.getLogger("com.javamentor.logging.Test");
        log.info("Все хорошо");
        log.warning("Произошла ошибка");
    }
}

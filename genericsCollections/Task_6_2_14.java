/*Магазину нужно сохранять информацию о продажах для каждого сотрудника. Напишите метод Map getSalesMap(Reader reader) который принимает Reader содержащий строки вида:

Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Метод должен получить все строки из Readera и заполнить и вернуть карту где ключом будет имя сотрудника, а значением сумма всех его продаж.

Пример ввода:


Алексей 3000
Дмитрий 9000
Антон 3000
Алексей 7000
Антон 8000
Пример вывода:
{Алексей=[10000], Дмитрий=[9000], Антон=[11000]}

Требования:
1. Должен быть метод public static Map<String, Long> getSalesMap(Reader reader)
2. Работа метода getSalesMap должна удовлетворять условию*/
package genericsCollections;

public class Task_6_2_14 {
    public static Map<String, Long> getSalesMap(Reader reader) throws IOException {
        Map<String, Long> resultHashMap = new HashMap<>();
        BufferedReader br = new BufferedReader(reader);
        String lineName;
        while ((lineName = br.readLine()) != null) {
            resultHashMap.merge(lineName.split(" ")[0], Long.parseLong(lineName.split(" ")[1]), (cost1, cost2) -> cost1 + cost2);
        }
        reader.close();
        return resultHashMap;
    }
}

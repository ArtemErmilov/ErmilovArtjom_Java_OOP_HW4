package Homework.JAVA_HW10_OOP;

public class Numeric<T> {

    private int sum;

    /**
     * Определение количества родственников в семья.
     * 
     * @param <R>
     * @param search - Кодовое слово для подсчёта родственников:
     *               "Количество в семье" - вывод общего количества родственников
     *               "Количество детей" - вывод количества детей
     *               "Количество родителей" - вывод количества родителей
     *               "Количество сыновей" - вывод количества сыновей
     *               "Количество дочерей" - вывод количества сыновей
     * @param data   - Экземпляр метода, в котором будет делаться поиск.
     * @return
     */

    <R extends Number> int getAmount(T search, FamilyTreeIntMethod data) {
        sum = 0;
        boolean temp = false;

        if (search.equals("Количество в семье")) {
            while (data.hasNext()) {
                if (sum == 0)
                    sum++;
                if (data.next() != null && data.next().equals("Дочь"))
                    sum++;
                if (data.next() != null && data.next().equals("Сын"))
                    sum++;
                if (data.next() != null && data.next().equals("Отец"))
                    temp = true;
                if (data.next() != null && data.next().equals("Мать"))
                    temp = true;
                if (temp == true) {
                    if (data.next() != null) {
                        sum++;
                    }
                    temp = false;
                }
            }
        }

        if (search.equals("Количество детей")) {
            while (data.hasNext()) {
                if (data.next() != null && data.next().equals("Дочь"))
                    sum++;
                if (data.next() != null && data.next().equals("Сын"))
                    sum++;

            }
        }

        if (search.equals("Количество родителей")) {
            while (data.hasNext()) {
                if (data.next() != null && data.next().equals("Отец"))
                    temp = true;
                if (data.next() != null && data.next().equals("Мать"))
                    temp = true;
                if (temp == true) {
                    if (data.next() != null) {
                        sum++;
                    }
                    temp = false;
                }

            }
        }

        if (search.equals("Количество сыновей")) {
            while (data.hasNext()) {
                if (data.next() != null && data.next().equals("Дочь"))
                    sum++;
            }
        }

        if (search.equals("Количество дочерей")) {
            while (data.hasNext()) {
                if (data.next() != null && data.next().equals("Дочь"))
                    sum++;
                
            }
        }

        return sum;

    }
}

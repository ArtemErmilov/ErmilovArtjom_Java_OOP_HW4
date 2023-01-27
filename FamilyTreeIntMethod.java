package Homework.JAVA_HW10_OOP;

import java.util.Iterator;

/**
 * Метод - Генеалогическое древо.
 * 
 * setDataMan - Ввод Ф.И.О.ДР изучаемого человека.
 * setDataChild1 - Ввод степени родства.Ф.И.О.ДР 1-го ребёнка
 * setDataChild2 - Ввод степени родства.Ф.И.О.ДР 2-го ребёнка
 * setDataFather - Ввод Ф.И.О.ДР отца
 * setDataMother - Ввод Ф.И.О.ДР матери
 * 
 * showFamily - Вывод данных всей семьи
 * showChildren - Вывод данных детей
 * showParents - Вывод данных родителей.
 * showMan() - Вывод данных исследуемого человека
 * showChildren1() - Вывод данных по 1-му ребёнку
 * showChildren2() - Вывод данных по 2-му ребёнку
 * showFather() - Вывод данных по отцу
 * showMother() - Вывод данных по матери
 * 
 * getDataChild1Ki - Метод для доступа к степени родства 1-го ребёнка
 * getDataChild2Ki - Метод для доступа к степени родства 2-го ребёнка
 * getDataChild1Ne() - Метод для доступа к имени 1-го ребёнка
 * getDataChild2Ne() - Метод для доступа к имени 2-го ребёнка
 * getDataFatherKi() - Метод для доступа к степени родства отца
 * getDataFatherNe() - Метод для доступа к имени отца
 * getDataMotherKi() - Метод для доступа к степени родства матери
 * getDataMotherNe() - Метод для доступа к имени матери
 */

public class FamilyTreeIntMethod implements FamilyTreeInt, Iterable {

    FamilyTreeInt oldPersonMan;

    String manNe;
    String manPa;
    String manSu;
    String manDaOB;

    Person personMan = new Person(manNe, manPa, manSu, manDaOB);

    String child1Ki;
    String child1Ne;
    String child1Pa;
    String child1Se;
    String child1DaOB;

    Person child1 = new Person(child1Ki, child1Ne, child1Pa, child1Se, child1DaOB);

    String child2Ki;
    String child2Ne;
    String child2Pa;
    String child2Se;
    String child2DaOB;

    Person child2 = new Person(child2Ki, child2Ne, child2Pa, child2Se, child2DaOB);

    String fatherKi;
    String fatherNe;
    String fatherPa;
    String fatherSe;
    String fatherDaOB;

    Person father = new Person(fatherKi, fatherNe, fatherPa, fatherSe, fatherDaOB);

    String motherKi;
    String motherNe;
    String motherPa;
    String motherSe;
    String motherDaOB;

    Person mother = new Person(motherKi, motherNe, motherPa, motherSe, motherDaOB);

    /**
     * Данные изучаемого человека
     * 
     * @param name        - Имя
     * @param patronymic  - Фамилия
     * @param surname     - Отчество
     * @param dateOfBirth - Дата рождения
     */

    public void setDataMan(String name, String patronymic, String surname, String dateOfBirth) {

        personMan.setName(name);
        personMan.setPatronymic(patronymic);
        personMan.setSurname(surname);
        personMan.setDateOfBirth(dateOfBirth);

    }

    /**
     * Данные 1-го ребёнка
     * 
     * @param kinship     - Степень родства
     * @param name        - Имя
     * @param patronymic  - Фамилия
     * @param surname     - Отчество
     * @param dateOfBirth - Дата рождения
     */

    @Override
    public void setDataChild1(String kinship, String name, String patronymic, String surname, String dateOfBirth) {

        child1.setKinship(kinship);
        child1.setName(name);
        child1.setPatronymic(patronymic);
        child1.setSurname(surname);
        child1.setDateOfBirth(dateOfBirth);
    }

    /**
     * Данные 2-го ребёнка
     * 
     * @param kinship     - Степень родства
     * @param name        - Имя
     * @param patronymic  - Фамилия
     * @param surname     - Отчество
     * @param dateOfBirth - Дата рождения
     */

    @Override
    public void setDataChild2(String kinship, String name, String patronymic, String surname, String dateOfBirth) {

        child2.setKinship(kinship);
        child2.setName(name);
        child2.setPatronymic(patronymic);
        child2.setSurname(surname);
        child2.setDateOfBirth(dateOfBirth);

    }

    /**
     * Данные отца
     * 
     * @param kinship     - Степень родства
     * @param name        - Имя
     * @param patronymic  - Фамилия
     * @param surname     - Отчество
     * @param dateOfBirth - Дата рождения
     */

    @Override
    public void setDataFather(String name, String patronymic, String surname, String dateOfBirth) {

        father.setKinship("Отец");
        father.setName(name);
        father.setPatronymic(patronymic);
        father.setSurname(surname);
        father.setDateOfBirth(dateOfBirth);

    }

    /**
     * Данные матери
     * 
     * @param kinship     - Степень родства
     * @param name        - Имя
     * @param patronymic  - Фамилия
     * @param surname     - Отчество
     * @param dateOfBirth - Дата рождения
     */

    @Override
    public void setDataMother(String name, String patronymic, String surname, String dateOfBirth) {

        mother.setKinship("Мать");
        mother.setName(name);
        mother.setPatronymic(patronymic);
        mother.setSurname(surname);
        mother.setDateOfBirth(dateOfBirth);
        this.index = 0;

    }

    /**
     * Метод для доступа к имени изучаемого человека
     */

    public String getDataManNe() {

        if (personMan.getName() != null) {
            return personMan.getName();
        } else
            return getNamePerson();
    }

    /**
     * Метод для доступа к отчеству изучаемого человека
     */
    public String getDataManPe() {

        if (personMan.getPatronymic() != null) {
            return personMan.getPatronymic();
        } else
            return getPatronymicPerson();
    }

    /**
     * Метод для доступа к фамилии изучаемого человека
     */
    public String getDataManSu() {

        if (personMan.getSurname() != null) {
            return personMan.getSurname();
        } else
            return getSurnamePerson();
    }

    /**
     * Метод для доступа к фамилии изучаемого человека
     */
    public String getDataManBOD() {

        if (personMan.getDateOfBirth() != null) {
            return personMan.getDateOfBirth();
        } else
            return getBODPerson();
    }

    /**
     * Метод для доступа к степени родства 1-го ребёнка
     */

    public String getDataChild1Ki() {

        return child1.getKinship();
    }

    /**
     * Метод для доступа к имени 1-го ребёнка
     */
    public String getDataChild1Ne() {
        return child1.getName();
    }

    /**
     * Метод для доступа к степени родства 2-го ребёнка
     */

    public String getDataChild2Ki() {

        return child2.getKinship();
    }

    /**
     * Метод для доступа к имени 2-го ребёнка
     */
    public String getDataChild2Ne() {
        return child2.getName();
    }

    /**
     * Метод для доступа к степени родства отца
     */

    public String getDataFatherKi() {

        return father.getKinship();
    }

    /**
     * Метод для доступа к имени отца
     */
    public String getDataFatherNe() {
        return father.getName();
    }

    /**
     * Метод для доступа к степени родства матери
     */

    public String getDataMotherKi() {

        return mother.getKinship();
    }

    /**
     * Метод для доступа к имени матери
     */
    public String getDataMotherNe() {
        return mother.getName();
    }

    /**
     * Вывод данных в консоль по семье
     */
    void showFamily() {
        System.out.println();
        if (personMan.getName() != null)
            personMan.showManData();
        else
            showPersonData();
        System.out.println("---------Семья--------");
        if (child1.getKinship() != null) {
            child1.showManData();
        }
        if (child2.getKinship() != null) {
            child2.showManData();
        }
        if (father.getKinship() != null) {
            father.showManData();
        }
        if (mother.getKinship() != null) {
            mother.showManData();
        }

    }

    /**
     * Вывод данных по детям в консоль
     */

    void showChildrens() {
        System.out.println();
        if (personMan.getName() != null)
            personMan.showManData();
        else
            showPersonData();
        System.out.println("----------Дети----------");
        if (child1.getKinship() != null) {
            child1.showManData();
        }
        if (child2.getKinship() != null) {
            child2.showManData();
        }
    }

    /**
     * Вывод данных по родителям в консоль
     */

    void showParents() {
        System.out.println();
        if (personMan.getName() != null)
            personMan.showManData();
        else
            showPersonData();
        System.out.println("------------Родители----------");
        if (father.getKinship() != null) {
            father.showManData();
        }
        if (mother.getKinship() != null) {
            mother.showManData();
        }
    }

    /**
     * Вывод данных исследуемого человека
     */

    void showMan() {
        if (personMan.getName() != null)
            personMan.showManData();
        else
            showPersonData();
    }

    /**
     * Вывод данных по 1-му ребёнку
     */
    void showChildren1() {
        if (child1.getKinship() != null)
            child1.showManData();
        else
            System.out.println("Данных по 1-му ребёнку нет");
    }

    /**
     * Вывод данных по 2-му ребёнку
     */
    void showChildren2() {
        if (child2.getKinship() != null)
            child2.showManData();
        else
            System.out.println("Данных по 2-му ребёнку нет");
    }

    /**
     * Вывод данных по отцу
     */
    void showFather() {
        if (father.getName() != null)
            father.showManData();
        else
            System.out.println("Данных по отцу нет");
    }

    /**
     * Вывод данных по матери
     */
    void showMother() {
        if (mother.getName() != null)
            mother.showManData();
        else
            System.out.println("Данных по матери нет");
    }

    int index;

    public boolean hasNext() {
        return index++ < 24;
    }

    // if (manNe != null) {
    // return personMan.getName();
    // } else
    // return oldPersonMan.getNamePerson();

    public String next() {
        switch (index) {
            case 1:
                return getDataManNe();

            case 2:
                return getDataManPe();
            case 3:
                return getDataManSu();
            case 4:
                return getDataManBOD();

            case 5:
                return child1.getKinship();
            case 6:
                return child1.getName();
            case 7:
                return child1.getPatronymic();
            case 8:
                return child1.getSurname();
            case 9:
                return child1.getDateOfBirth();

            case 10:
                return child2.getKinship();
            case 11:
                return child2.getName();
            case 12:
                return child2.getPatronymic();
            case 13:
                return child2.getSurname();
            case 14:
                return child2.getDateOfBirth();
            
                case 15:
                return father.getKinship();
            case 16:
                return father.getName();
            case 17:
                return father.getPatronymic();
            case 18:
                return father.getSurname();
            case 19:
                return father.getDateOfBirth();
            
                case 20:
                return mother.getKinship();
            case 21:
                return mother.getName();
            case 22:
                return mother.getPatronymic();
            case 23:
                return mother.getSurname();
            default:
                return mother.getDateOfBirth();
        }

    }

    @Override
    public Iterator iterator() {
        // TODO Auto-generated method stub
        return null;
    }

}

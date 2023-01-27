package Homework.JAVA_HW10_OOP;

/**
 * Метод ввода данных человека со степенью родства.
 * 
 *  kinship- Степень родства
    name - Имя
    patronymic -Отчество
    surname - Фамилия
    dateOfBirth - Дата рождения
    
    getKinship - Метод доступа к степени родства
    getName - Метод для доступа к имени
    getPatronymic - Метод для доступа к отчеству
    getSurname - Метод для доступа к фамилии
    getDateOfBirth -Метод для доступа к дате рождения

    setKinship - Метод ввода степени родства
    setName - Метод для ввода имени
    setPatronymic -Метод для ввода отчества
    setSurname - Метод для ввода фамилии
    setDateOfBirth -Метод для ввода даты рождения

    howManData - Вывод данных человека в консоль 
 * 
 */

class Person {

    private  String kinship; // Степень родства

    private  String name; // Имя
    
    private String patronymic; // Отчество

    private String surname; // Фамилия

    private String dateOfBirth; // Дата рождения

 /**
  * Ввод данных человека
  * @param k - Степень родства
  * @param n - Имя
  * @param p - Отчество
  * @param s - Фамилия
  * @param dob - Дата рождения
  */

    Person(String k, String n, String p, String s, String dob)// Создание конструктора (И.О.Ф. ДР)
    {   
        this.kinship = k;
        this.name = n;
        this.patronymic = p;
        this.surname = s;
        this.dateOfBirth = dob;
    }
    /**
  * Ввод данных человека
  * @param n - Имя
  * @param p - Отчество
  * @param s - Фамилия
  * @param dob - Дата рождения
  */

    Person(String n, String p, String s, String dob)// Создание конструктора (И.О.Ф. ДР)
    {   
        this.kinship = null;
        this.name = n;
        this.patronymic = p;
        this.surname = s;
        this.dateOfBirth = dob;
    }

    /**
  * Ввод данных человека
  * @param n - Имя
  * @param p - Отчество
  * @param s - Фамилия
  * @param dob - Дата рождения
  */

    Person(String n, String s, String dob)// Создание конструктора (И.Ф. ДР)
    {   
        this.kinship = null;
        this.name = n;
        this.patronymic = null;
        this.surname = s;
        this.dateOfBirth = dob;
    }

/**
  * Ввод данных человека
  * @param n - Имя
  * @param s - Фамилия
  */  

    Person(String n, String s)// Создание конструктора (И.Ф.)
    {   
        this.kinship = null;
        this.name = n;
        this.patronymic = null;
        this.surname = s;
        this.dateOfBirth = null;
    }

    /**
  * Ввод данных человека
  * @param n - Имя
  */  

    Person(String n)// Создание конструктора (И.)
    {   
        this.kinship = null;
        this.name = n;
        this.patronymic = null;
        this.surname = null;
        this.dateOfBirth = null;
    }
    
    /**
     * Метод доступа к степени родства
     */

    public String getKinship() {
        // Метод доступа к степени родства 
        return kinship;
    }

    /**
     * Метод для доступа к имени
     */

    public String getName() {
        // Метод для доступа к имени
        return name;
    }
    /**
     * 
     * Метод для доступа к отчеству
     */

    public String getPatronymic() {
        // Метод для доступа к отчеству
        return patronymic;
    }

    /**
     * Метод для доступа к фамилии
     */

    public String getSurname() {
        // Метод для доступа к фамилии
        return surname;
    }

    /**
     * Метод для доступа к дате рождения
     */

    public String getDateOfBirth() {
        // Метод для доступа к дате рождения
        return dateOfBirth;
    }

    /**
     * Ввода степени родства
     */
    
    public void setKinship(String kinship) // Метод для ввода степени родства
    {
        this.kinship = kinship;

    }

    /**
     * Ввод имени
     */

    public void setName(String name) // Метод для ввода имени
    {
        this.name = name;

    }

    /**
     * Ввод отчества
     */

    public void setPatronymic(String patronymic) // Метод для ввода отчества
    {
        this.patronymic = patronymic;

    }

    /**
     * Ввод фамилии
     */

    public void setSurname(String surname) // Метод для ввода фамилии
    {
        this.surname = surname;

    }
    /**
     * Ввод даты рождения
     */

    public void setDateOfBirth(String dateOfBirth) // Метод для ввода даты рождения
    {
        this.dateOfBirth = dateOfBirth;

    }

    /**
     * Вывод данным по человеку в консоль: Степень родства, Имя, Отчество, Фамилия, Дата рождения.
     */

    void showManData (){
        if (kinship!=null) {System.out.print(kinship+" ");}
        System.out.print(name+" ");
        if (patronymic!=null) {System.out.print(patronymic+" ");}
        if (surname!=null) {System.out.print(surname+ " ");}
        if (dateOfBirth!=null) {System.out.print(dateOfBirth+ " ");}
        System.out.println("");
    }

}

    


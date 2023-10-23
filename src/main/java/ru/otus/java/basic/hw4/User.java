package ru.otus.java.basic.hw4;
//    Создайте класс Пользователь (User) с полями: фамилия, имя, отчество, год рождения, email;
//    Реализуйте у класса конструктор, позволяющий заполнять эти поля при создании объекта;
//    В классе Пользователь реализуйте метод, выводящий в консоль информацию о пользователе в виде:
//    ФИО: фамилия имя отчество
//    Год рождения: год рождения
//    e-mail: email

public class User<result> {
    private String firthname;
    private String lastname;
    private String middlename;
    private int birthdateYear;
    private String email;

    public String getFirthname() {
        return firthname;
    }

    public void setFirthname(String firthname) {
        this.firthname = firthname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getMiddlename() {
        return middlename;
    }

    public void setMiddlename(String middlename) {
        this.middlename = middlename;
    }

    public void setBirthdate() {
        this.birthdateYear = birthdateYear;
    }

    public int getBirthdateYear() {
        return birthdateYear;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * Конструктор для пользователя
     *
     * @param firthname     Фамилия
     * @param lastname      Имя
     * @param middlename    Отчество
     * @param birthdateYear Год рождения
     * @param email         Электронная почта
     */
    public User(String firthname, String lastname, String middlename, int birthdateYear, String email) {
        this.firthname = firthname;
        this.lastname = lastname;
        this.middlename = middlename;
        this.birthdateYear = birthdateYear;
        this.email = email;
    }

    /**
     * @return Возврат строки с результатами
     */
    public String toString() {
        return "ФИО: " + lastname + " " + firthname + " " + middlename + "\n"
                + "Год рождения: " + birthdateYear + "\n"
                + "e-mail: " + email + "\n";
    }
}
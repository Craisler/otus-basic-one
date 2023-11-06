package ru.otus.java.basic.hw9;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    public static void main(String[] args) {
//Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных значений в указанном диапазоне (min и max включительно, шаг - 1);
//Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и возвращающий сумму;
//Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую заполненную ячейку списка указанным числом;
//Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка на указанное число;

        List<Integer> array = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 0));
        System.out.println("Набор последовательных значений: " + minMaxArrays(8, 10) + "\n");
        System.out.println("Массив:" + Arrays.toString(new List[]{array}));
        System.out.println("Сумма чисел в массиве больше 5: " + sumValueMoreFive(array) + "\n");
        System.out.println("Сумма чисел в массиве больше 5: " + fillNum(5, array) + "\n");
        System.out.println("Увеличенные элементы списка в массиве: " + increaseElementNum(100, array) + "\n");


        List<Employee> employees = new ArrayList<Employee>(10);
        employees.add(new Employee("Василий", 20));
        employees.add(new Employee("Иван", 21));
        employees.add(new Employee("Фёдор", 22));
        employees.add(new Employee("Роман", 23));
        employees.add(new Employee("Алексей", 24));
        employees.add(new Employee("Сергей", 30));
        employees.add(new Employee("Михаил", 31));
        employees.add(new Employee("Андрей", 32));
        employees.add(new Employee("Павел", 33));
        employees.add(new Employee("Григорий", 34));

//Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;
        System.out.println("Список имён в массиве: " + getNames(employees) + "\n");

//Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;
        System.out.println("Список сотрудников, возраст которых больше либо равен указанному аргументу: " + getAgeList(employees, 25) + "\n");

//Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий что средний возраст сотрудников превышает указанный аргумент;
        System.out.println("Cредний возраст сотрудников превышает заданный минимальны возраст (true - Да; false - Нет): " + ifMinAverAgeOlder(employees, 35) + "\n");

//Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.
        System.out.println("Cамый молодой сотрудник: " + youngEmployee(employees));
    }

    private static List<Integer> minMaxArrays(int min, int max) {
        System.out.println("\nЗадача 1: Реализуйте метод, принимающий в качестве аргументов числа min и max, и возвращающий ArrayList с набором последовательных значений в " +
                "указанном диапазоне (min и max включительно, шаг - 1);");
        List<Integer> arrList = new ArrayList();
        for (int i = min; i <= max; i += 1) {
            arrList.add(i);
        }
        return arrList;
    }

    private static int sumValueMoreFive(List<Integer> arr) {
        System.out.println("\nЗадача 2: Реализуйте метод, принимающий в качестве аргумента список целых чисел, суммирующий все элементы, значение которых больше 5, и " +
                "возвращающий сумму;");
        int sum = 0;
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) > 5) {
                sum += arr.get(i);
            }
        }
        return sum;
    }

    private static List<Integer> fillNum(int num, List<Integer> arr) {
        System.out.println("Задача 3: Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, метод должен переписать каждую " +
                "заполненную ячейку списка указанным числом;");
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, num);
        }
        return arr;
    }

    private static List<Integer> increaseElementNum(int num, List<Integer> arr) {
        System.out.println("Задача 4: Реализуйте метод, принимающий в качестве аргументов целое число и ссылку на список, увеличивающий каждый элемент списка на указанное число;");
        for (int i = 0; i < arr.size(); i++) {
            arr.set(i, arr.get(i) + num);
        }
        return arr;
    }

    private static List<String> getNames(List<Employee> employeesList) {
        System.out.println("Задача 5: Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий список их имен;");
        List<String> names = new ArrayList<>();
        for (Employee employee : employeesList) {
            names.add(employee.getName());
        }
        return names;
    }

    private static List<Employee> getAgeList(List<Employee> employees, int age) {
        System.out.println("Задача 6: Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный возраст, и возвращающий список сотрудников, возраст которых больше либо равен указанному аргументу;");
        List<Employee> ageList = new ArrayList<Employee>();
        for (int i = 0; i < employees.size(); i++) {
            if (employees.get(i).getAge() >= age) {
                ageList.add(employees.get(i));
            }
        }
        return ageList;
    }

    private static boolean ifMinAverAgeOlder(List<Employee> employees, int minAverAge) {
        System.out.println("Задача 7: Реализуйте метод, принимающий в качестве аргумента список сотрудников и минимальный средний возраст, и проверяющий что средний возраст сотрудников превышает указанный аргумент;");
        int averAge;
        int sunAge = 0;
        for (int i = 0; i < employees.size(); i++) {
            sunAge += employees.get(i).getAge();
        }
        averAge = sunAge / employees.size();
        System.out.println("Заданный минимальный возраст: " + minAverAge);
        System.out.println("Средний возраст сотрудников: " + averAge);
        return averAge >= minAverAge;
    }

    private static Employee youngEmployee(List<Employee> employees) {
        System.out.println("Задача 8: Реализуйте метод, принимающий в качестве аргумента список сотрудников, и возвращающий ссылку на самого молодого сотрудника.");
        int idx = 0;
        for (int i = 1; i < employees.size(); i++) {
            if (employees.get(idx).getAge() > employees.get(i).getAge()) {
                idx = i;
            }
        }
        return employees.get(idx);
    }
}
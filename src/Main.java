//  Задание 2
//  Допустим у вас есть массив Person (String name, int age). Реализуйте метод сравнения двух Person.
//  Подсказка: в метод приходят два Person метод должен вернуть, какой из них старше,
//  какой младше, а может быть они равны? Давайте договоримся так:
//  - ваш метод возвращает любое положительное число, если первый Person старше
//  - любое отрицательное, если старше второй персон,
//  - и 0 если возраст одинаков.
//  Отсортируйте массив используя, на ваш выбор Selected Sort или BubbleSort или MargeSort
//  (естественно, не используем стандартный метод sort() в Java)

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Vasja", 46));
        people.add(new Person("Olya", 32));
        people.add(new Person("Kirill", 56));
        people.add(new Person("Jack", 33));
        people.add(new Person("Alex", 55));
        people.add(new Person("Oleg", 43));
        people.add(new Person("Stas", 19));
        people.add(new Person("John", 22));

        Person peopleList = new Person(people);

        System.out.println(people);
        peopleList.selectedSort();
        System.out.println(people);
    }
}
import java.util.List;

public class Person {
    private String name;
    private int age;
    List<Person> array;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Person(List<Person> array) {
        this.array = array;
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }

    public void selectedSort(){
        for (int i = 0; i <array.size() -1; i++) {
            int indexMin = indexMin(i);
            swap(i, indexMin);
        }
    }

    private int indexMin(int startIndex) {
        int min = startIndex;
        for (int i = startIndex; i < array.size(); i++) {
            int minAge = array.get(min).getAge();
            int maxAge = array.get(i).getAge();
            if (minAge > maxAge){
                    System.out.println(minAge + "  > " + maxAge + "  +" + (minAge-maxAge));
                    min = i;
            } else {
                System.out.println((minAge == maxAge) ?
                        minAge + " == " + maxAge + "   0" :
                        minAge + "  < " + maxAge + "  " + (minAge-maxAge));
            }
        }
        return min;
    }

    private void swap( int index1, int index2) {
        Person temp = array.get(index1);
        array.set(index1, array.get(index2));
        array.set(index2, temp);
    }

    public String toString() {
        return "Name: " + name + ", Age: " + age;
    }
}

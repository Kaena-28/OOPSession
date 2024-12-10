import java.util.Arrays;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Person person = new Person();
        Person person2 = new Person();
        Person person3 = new Person();
        Person person4 = new Person();
        Person person5 = new Person(); //пульт
        person.name = "Nickolas Jackson";
        person.age = 22;
        person2.name = "snj";
        person2.age = 23;
        person3.name = "John Doe";
        person3.age = 24;
        person4.name = "Jane Doe";
        person4.age = 25;
        person5.name = "Jane Doe";
        person5.age = 26;
        Person[] people = {person, person2, person3, person4, person5};
        for (Person p : people) {
            System.out.println(p);
        }
    }
}
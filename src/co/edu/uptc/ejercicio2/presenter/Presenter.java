package co.edu.uptc.ejercicio2.presenter;

import co.edu.uptc.ejercicio2.model.Person;
import co.edu.uptc.ejercicio2.model.PersonManager;

import java.util.Vector;

public class Presenter {

    public Presenter() {
        PersonManager personManager = new PersonManager();
        Person person = new Person("Maria", 1);
        Person person1 = new Person("Jose", 1);
        Person person2 = new Person("Jose", 2);
        Person person3 = new Person("Jesus", 1);
        Person person4 = new Person("Maria", 2);
        Person person5 = new Person("Jesus", 2);
        Person person6 = new Person("Maria", 3);
        Person person7 = new Person("Maria", 4);

        Vector<Person> vector = new Vector<>();
        vector.add(person);
        vector.add(person1);
        vector.add(person2);
        vector.add(person3);
        vector.add(person4);
        vector.add(person5);
        vector.add(person6);
        vector.add(person7);

        for (Person personj : vector) {
            System.out.println(personj.getName() + ": " + personj.getAge());
        }

        personManager.deleteDuplicates(vector);

        System.out.println("----------------------------");

        for (Person personi : personManager.getUniquePersons()) {
            System.out.println(personi.getName() + ": " + personi.getAge());
        }

        System.out.println("----------------------------");

        System.out.println("Edad de personas unicas: " + personManager.sumAge());
    }
}

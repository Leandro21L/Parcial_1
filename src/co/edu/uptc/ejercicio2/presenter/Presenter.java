package co.edu.uptc.ejercicio2.presenter;

import co.edu.uptc.ejercicio2.model.Person;
import co.edu.uptc.ejercicio2.model.PersonManager;
import co.edu.uptc.ejercicio2.view.View;

import java.util.Vector;

public class Presenter {

    private PersonManager personManager;
    private View view;

    public Presenter() {
        personManager = new PersonManager();
        view = new View();
        /*Person person = new Person("Maria", 1);
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

        /*for (Person personi : personManager.getUniquePersons()) {
            System.out.println(personi.getName() + ": " + personi.getAge());
        }
        System.out.println(personManager.getUniquePersons());

        System.out.println("----------------------------");

        System.out.println("Edad de personas unicas: " + personManager.sumAge());*/
        init();

    }

    private void init() {
        int option = 0;
        Vector<Person> people = new Vector<>();
        view.showMessage("Ejercicio 2");
        while (option < 4) {
            switch (view.readInt("Seleccione una opcion:\n 1. Ingresar Personas.\n 2. Ver personas ''unicas''.\n 3. Salir.")) {
                case 1:
                    people = createPersons(view.readInt("Cuantas personas desea ingresar?"));
                    break;
                case 2:
                    personManager.deleteDuplicates(people);
                    view.showMessage(personManager.getUniquePersons() + "\nEdad de personas unicas: " + personManager.sumAge());
                    break;
                case 3:
                    System.exit(0);
                    break;
                default:
                    break;
            }
        }
    }

    private Vector<Person> createPersons(int i) {
        Vector<Person> persons = new Vector<>();
        while (i > 0) {
            Person person = new Person(view.readString("Ingrese un nombre."), view.readInt("Ingrese edad"));
            persons.add(person);
            i--;
        }
        return persons;
    }
}

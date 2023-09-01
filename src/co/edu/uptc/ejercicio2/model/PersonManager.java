package co.edu.uptc.ejercicio2.model;

import java.util.HashSet;
import java.util.Vector;

public class PersonManager {

    private HashSet<Person> uniquePersons;

    public PersonManager() {
        uniquePersons = new HashSet<>();
    }

    public void deleteDuplicates(Vector<Person> persons) {
        Vector<Person> aux = new Vector<>();
        for (int i = 0; i < persons.size(); i++) {
            for (int j = 1; j < persons.size(); j++) {
                if (persons.get(i).getName().equalsIgnoreCase(persons.get(j).getName())){
                    aux.add(persons.get(i));
                }
                //System.out.println("i: " + i + "\nj: " + j + "\n------------------");
            }
        }
        uniquePersons = new HashSet<>(aux);
    }

    public int sumAge() {
        HashSet<Person> aux = uniquePersons;
        int sum = 0;
        for (Person person : aux) {
            sum += person.getAge();
        }
        return sum;
    }

    public HashSet<Person> getUniquePersons() {
        return uniquePersons;
    }

    public void setUniquePersons(HashSet<Person> uniquePersons) {
        this.uniquePersons = uniquePersons;
    }

}

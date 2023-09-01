package co.edu.uptc.ejercicio2.model;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Vector;

public class PersonManager {

    private HashMap<String, Integer> uniquePersons;

    public PersonManager() {
        uniquePersons = new HashMap<>();
    }

    public void deleteDuplicates(Vector<Person> persons) {
        for (Person person:persons) {
            uniquePersons.put(person.getName(), person.getAge());
        }
    }

    public int sumAge() {
        int sum = 0;
        for (int i:uniquePersons.values()) {
            sum += i;
        }
        return sum;
    }

    public HashMap<String, Integer> getUniquePersons() {
        return uniquePersons;
    }

    public void setUniquePersons(HashMap<String, Integer> uniquePersons) {
        this.uniquePersons = uniquePersons;
    }
}
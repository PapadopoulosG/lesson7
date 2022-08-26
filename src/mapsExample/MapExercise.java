package mapsExample;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class MapExercise {

    public static void main(String[] args){
       Map<String,Person> mapOfPeople = new HashMap<String,Person>();

        ArrayList<Person> people = new ArrayList<Person>();
        people.add(new Person("George","george@email.com"));
        people.add(new Person("Giota","giota@email.com"));
        people.add(new Person("Giorgos","giorgos@email.com"));

        for (Person person: people) {
            mapOfPeople.put(person.getEmail(), person);
        }

        System.out.println(mapOfPeople.get("giota@email.com"));
        System.out.println(mapOfPeople.containsKey("giorgos@email.com"));







    }
}

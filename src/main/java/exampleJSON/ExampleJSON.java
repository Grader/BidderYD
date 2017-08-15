package exampleJSON;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ExampleJSON {

    private static final Gson GSON = new GsonBuilder().setPrettyPrinting().create();




    public static void main(String[] args) {
        Person person = new Person("Man", 30, Arrays.asList("Moskow", "Berlin", "Dubai"));
        String json = GSON.toJson(person);
        System.out.println(json);

        Person person1 = GSON.fromJson(json, Person.class);
        System.out.println(person1.getName());
        System.out.println(person1.getAge());
        System.out.println(person1.getGeoHistory());


    }
}

class Person {

    private String name;
    private Integer age;
    private List<String> geoHistory = new ArrayList<String>();

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public List<String> getGeoHistory() {
        return geoHistory;
    }

    public Person(String name, Integer age, List<String> geoHistory) {
        this.name = name;
        this.age = age;
        this.geoHistory = geoHistory;
    }
}
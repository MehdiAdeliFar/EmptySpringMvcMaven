package controllers;

import model.Person;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by mehdi on 5/23/18.
 */
@RestController
public class FirstRestController {
    @RequestMapping("/api/hi")
    public List<Person> SayHi() {
        List<Person> persons = new ArrayList<Person>();
        persons.add(new Person(1, 15, "mehdi adeli"));
        persons.add(new Person(2, 1, "حسین احمدی"));
        return persons;

    }
}

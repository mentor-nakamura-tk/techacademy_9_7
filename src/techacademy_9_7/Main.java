package techacademy_9_7;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        PersonDAO dao = new PersonDAO();

        List<Person> persons = dao.getPersonFromId("1");

        Iterator<Person> it = persons.iterator();
        while(it.hasNext()) {
            Person person = it.next();
            System.out.println(person.getId());
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }

    }
}

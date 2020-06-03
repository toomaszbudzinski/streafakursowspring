package pl.strefakursow.kursspring;

public class PersonUtil {

    private static PersonUtil instance = null;

    private PersonUtil() {

    }

    public PersonUtil getInstance() {
        if(instance == null) {
            instance = new PersonUtil();
        }
        return instance;
    }

    public final String operacja(Person person) {
        return person.name.toUpperCase();
    }
}
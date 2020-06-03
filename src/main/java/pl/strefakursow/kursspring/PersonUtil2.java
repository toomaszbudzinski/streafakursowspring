package pl.strefakursow.kursspring;

public enum PersonUtil2 {
    INSTANCE;

    public final String operation(Person person) {
        return person.name.toUpperCase();
    }
}
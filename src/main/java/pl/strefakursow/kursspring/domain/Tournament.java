package pl.strefakursow.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Tournament {

    @Autowired
    @Qualifier(value = "masterwindu")
    Jedi jedi;

    public Tournament() {}

    public void duel(){
        jedi.setAge(101);
    }

    public void setJedi(Jedi jedi) {
        this.jedi = jedi;
    }

    @Override
    public String toString() {
        return "Tournament.class - " + "W turnieju bierz udział " + jedi.toString();
    }
}
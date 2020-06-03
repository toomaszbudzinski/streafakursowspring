package pl.strefakursow.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Tournament {

    @Autowired
    Jedi jedi;

    public Tournament() {}

    public void duel(){
        jedi.setAge(101);
    }

    @Override
    public String toString() {
        return "W turnieju bierz udział " + jedi.toString();
    }
}
package pl.strefakursow.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype") //nowa instancja
public class Jedi {
//    @Value("Yoda")
//    private String name;
//    @Value("100")
//    private int age;
    private String name;
    private int age;
    private Quest quest;


    public Jedi(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public Jedi() {
        this.name = "yoda";
        this.age = 100;
        System.out.println("Jedi.class - " + "JediConstructor");
    }

    @Override
    public String toString() {
        return "Jedi{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", quest=" + quest +
                '}';
    }

    public Quest getJediQuest() {
        return quest;
    }

    @Autowired
    public void setQuest(Quest quest) {
        System.out.println("Jedi.class - " + "setJediQuest: Ustawienie zadania");
        this.quest = quest;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
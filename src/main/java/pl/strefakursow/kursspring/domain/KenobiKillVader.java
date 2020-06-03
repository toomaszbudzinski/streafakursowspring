package pl.strefakursow.kursspring.domain;

public class KenobiKillVader {
    private String name;
    private int age;
    private Quest quest;

    public KenobiKillVader(String name, int age) {
        this.name = name;
        this.age = age;
        //this.quest = new Quest("Zabij Lord Vadera");
    }

    @Override
    public String toString() {
        return "Rycerz jedi o imieniu: " + name + "(" + age + ")" + "Zadanie: " + quest;
    }
}
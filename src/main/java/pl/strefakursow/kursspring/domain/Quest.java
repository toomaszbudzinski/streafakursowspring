package pl.strefakursow.kursspring.domain;

import org.springframework.stereotype.Component;

@Component
public class Quest {

    private String questDescription;

    public Quest() {
        System.out.println("QuestConstructor:");
        this.questDescription = "Order 66";
    }

//    public Quest(String questDescription) {
//        this.questDescription = questDescription;
//    }

    @Override
    public String toString(){
        //System.out.println("QuestToString:");
        return questDescription;
    }
}
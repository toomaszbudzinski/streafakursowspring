package pl.strefakursow.kursspring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import pl.strefakursow.component.TestComponent;
import pl.strefakursow.kursspring.domain.*;
import pl.strefakursow.config.*;

@Component //bean name = hi
//@Import(MainConfig.class)
@Scope("singleton")
public class Hi implements CommandLineRunner {

    @Autowired
    Castle castle;

    @Autowired
    Tournament tournament;

    //@Autowired
    //TestComponent testComponent;

    @Override
    public void run(String... args) throws Exception {
//        Jedi yoda = new Jedi("Yoda", 100);
//        yoda.setQuest(new Quest("Order 66"));
//        KenobiKillVader obiWanKenobi = new KenobiKillVader("Obi-Wan Kenobi",30);
//        System.out.println(yoda);
        System.out.print("Hi.class - ");
        System.out.println(castle);
        tournament.duel();
        System.out.println(tournament);
        System.out.println(castle);
    }
}
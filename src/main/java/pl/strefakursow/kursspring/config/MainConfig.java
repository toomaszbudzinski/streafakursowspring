package pl.strefakursow.kursspring.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import pl.strefakursow.kursspring.domain.Jedi;
import pl.strefakursow.kursspring.domain.Quest;

//@ImportResource("classpath:config/castle-config.xml")
@Configuration
//@PropertySource("classpath:castle.properties")
public class MainConfig {

//    @Value("${my.castle.name}")
//    String name;

//    @Bean
//    public Quest quest(){
//        return new Quest();
//    }

    @Autowired
    Quest quest;

    @Bean(name = "masteryoda")
    @Primary //default spring bean
    public Jedi joda(){
        Jedi jedi = new Jedi("Yoda",401);
        jedi.setQuest(quest);
        return jedi;
    }

    @Bean(name = "masterwindu")
    public Jedi windu(){
        Jedi jedi = new Jedi("Mace Windu",100);
        jedi.setQuest(quest);
        return jedi;
    }

//    @Bean
//    public Castle castle(){
//        Castle castle = new Castle(jedi());
//        castle.setName(name);
//        return castle;
//    }

}
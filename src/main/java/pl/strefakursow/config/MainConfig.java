package pl.strefakursow.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.PropertySource;
import pl.strefakursow.kursspring.domain.Castle;
import pl.strefakursow.kursspring.domain.Jedi;
import pl.strefakursow.kursspring.domain.Quest;

//@ImportResource("classpath:config/castle-config.xml")
@Configuration
@PropertySource("classpath:castle.properties")
public class MainConfig {

    @Value("${my.castle.name}")
    String name;

    @Bean
    public Quest quest(){
        return new Quest();
    }

    @Bean
    public Jedi jedi(){
        Jedi jedi = new Jedi("Yoda",100);
        jedi.setQuest(quest());
        return jedi;
    }

    @Bean
    public Castle castle(){
        Castle castle = new Castle(jedi());
        castle.setName(name);
        return castle;
    }

}
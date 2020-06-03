package pl.strefakursow.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
//@PropertySource("classpath:castle.properties")
public class Castle {

    //@Value("${my.castle.name}")
    private String name = "Zamek United";

    //@Autowired
    Jedi jedi;

    @Autowired
    public Castle(Jedi jedi) {
        System.out.println("CastleConstructor");
        this.jedi = jedi;
    }

    public Castle(Jedi jedi, String name) {
        this.jedi = jedi;
        this.name = name;
    }

    @PostConstruct  //after run Spring Context
    public void build() {
        System.out.println("PostConstruct: Wybudowano zamek " + name);
    }

    @PreDestroy  //before destroy Spring Context
    public void tearDown(){
        System.out.println("PreDestroy: Burzenie zamku");
    }

    @Override
    public String toString() {
        return "CastleToString: Znajduje się tu zamek o nazwie " + name + " rycerz: " +jedi ;
    }

    public void setName(String name) {
        this.name = name;
    }
}
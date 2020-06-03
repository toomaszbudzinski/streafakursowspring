package pl.strefakursow.kursspring.domain;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
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
    //public Castle(@Qualifier(value = "masteryoda") Jedi jedi) { //specific bean
    public Castle(Jedi jedi) { //@primary bean masteryoda
        System.out.println("Castle.class - " + "CastleConstructor");
        this.jedi = jedi;
    }

    public Castle(Jedi jedi, String name) {
        System.out.println("Castle.class - " + "never done !!!!!!!!!!!!");
        this.jedi = jedi;
        this.name = name;
    }

    @PostConstruct  //after run Spring Context
    public void build() {
        System.out.println("Castle.class - " + "PostConstruct: Wybudowano zamek " + name);
    }

    @PreDestroy  //before destroy Spring Context
    public void tearDown(){
        System.out.println("Castle.class - " + "PreDestroy: Burzenie zamku");
    }

    @Override
    public String toString() {
        return "Castle.class - " + "CastleToString: Znajduje się tu zamek o nazwie " + name + " rycerz: " +jedi ;
    }

    public void setName(String name) {
        this.name = name;
    }
}
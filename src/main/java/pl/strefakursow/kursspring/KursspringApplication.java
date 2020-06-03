package pl.strefakursow.kursspring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;
import pl.strefakursow.kursspring.domain.Castle;

//@ComponentClass(basePackageClasses = {Hi.class, Castle.class, Jedi.class, Quest.class, TestComponent.class})
@SpringBootApplication
//@ComponentScan({"pl.strefakursow.kursrping","pl.strefakursow.component"})
//@ImportResource("classpath:config/spring-config.xml")
public class KursspringApplication {

	public static void main(String[] args) {
		SpringApplication.run(KursspringApplication.class, args);
//		ConfigurableApplicationContext ctx = SpringApplication.run(KursspringApplication.class, args);
//		Castle castle = (Castle) ctx.getBean("castle"); //get castle object - ctx.getBean("castle")
//		System.out.println(castle.toString());
	}

}

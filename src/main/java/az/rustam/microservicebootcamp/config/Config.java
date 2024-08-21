package az.rustam.microservicebootcamp.config;

import az.rustam.microservicebootcamp.model.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    @Bean
    @Scope(value = "singleton")
    public Student getStudents(){    // burda singleton pattern istifade olunur obyekt
        return new Student();        //1 defe yaranir Scope annotasiya sahesinde yoxlayir ki
                                     //obyekt yaranib sa bir daha yaratmir
    }
}

//prototype ise her cagirilan class ucun Obyekti ayrica yaradir


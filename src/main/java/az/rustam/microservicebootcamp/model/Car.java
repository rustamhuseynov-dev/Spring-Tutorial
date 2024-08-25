package az.rustam.microservicebootcamp.model;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@ConfigurationProperties("application")
@Configuration
@Data
public class Car {

    private Integer id;
    private List<String> names;
    private Integer model;
}
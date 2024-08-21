package az.rustam.microservicebootcamp;

import az.rustam.microservicebootcamp.model.Student;
import az.rustam.microservicebootcamp.rest.SampleController;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@Slf4j
public class MicroserviceBootcampApplication implements CommandLineRunner {

    @Autowired
    private SampleController sampleController;

    public static void main(String[] args) {
        SpringApplication.run(MicroserviceBootcampApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        String s = sampleController.test(1L);
        log.info(s);
    }
}

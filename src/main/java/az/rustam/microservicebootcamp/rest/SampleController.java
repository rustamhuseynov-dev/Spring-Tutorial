package az.rustam.microservicebootcamp.rest;

import az.rustam.microservicebootcamp.model.Student;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/test")
@RequiredArgsConstructor
public class SampleController {

    private final Student student;
}

package az.rustam.microservicebootcamp.rest;

import az.rustam.microservicebootcamp.model.Student;
import az.rustam.microservicebootcamp.repository.StudentRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(path = "/student")
@RequiredArgsConstructor
public class StudentController {

    private final StudentRepository studentRepository;

    @PostMapping
    public ResponseEntity<Student> save(@RequestBody Student student){
        return new ResponseEntity<>(studentRepository.save(student), HttpStatus.OK);
    }
}

package az.rustam.microservicebootcamp.rest;

import az.rustam.microservicebootcamp.model.Student;
import az.rustam.microservicebootcamp.service.TestService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/test")
@RequiredArgsConstructor
@Slf4j
public class SampleController {


    private final TestService studentServiceImpl;
    //burda TestService interfacesin 2 dene implement olunmus classi var
    //ve onlari adlarina gore cagirariq bunu @Qualifier annotasiyasi ilede etmek olar

//    public SampleController(@Qualifier(value = "studentServiceImpl")TestService testService) {
//        this.testService = testService;
//    }

    @Value("${rustam.bootcamp.name}")
    private String name;

    @Value("#{'${course.students}'}")
    private List<String> students;

    @Value("#{new Integer('${course.count}')}")
    private Integer count;


    @GetMapping(path = "/{id}")
    public String test(@PathVariable Long id){
        log.info(studentServiceImpl.toString());
        log.info("application-yaml-name {} ",name);
        log.info("course students {}",students);
        log.info("count {}",count);
        return "Hello";
    }
}

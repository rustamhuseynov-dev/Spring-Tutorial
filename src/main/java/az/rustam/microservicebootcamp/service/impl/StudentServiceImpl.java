package az.rustam.microservicebootcamp.service.impl;

import az.rustam.microservicebootcamp.service.TestService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements TestService {

    @Override
    public String toString() {
        return "StudentServiceImpl{}";
    }
}

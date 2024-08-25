package az.rustam.microservicebootcamp.repository;

import az.rustam.microservicebootcamp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student,Long> {
}

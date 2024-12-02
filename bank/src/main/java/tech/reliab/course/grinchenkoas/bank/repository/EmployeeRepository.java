package tech.reliab.course.grinchenkoas.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.grinchenkoas.bank.entity.Employee;


public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    void deleteById(int id);
}

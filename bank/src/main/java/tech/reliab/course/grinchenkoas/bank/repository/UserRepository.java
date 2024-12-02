package tech.reliab.course.grinchenkoas.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.grinchenkoas.bank.entity.User;

public interface UserRepository extends JpaRepository<User, Integer> {

    void deleteById(int id);
}

package tech.reliab.course.grinchenkoas.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.grinchenkoas.bank.entity.Bank;

public interface BankRepository extends JpaRepository<Bank, Integer> {

    void deleteById(int id);
}

package tech.reliab.course.grinchenkoas.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.grinchenkoas.bank.entity.BankOffice;

public interface BankOfficeRepository extends JpaRepository<BankOffice, Integer> {

    void deleteById(int id);
}

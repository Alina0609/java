package tech.reliab.course.grinchenkoas.bank.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import tech.reliab.course.grinchenkoas.bank.entity.PaymentAccount;

public interface PaymentAccountRepository extends JpaRepository<PaymentAccount, Integer> {

    void deleteById(int id);
}

package tech.reliab.course.grinchenkoas.bank.service;

import tech.reliab.course.grinchenkoas.bank.entity.Bank;
import tech.reliab.course.grinchenkoas.bank.entity.PaymentAccount;
import tech.reliab.course.grinchenkoas.bank.entity.User;

public interface PaymentAccountService {
    /*Создание платежного счета*/
    PaymentAccount create(Integer id, User user, Bank bank);

    /*Добавление суммы денег на платёжный счёт*/
    void addMoney(PaymentAccount payAcc, Double sumMoney);

    /*Вычитание суммы денег с платёжного счёта*/
    void subtractMoney(PaymentAccount payAcc, Double sumMoney);

    /*Ввести новый платёжный счёт*/
    void addPayment(Integer id, User user, Bank bank );

    void DeletePayment(User user, Bank bank, PaymentAccount paymentAccount);
}

package tech.reliab.course.grinchenkoas.bank.entity.common;

import lombok.Getter;
import lombok.Setter;
import tech.reliab.course.grinchenkoas.bank.entity.Bank;
import tech.reliab.course.grinchenkoas.bank.entity.User;

@Getter
@Setter
abstract public class Account {
    protected Integer id;
    protected User user;
    protected Bank bank;

    public Account(Integer id, User user, Bank bank){
        this.id = id;
        this.user = user;
        this.bank = bank;
    }
}

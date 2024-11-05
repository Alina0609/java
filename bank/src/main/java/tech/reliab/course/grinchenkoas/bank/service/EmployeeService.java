package tech.reliab.course.grinchenkoas.bank.service;

import tech.reliab.course.grinchenkoas.bank.entity.BankATM;
import tech.reliab.course.grinchenkoas.bank.entity.Employee;

import java.util.Date;

public interface EmployeeService {
    /*Создание сотрудника банка*/
    Employee create(Integer id, String name, String surname, Date birthday, String job, Double salary);

    /*Отправка работника на удалённую работу*/
    void toDistantWork(Employee employee);

    /*Отправка работника на работу в офисе*/
    void toOfficeWork(Employee employee);

    /*Разрешить или запретить выдавать кредиты*/
    void permissionForCredit(Employee employee, Boolean flag);

    /*Направить работника обслуживать банкомат*/
    void setWorkerToBankomat(BankATM bankATM, Employee employee);

    /*Прекратить чтобы сотрудник обслуживал банкомат*/
    void removeWorkerFromBankomat(BankATM bankATM, Employee employee);

}

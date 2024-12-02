package tech.reliab.course.grinchenkoas.bank.service;

import tech.reliab.course.grinchenkoas.bank.entity.BankOffice;
import tech.reliab.course.grinchenkoas.bank.model.BankOfficeRequest;

import java.util.List;

public interface BankOfficeService {

    BankOffice createBankOffice(BankOfficeRequest bankOfficeRequest);

    BankOffice getBankOfficeById(int id);

    BankOffice getBankDtoOfficeById(int id);

    List<BankOffice> getAllBankOffices();

    BankOffice updateBankOffice(int id, String name);

    void deleteBankAtm(int id);
}

package ru.liga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.liga.dao.AccountDao;
import ru.liga.domain.Account;

import java.util.List;

@Component
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void printAll() {
        for (Account account : accountDao.getAll()) {
            System.out.println(account);
        }
    }
    public void multiplyAll(Double multiplier) {
        for (Account account : accountDao.getAll()) {
            account.setVolume(account.getVolume() * multiplier);
        }
    }
    public void multiplyOwner(Long ownerId, Double multiplier) {
        List<Account> accounts = accountDao.getByOwner(ownerId);
        for (Account account : accounts) {
            account.setVolume(account.getVolume() * multiplier);
        }
    }
    public Double getTotalVolume() {
        Double totalVolume = 0.0;
        for (Account account : accountDao.getAll()) {
            totalVolume += account.getVolume();
        }
        return totalVolume;
    }
    public Double getTotalOwnerVolume(Long ownerId) {
        List<Account> accounts = accountDao.getByOwner(ownerId);
        Double totalVolume = 0.0;
        for (Account account : accounts) {
            totalVolume += account.getVolume();
        }
        return totalVolume;
    }
}

package ru.liga.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ru.liga.dao.AccountDao;
import ru.liga.domain.Account;

@Component
public class AccountService {

    @Autowired
    private AccountDao accountDao;

    public void printAll() {
        accountDao.getAll().forEach(System.out::println);
    }
    public void multiplyAll(Double multiplier) {
        accountDao.getAll().forEach(account ->
                account.setVolume(account.getVolume() * multiplier));
    }
    public void multiplyOwner(Long ownerId, Double multiplier) {
        accountDao.getByOwner(ownerId).forEach(account ->
                account.setVolume(account.getVolume() * multiplier));
    }
    public Double getTotalVolume() {
        return accountDao.getAll().stream().mapToDouble(Account::getVolume).sum();
    }
    public Double getTotalOwnerVolume(Long ownerId) {
        return accountDao.getByOwner(ownerId).stream()
                .mapToDouble(Account::getVolume).sum();
    }
}

package ru.liga.dao;

import org.springframework.stereotype.Component;
import ru.liga.domain.Account;
import ru.liga.mock.AccountDaoMock;

import java.util.ArrayList;
import java.util.List;

@Component
public class AccountDao {
    private AccountDaoMock accountDaoMock = new AccountDaoMock();
    public List<Account> getAll() {
        return accountDaoMock.getAccounts();
    }
    public Account getById(Long id) throws Exception {
        for (Account account : accountDaoMock.getAccounts()) {
            if (account.getId().equals(id)) {
                return account;
            }
        }
        throw new Exception("No account for specified id!");
    }
    public List<Account> getByOwner(Long id) {
        List<Account> list = new ArrayList<>();
        for (Account account : accountDaoMock.getAccounts()) {
            if (account.getOwner().equals(id)) {
                list.add(account);
            }
        }
        return list;
    }
}

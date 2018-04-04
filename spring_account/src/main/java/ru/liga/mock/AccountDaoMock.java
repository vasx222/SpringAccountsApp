package ru.liga.mock;

import ru.liga.domain.Account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class AccountDaoMock {

    private List<Account> accounts = new ArrayList<>();
    public AccountDaoMock() {
        accounts.add(new Account(1L, "Tom", 1L, 100.0));
        accounts.add(new Account(2L, "Bert", 2L, 155.0));
        accounts.add(new Account(3L, "Bob", 1L, 120.0));
    }
    public List<Account> getAccounts() {
        return accounts;
    }
}

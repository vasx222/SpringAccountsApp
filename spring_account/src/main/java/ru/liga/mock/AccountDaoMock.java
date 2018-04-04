package ru.liga.mock;

import org.springframework.stereotype.Component;
import ru.liga.dao.AccountDao;
import ru.liga.domain.Account;

import java.util.*;
import java.util.stream.Collectors;

@Component
public class AccountDaoMock implements AccountDao {

    private List<Account> accounts = new ArrayList<>();
    public AccountDaoMock() {
        accounts.add(new Account(1L, "Tom", 1L, 100.0));
        accounts.add(new Account(2L, "Bert", 2L, 155.0));
        accounts.add(new Account(3L, "Bob", 1L, 120.0));
    }
    @Override
    public List<Account> getAll() {
        return accounts;
    }
    @Override
    public List<Account> getById(Long id) {
        return accounts.stream()
                .filter(account -> account.getId().equals(id))
                .collect(Collectors.toList());
    }
    @Override
    public List<Account> getByOwner(Long id) {
        return accounts.stream()
                .filter(account -> Objects.equals(account.getOwner(), id))
                .collect(Collectors.toList());
    }
}

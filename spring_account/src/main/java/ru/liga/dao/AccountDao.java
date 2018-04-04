package ru.liga.dao;
import org.springframework.stereotype.Component;
import ru.liga.domain.Account;
import java.util.List;

@Component
public interface AccountDao {
    List<Account> getAll();
    List<Account> getById(Long id);
    List<Account> getByOwner(Long id);
}

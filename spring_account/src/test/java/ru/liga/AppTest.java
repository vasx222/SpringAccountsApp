package ru.liga;


import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ru.liga.config.Config;
import ru.liga.service.AccountService;

import static org.assertj.core.api.Assertions.assertThat;

public class AppTest {
    private ApplicationContext applicationContext;
    private AccountService accountService;

    @Before
    public void before() {
        applicationContext =
                new AnnotationConfigApplicationContext(Config.class);
        accountService = applicationContext.getBean(AccountService.class);
    }

    @Test
    public void simpleTest() {
        accountService.printAll();
        assertThat(accountService.getTotalVolume()).isEqualTo(375.0);
        accountService.multiplyAll(2.0);
        assertThat(accountService.getTotalVolume()).isEqualTo(750.0);
        assertThat(accountService.getTotalOwnerVolume(2L)).isEqualTo(310.0);
        accountService.multiplyOwner(2L, 3.0);
        assertThat(accountService.getTotalOwnerVolume(2L)).isEqualTo(930.0);
    }

}

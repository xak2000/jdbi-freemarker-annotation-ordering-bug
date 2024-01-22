package com.example;

import org.jdbi.v3.core.Jdbi;
import org.jdbi.v3.spring5.JdbiFactoryBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class Config {

    @Bean
    JdbiFactoryBean jdbi(DataSource dataSource) {
        JdbiFactoryBean jdbiFactoryBean = new JdbiFactoryBean(dataSource);
        jdbiFactoryBean.setAutoInstallPlugins(true);
        return jdbiFactoryBean;
    }

    @Bean
    EngineThenLocatorDao engineThenLocatorDao(Jdbi jdbi) {
        return jdbi.onDemand(EngineThenLocatorDao.class);
    }

    @Bean
    LocatorThenEngineDao locatorThenEngineDao(Jdbi jdbi) {
        return jdbi.onDemand(LocatorThenEngineDao.class);
    }

    @Bean
    OnMethodDao onMethodDao(Jdbi jdbi) {
        return jdbi.onDemand(OnMethodDao.class);
    }

}

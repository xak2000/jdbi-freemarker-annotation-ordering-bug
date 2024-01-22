package com.example;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class ApplicationTests {

    @Autowired
    private EngineThenLocatorDao engineThenLocatorDao;

    @Autowired
    private LocatorThenEngineDao locatorThenEngineDao;

    @Autowired
    private OnMethodDao onMethodDao;

    @Test
    void givenUseFreemarkerEngineIsBeforeUseFreemarkerSqlLocatorOnType_UseFreemarkerSqlLocatorShouldStillApply() {
        engineThenLocatorDao.myQuery(10);
    }

    @Test
    void givenUseFreemarkerEngineIsAfterUseFreemarkerSqlLocatorOnType_UseFreemarkerSqlLocatorShouldStillApply() {
        locatorThenEngineDao.myQuery(10);
    }

    @Test
    void givenUseFreemarkerEngineIsBeforeUseFreemarkerSqlLocatorOnMethod_UseFreemarkerSqlLocatorShouldStillApply() {
        onMethodDao.engineThenLocator(10);
    }

    @Test
    void givenUseFreemarkerEngineIsAfterUseFreemarkerSqlLocatorOnMethod_UseFreemarkerSqlLocatorShouldStillApply() {
        onMethodDao.locatorThenEngine(10);
    }

}

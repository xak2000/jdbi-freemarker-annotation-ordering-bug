package com.example;

import org.jdbi.v3.freemarker.UseFreemarkerEngine;
import org.jdbi.v3.freemarker.UseFreemarkerSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

public interface OnMethodDao {

    @SqlQuery
    @UseFreemarkerEngine
    @UseFreemarkerSqlLocator
    long engineThenLocator(int limit);

    @SqlQuery
    @UseFreemarkerSqlLocator
    @UseFreemarkerEngine
    long locatorThenEngine(int limit);

}

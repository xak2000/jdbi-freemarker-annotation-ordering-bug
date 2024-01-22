package com.example;

import org.jdbi.v3.freemarker.UseFreemarkerEngine;
import org.jdbi.v3.freemarker.UseFreemarkerSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@UseFreemarkerSqlLocator
@UseFreemarkerEngine
public interface LocatorThenEngineDao {

    @SqlQuery
    long myQuery(int limit);

}

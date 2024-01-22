package com.example;

import org.jdbi.v3.freemarker.UseFreemarkerEngine;
import org.jdbi.v3.freemarker.UseFreemarkerSqlLocator;
import org.jdbi.v3.sqlobject.statement.SqlQuery;

@UseFreemarkerEngine
@UseFreemarkerSqlLocator
public interface EngineThenLocatorDao {

    @SqlQuery
    long myQuery(int limit);

}

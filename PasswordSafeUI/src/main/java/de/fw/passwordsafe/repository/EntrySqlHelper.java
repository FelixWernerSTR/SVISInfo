package de.fw.passwordsafe.repository;

import java.util.ArrayList;
import java.util.List;
import org.springframework.data.relational.core.sql.Column;
import org.springframework.data.relational.core.sql.Expression;
import org.springframework.data.relational.core.sql.Table;

public class EntrySqlHelper {

    public static List<Expression> getColumns(Table table, String columnPrefix) {
        List<Expression> columns = new ArrayList<>();
        columns.add(Column.aliased("id", table, columnPrefix + "_id"));
        columns.add(Column.aliased("description", table, columnPrefix + "_description"));
        columns.add(Column.aliased("login", table, columnPrefix + "_login"));
        columns.add(Column.aliased("passwort", table, columnPrefix + "_passwort"));
        columns.add(Column.aliased("passwort_replay", table, columnPrefix + "_passwort_replay"));

        columns.add(Column.aliased("group_id", table, columnPrefix + "_group_id"));
        return columns;
    }
}
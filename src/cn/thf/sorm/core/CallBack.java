package cn.thf.sorm.core;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 * @author tianhf
 * @date 2020/5/31 8:49
 * @Version 1.0
 */
public interface CallBack {
    public Object doExecute(Connection conn, PreparedStatement ps, ResultSet rs) throws Exception;
}

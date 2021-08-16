package gpstudy.test;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

/**
 * @ClassName DataSourceUtils
 * @Description TODO
 * @Author zaiquan
 * @Date 2019/11/21 10:06
 * @Version 1.0
 **/
public class DataSourceUtils {
    // 声明变量 static
    public static DataSource dataSource;

    // 初始化连接池（仅一次）
    static {
        // 加载 druid.properteis 使用类加载
        System.out.println(DataSourceUtils.class.getClassLoader());
        InputStream is = DataSourceUtils.class.getClassLoader().getResourceAsStream("druid.properties");

        // 创建连接池对象 使用工具类
        try {
            // 创建配置文件对象
            Properties properties = new Properties();
            // 加载io流 key = value
            properties.load(is);
            // 使用第三方连接池 druid

            dataSource = DruidDataSourceFactory.createDataSource(properties);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    // 提供获取连接池的方法
    public static DataSource getDataSource() {
        return dataSource;
    }

    // 提供获取连接的方法
    public static Connection getConnection() throws SQLException {
     //   DruidPooledConnection pooledConnection= dataSource.getConnection();

        return dataSource.getConnection();
    }

    // 提供关闭资源的方法【connection是归还到连接池】
    // 提供关闭资源的方法 【方法重载】3 dql
    public static void closeResource(ResultSet resultSet, Statement statement, Connection connection) {
        // 关闭结果集
        // ctrl+alt+m 将java语句抽取成方法
        closeResultSet(resultSet);
        // 关闭语句执行者
        closeStatement(statement);
        // 关闭连接
        closeConnection(connection);
    }

    // 提供关闭资源的方法 【方法重载】 2 dml
    public static void closeResource(Statement statement, Connection connection) {
        // 关闭语句执行者
        closeStatement(statement);
        // 关闭连接
        closeConnection(connection);
    }

    private static void closeConnection(Connection connection) {
        if (connection != null) {
            try {
                connection.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void closeStatement(Statement statement) {
        if (statement != null) {
            try {
                statement.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void closeResultSet(ResultSet resultSet) {
        if (resultSet != null) {
            try {
                resultSet.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }
}

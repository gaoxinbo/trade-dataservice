package gaoxinbo.dataservice.guice;


import com.alibaba.druid.pool.DruidDataSource;
import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.Provides;
import com.google.inject.Singleton;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.sql.SQLException;
import java.util.Properties;

public class DataSourceMddule implements Module {

    private Properties buildProperties() {
        final Properties properties = new Properties();


        properties.setProperty("url","jdbc:mysql://192.168.1.80/trade");
        properties.setProperty("username","gaoxinbo");
        properties.setProperty("password","840326");

        properties.setProperty("filters","stat");
        properties.setProperty("maxActive","20");
        properties.setProperty("initialSize","1");
        properties.setProperty("maxWait","60000");
        properties.setProperty("minIdle","1");
        properties.setProperty("timeBetweenEvictionRunsMillis","60000");
        properties.setProperty("minEvictableIdleTimeMillis","300000");
        properties.setProperty("testWhileIdle","true");
        properties.setProperty("testOnBorrow","false");
        properties.setProperty("testOnReturn","false");
        properties.setProperty("poolPreparedStatements","true");
        properties.setProperty("maxOpenPreparedStatements","20");
        return properties;
    }



    @Provides
    @Singleton
    public JdbcTemplate getJdbcTemplate() throws SQLException {
        final DruidDataSource dataSource = new DruidDataSource();
        dataSource.configFromPropety(buildProperties());
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setPassword("840326");
        dataSource.setUsername("gaoxinbo");
        dataSource.setUrl("jdbc:mysql://192.168.1.80:3306/trade");
        dataSource.setTestWhileIdle(true);
        dataSource.setMinIdle(1);
        dataSource.setMaxActive(20);
        dataSource.setInitialSize(1);
        dataSource.init();
        final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        return jdbcTemplate;
    }

    @Override
    public void configure(final Binder binder) {

    }
}

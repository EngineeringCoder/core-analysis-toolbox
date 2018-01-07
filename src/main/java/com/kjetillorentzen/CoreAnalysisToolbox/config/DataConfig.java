package com.kjetillorentzen.CoreAnalysisToolbox.config;

import org.apache.tomcat.dbcp.dbcp2.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import javax.sql.DataSource;

@Configuration
@PropertySource("application.properties")
public class DataConfig {
    @Autowired
    Environment env;

    @Bean
    public LocalSessionFactoryBean sessionFactory() {
        Resource config = new ClassPathResource("hibernate.cfg.xml");
        LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
        sessionFactory.setConfigLocation(config);
        sessionFactory.setPackagesToScan(env.getProperty("core-analysis-toolbox.entity.package"));
        sessionFactory.setDataSource(dataSource());

        return sessionFactory;
    }

    @Bean
    public DataSource dataSource() {
        BasicDataSource ds = new BasicDataSource();

        // Driver class name
        ds.setDriverClassName(env.getProperty("core-analysis-toolbox.db.driver"));

        //Set URL
        ds.setUrl(env.getProperty("core-analysis-toolbox.db.url"));

        // Set username and password
        ds.setUsername(env.getProperty("core-analysis-toolbox.db.username"));
        ds.setPassword(env.getProperty("core-analysis-toolbox.db.password"));

        return ds;
    }
}

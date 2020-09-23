package io.pivotal.pal.tracker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class ConfigurationClass {
    @Bean
    public JdbcTimeEntryRepository retrieveRepo(DataSource dataSource) {
        return new JdbcTimeEntryRepository(dataSource);
    }

}

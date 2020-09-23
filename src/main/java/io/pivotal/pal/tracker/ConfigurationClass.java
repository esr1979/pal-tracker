package io.pivotal.pal.tracker;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigurationClass {
    @Bean
    public TimeEntryRepository retrieveRepo() {
        return new InMemoryTimeEntryRepository();
    }

}

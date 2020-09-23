package io.pivotal.pal.tracker;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class PalTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PalTrackerApplication.class, args);
    }

//    @Bean --> We have put this in a Configuration Class. In fact SpringBootApplication is a configuration class.
//    public TimeEntryRepository retrieveRepo () {
//       return new InMemoryTimeEntryRepository();
// }
}
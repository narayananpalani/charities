package com.example.charities;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CharityDBLoad {
    @Bean
    CommandLineRunner initDatabase(CharityRepository repository) {

        return args -> {
            System.out.println("Preloading " + repository.save(new Charity("Children Charity", "111111A", 800990, 9000000)));
            System.out.println("Preloading " + repository.save(new Charity("Education Charity", "222222B", 800991, 9100000)));
        };
    }

}

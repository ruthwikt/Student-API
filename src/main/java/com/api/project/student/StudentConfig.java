package com.api.project.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository) {
        return args -> {
            Student srikar = new Student(
                    "Srikar",
                    LocalDate.of(2000, Month.JULY, 14),
                    "dvsnsrikar2000@gmail.com"
            );
            Student ruthwik = new Student(
                    "Ruthwik",
                    LocalDate.of(2000, Month.APRIL, 14),
                    "dvsnsrikar2000@gmail.com"
            );
            repository.saveAll(List.of(srikar,ruthwik));
        };

    }
}

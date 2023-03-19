package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.time.Month.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args -> {
                   Student Nauman = new Student(
                            1L,
                            "Nauman",
                            "nauman@gmail.com",
                            LocalDate.of(1987, APRIL,15)
                    );
            Student Alex = new Student(2L,
                    "Alex",
                    "alex@gmail.com",
                    LocalDate.of(1988, APRIL,17)
            );
            repository.saveAll(List.of(Nauman,Alex));
        };
    }
}

package com.shiyaam.learnspringboot.repository;

import com.shiyaam.learnspringboot.model.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;
import java.util.Optional;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(
            StudentRepository repository
    ){
        return args -> {
            Student shiyaam = new Student(1L, "Shiyaam", "shiyaam@email.com", LocalDate.of(2002, Month.MARCH, 14));
            Student john = new Student(2L, "John", "john@email.com", LocalDate.of(2001, Month.DECEMBER, 21));
            repository.saveAll(List.of(shiyaam, john));
        };
    }
}

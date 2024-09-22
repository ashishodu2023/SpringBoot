package org.edu.ashish.SpringBootTutorial.config;


import org.edu.ashish.SpringBootTutorial.repository.StudentRepository;
import org.edu.ashish.SpringBootTutorial.student.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

@Configuration
public class StudentConfig {

    @Bean
    CommandLineRunner  commandLineRunner (
            StudentRepository repository){
        return args -> {
            Student ashish = new Student(
                    "Ashish",
                    "ashishn87@gmail.com",
                    LocalDate.of(2022, Month.JANUARY,5)
            );

            Student abha = new Student(
                    "Abha",
                    "abhagupta@gmail.com",
                    LocalDate.of(2024, Month.JANUARY,20)
            );
            repository.saveAll(
                    List.of(ashish,abha)
            );
        };
    }
}

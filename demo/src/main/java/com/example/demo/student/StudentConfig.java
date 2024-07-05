package com.example.demo.student;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.time.LocalDate;
import java.time.Month;
import java.util.List;

import static java.util.Calendar.APRIL;

@Configuration
public class StudentConfig {
    @Bean
    CommandLineRunner commandLineRunner(StudentRepository repository){
        return args->{
         Student vits=   new Student(

                    "Vits",
                    "	vits@gmail.com",
                    LocalDate.of(2004, APRIL, 17)


            );

            Student ts=   new Student(

                    "ts",
                    "	ts@gmail.com",
                    LocalDate.of(2008, APRIL, 17)


            );
            repository.saveAll(
                    List.of(vits, ts)
            );
        };
    }
}

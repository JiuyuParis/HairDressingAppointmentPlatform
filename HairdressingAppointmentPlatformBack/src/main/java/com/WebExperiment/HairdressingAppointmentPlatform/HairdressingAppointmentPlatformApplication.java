package com.WebExperiment.HairdressingAppointmentPlatform;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value = "com.WebExperiment.HairdressingAppointmentPlatform.mapper")
public class HairdressingAppointmentPlatformApplication {

    public static void main(String[] args) {
        SpringApplication.run(HairdressingAppointmentPlatformApplication.class, args);
    }

}

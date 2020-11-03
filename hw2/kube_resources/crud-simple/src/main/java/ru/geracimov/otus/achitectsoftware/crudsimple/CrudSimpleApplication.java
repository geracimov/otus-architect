
package ru.geracimov.otus.achitectsoftware.crudsimple;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Map;

@SpringBootApplication
public class CrudSimpleApplication {

    public static void main(String[] args) {
        Map<String, String> env = System.getenv();
        System.out.println("ENV:");
        env.entrySet().forEach(System.out::println);
        SpringApplication.run(CrudSimpleApplication.class, args);
    }

}
package test.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

import java.util.Scanner;

@SpringBootApplication
@ComponentScan("test")
public class HibernateProblemApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext appContext = SpringApplication.run(HibernateProblemApplication.class, args);

        System.out.println("Press 'q' to terminate");
        Scanner scanner = new Scanner(System.in);

        String line = null;

        while ( !"q".equals(line) ) {

            line = scanner.nextLine();

        }

    }

}

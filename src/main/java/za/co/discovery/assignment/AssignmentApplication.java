package za.co.discovery.assignment;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "za.co.discovery.assignment")
public class AssignmentApplication {

  public static void main(String[] args) {
    SpringApplication.run(AssignmentApplication.class, args);
  }

}


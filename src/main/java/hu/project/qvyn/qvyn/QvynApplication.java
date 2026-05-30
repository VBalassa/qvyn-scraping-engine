package hu.project.qvyn.qvyn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableAutoConfiguration
public class QvynApplication {

	public static void main(String[] args) {
		SpringApplication.run(QvynApplication.class, args);
	}

}

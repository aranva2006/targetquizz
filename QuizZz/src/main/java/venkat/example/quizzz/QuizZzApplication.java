package venkat.example.quizzz;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "venkat.example.quizzz")
public class QuizZzApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuizZzApplication.class, args);
	}
}

package matriphics.department_service;

import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
		info=@Info(
				title="Springboot Rest Api Documentation",
				description = "Springboot Rest Api documentation",
				version="v1.0",
				contact = @Contact(
						name="Prasoon",
						email="extracurricularactivities13@gmail.com",
						url="https://www.linkedin.com/in/prasoonm/"
				)
		)
)
public class DepartmentServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmentServiceApplication.class, args);
	}

}

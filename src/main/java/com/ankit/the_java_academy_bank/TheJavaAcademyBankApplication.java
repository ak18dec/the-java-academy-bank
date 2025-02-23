package com.ankit.the_java_academy_bank;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import io.swagger.v3.oas.annotations.info.License;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition (
		info = @Info(
				title = "The Java Academy Bank Application",
				description = "Backend REST APIs for TJA Bank",
				version = "v1.0",
				contact = @Contact (
						name = "Ankit Kumar",
						url = "https://github.com/ak18dec/the-java-academy-bank/"
				),
				license = @License (
						name = "Ankit Kumar",
						url = "https://github.com/ak18dec/the-java-academy-bank/"
				)
		),
		externalDocs = @ExternalDocumentation (
				description = "The Java Academy Bank App Documentation",
				url = "https://github.com/ak18dec/the-java-academy-bank/"
		)
)
public class TheJavaAcademyBankApplication {

	public static void main(String[] args) {
		SpringApplication.run(TheJavaAcademyBankApplication.class, args);
	}
	
	

}

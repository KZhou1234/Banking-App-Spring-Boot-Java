package com.kolab.javabankingapp;

import io.swagger.v3.oas.annotations.ExternalDocumentation;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.info.Contact;
import io.swagger.v3.oas.annotations.info.Info;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@OpenAPIDefinition(
        info = @Info(
                title = "Kapital",
                description = "Backend Rest APIs for Bank Provider",
                version = "v1.0",
                contact = @Contact(
                        name = "App Provider",
                        email = "bankappprovider@gamil.com"
                )
        ),
        externalDocs = @ExternalDocumentation(
                description = "Bank app provider"
        )
)
public class JavaBankingAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(JavaBankingAppApplication.class, args);
    }

}

package com.logsoluprobl.appbank.config;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Bean;

import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Contact;
import io.swagger.v3.oas.models.info.Info;
import io.swagger.v3.oas.models.info.License;

@Configuration
public class OpenApiConfig {
    @Bean
    public OpenAPI bankOpenAPI() {
        return new OpenAPI()
                .info(new Info()
                    .title("mi app de banco")
                    .description("API REST para la gestion de clientes, cuentas y transacciones bancarias")
                    .version("1.0.0")
                    .contact(new Contact()
                        .name("Juan jose velez")
                        .email("soporte@appbank.com")
                        .url("http://url.de.ejemplo.com"))
                    .license(new License()
                        .name("nombre de la licencia")
                        .url("http://urle.de.la.licencia.com")));
    }
}

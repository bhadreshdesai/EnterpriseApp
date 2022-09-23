package bdd.demo.enterpriseapp.configuration;

import org.springdoc.core.customizers.OpenApiCustomiser;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class OpenApiConfig {
    @Value("${app.name}")
    private String appName;

    @Bean
    public OpenApiCustomiser serverOpenApiCustomiser() {
        return openAPI -> openAPI.getServers().forEach(server -> {
            server.setDescription(appName);
        });
    }
}

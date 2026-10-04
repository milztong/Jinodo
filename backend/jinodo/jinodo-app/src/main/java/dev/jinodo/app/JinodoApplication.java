package dev.jinodo.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
@EntityScan(basePackages = "dev.jinodo")
@EnableJpaRepositories(basePackages = "dev.jinodo")
@ComponentScan(
        basePackages = "dev.jinodo",
        excludeFilters = {
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = "dev\\.jinodo\\..*ServiceApplication"
                ),
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = "dev\\.jinodo\\.(auth|processing|chat)\\.config\\.SecurityConfig"
                ),
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = "dev\\.jinodo\\.(auth|ingestion|processing)\\.config\\.OpenApiConfig"
                ),
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = "dev\\.jinodo\\.ingestion\\.config\\.WebConfig"
                ),
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = "dev\\.jinodo\\.processing\\.config\\.(WebSocketConfig|WebSocketSecurityConfig)"
                ),
                @ComponentScan.Filter(
                        type = FilterType.REGEX,
                        pattern = "dev\\.jinodo\\.chat\\.security\\.JwtAuthFilter"
                )
        }
)
public class JinodoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JinodoApplication.class, args);
    }
}

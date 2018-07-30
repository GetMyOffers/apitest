package io.nebulas.apitest;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * Hello world!
 *
 */
@ComponentScan(basePackages = {"io.nebulas.apitest"})
@EnableAutoConfiguration
@EnableAspectJAutoProxy
@Configuration
@ServletComponentScan
@Slf4j
@SpringBootApplication()
public class ApiTestBootstrap
{
    public static void main(String[] args) {
        SpringApplication.run(ApiTestBootstrap.class, args);
        // LOGGER.info("Server Started");
    }
}

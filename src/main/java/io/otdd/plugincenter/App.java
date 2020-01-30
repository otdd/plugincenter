package io.otdd.plugincenter;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("io.otdd.plugincenter")
public class App{

    public static final Logger LOGGER = LoggerFactory.getLogger(App.class);

    public static void main(String args[]){
        LOGGER.info("starting plugin center..");
        SpringApplication.run(App.class, args);
        LOGGER.info("plugin center started.");
    }

}

package com.tobilko.translator;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by Andrew Tobilko on 11/28/17.
 */
@SpringBootApplication
public class Application {

    public static void main(String... args) {
        final SpringApplication application = new SpringApplication(Application.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.run(args);
    }

}
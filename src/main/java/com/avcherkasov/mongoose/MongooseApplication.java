package com.avcherkasov.mongoose;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@ImportResource({"classpath:spring/context.xml"})
public class MongooseApplication {
    public static void main(String[] args) throws Exception {
        SpringApplication.run(MongooseApplication.class, args);
    }
}

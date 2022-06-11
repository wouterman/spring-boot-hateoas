package com.github.wouterman.springhateoas;

import com.github.wouterman.springhateoas.domain.ProductionOrders;
import com.github.wouterman.springhateoas.domain.model.ProductionOrder;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringHateoasApplication {

  public static void main(String[] args) {
    SpringApplication.run(SpringHateoasApplication.class, args);
  }

  @Bean
  public CommandLineRunner loadTestData(ProductionOrders repository) {
    return args -> {
      repository.save(ProductionOrder.create("order1"));
      repository.save(ProductionOrder.create("order2"));
    };
  }

}

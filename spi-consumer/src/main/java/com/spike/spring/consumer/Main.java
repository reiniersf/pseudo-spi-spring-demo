package com.spike.spring.consumer;

import com.spike.spring.consumer.api.SpecConsumer;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {

  public static void main(String[] args) throws InterruptedException {
    ApplicationContext context = new AnnotationConfigApplicationContext(ConfigConsumer.class);
    SpecConsumer specConsumer = context.getBean(SpecConsumer.class);
    specConsumer.acceptIncome("This is the object");
  }
}

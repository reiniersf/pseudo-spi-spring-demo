package com.spike.spring.impl.a;

import com.spike.spring.provider.api.SpecProcessor;
import org.springframework.stereotype.Component;

@Component
public class SpecAProcessor implements SpecProcessor {

  @Override
  public void processIncome(Object income) throws InterruptedException {
    System.out.println("Starting processor A...");
    Thread.sleep(3000);
    System.out.println(String.format("A Processing income object: [%s]", income));
    Thread.sleep(2000);
    System.out.println("...Processor A finished");
  }
}

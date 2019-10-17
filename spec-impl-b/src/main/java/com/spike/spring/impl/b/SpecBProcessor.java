package com.spike.spring.impl.b;

import com.spike.spring.provider.api.SpecProcessor;
import org.springframework.stereotype.Component;

@Component
public class SpecBProcessor implements SpecProcessor {

  @Override
  public void processIncome(Object income) throws InterruptedException {
    System.out.println("Starting processor B...");
    Thread.sleep(3000);
    System.out.println(String.format("B Processing income object: [%s]", income));
    Thread.sleep(2000);
    System.out.println("...Processor B finished");
  }
}

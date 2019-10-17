package com.spike.spring.consumer.impl;

import com.spike.spring.consumer.api.SpecConsumer;
import com.spike.spring.provider.api.SpecProcessor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class DefaultSpecConsumer implements SpecConsumer {

  @Autowired
  private SpecProcessor processor;

  @Override
  public void acceptIncome(Object income) throws InterruptedException {
    processor.processIncome(income);
  }
}

package com.spike.spring.consumer.api;

public interface SpecConsumer {

  void acceptIncome(Object income) throws InterruptedException;
}

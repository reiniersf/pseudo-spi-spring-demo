package com.spike.spring.queue.consumer.api;

public interface AsyncQueueDelegate {
  void processMessage(Object message);
}

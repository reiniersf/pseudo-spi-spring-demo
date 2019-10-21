package com.spike.spring.queue.consumer;

import com.spike.spring.queue.consumer.api.AsyncQueueDelegate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.StreamListener;
import org.springframework.cloud.stream.messaging.Sink;

@EnableBinding(Sink.class)
public class QueueConsumer {

  @Autowired
  private AsyncQueueDelegate delegate;

  @StreamListener(Sink.INPUT)
  public void notifyDelegate(Object message){
    delegate.processMessage(message);
  }

}

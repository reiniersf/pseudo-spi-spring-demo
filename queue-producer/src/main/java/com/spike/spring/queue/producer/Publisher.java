package com.spike.spring.queue.producer;

import static java.util.Collections.singletonMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.MessageBuilder;
import org.springframework.stereotype.Component;

@Component
public class Publisher {

  private final Source source;

  @Autowired
  public Publisher(Source source){

    this.source = source;
  }

  void produce(String content) {
    source.output().send(MessageBuilder.createMessage(content,
        new MessageHeaders(
            (singletonMap(MessageHeaders.CONTENT_TYPE, "application/json")))));
  }
}

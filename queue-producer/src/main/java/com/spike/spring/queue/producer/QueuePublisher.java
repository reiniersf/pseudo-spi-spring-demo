package com.spike.spring.queue.producer;

import static java.util.Collections.singletonMap;

import java.util.stream.Stream;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.annotation.Output;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.context.annotation.Bean;
import org.springframework.integration.annotation.InboundChannelAdapter;
import org.springframework.integration.channel.DirectChannel;
import org.springframework.integration.core.MessageSource;
import org.springframework.messaging.MessageChannel;
import org.springframework.messaging.MessageHeaders;
import org.springframework.messaging.support.GenericMessage;

@SpringBootApplication
@EnableBinding(Source.class)
public class QueuePublisher implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(QueuePublisher.class, args);
  }

  @Bean
  @InboundChannelAdapter(channel = Source.OUTPUT)
  public MessageSource<String> produce() {
    return () -> new GenericMessage<>("once",
        new MessageHeaders(
            (singletonMap(MessageHeaders.CONTENT_TYPE, "application/json"))));
  }

  @Override
  public void run(String... args) throws Exception {

    /*Stream.of("this", "IS", "a", "Request")
        .map(this::produce)
//        .forEach(messageChannel::send)
    ;*/

  }
}

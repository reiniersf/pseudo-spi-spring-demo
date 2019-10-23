package com.spike.spring.queue.producer;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

import java.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.stream.annotation.EnableBinding;
import org.springframework.cloud.stream.messaging.Source;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@EnableBinding(Source.class)
@RestController
@RequestMapping("/")
public class QueuePublisher {

  public static void main(String[] args) {
    SpringApplication.run(QueuePublisher.class, args);
  }

  @Autowired
  private Publisher publisher;

  @RequestMapping(method = POST, value = "message")
  public void run(@RequestBody String ... args){
    Arrays.stream(args).forEach(publisher::produce);
  }
}

package com.spike.spring.queue.client.service.impl;

import com.spike.spring.queue.client.service.api.FeedbackReporter;
import java.net.URI;
import java.util.List;
import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class RestFeedBackReporter implements FeedbackReporter {

  @Override
  public void processMessage(Object message) {
    ResponseEntity<List<Tuple<Integer, Character>>> response = new RestTemplateBuilder().build()
        .exchange(URI.create("http://localhost:8080/toCharMap"),
            HttpMethod.POST,
            new ResponseEntity<>(message.toString(), HttpStatus.OK),
            new ParameterizedTypeReference<List<Tuple<Integer, Character>>>() {
            });

    System.out.println(response.getBody());
  }
}

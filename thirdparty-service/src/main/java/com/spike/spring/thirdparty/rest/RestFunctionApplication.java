package com.spike.spring.thirdparty.rest;

import static com.spike.spring.thirdparty.rest.Tuple.tupleWith;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class RestFunctionApplication {

  public static void main(String[] args) {
    SpringApplication.run(RestFunctionApplication.class, args);
  }

  @Bean
  public Function<String, List<Tuple<Integer, Character>>> toCharMap() {
    return string -> {
      char[] chars = string.toCharArray();
      List<Tuple<Integer, Character>> all = new ArrayList<>();
      for (char c : chars) {
        all.add(tupleWith(Character.hashCode(c), c));
      }
      return all;
    };
  }

}

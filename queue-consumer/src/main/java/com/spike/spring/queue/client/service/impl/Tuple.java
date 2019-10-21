package com.spike.spring.queue.client.service.impl;

class Tuple<L, R> {

  private R right;
  private L left;

  public Tuple(){}

  public Tuple(R right, L left) {
    this.right = right;
    this.left = left;
  }

  public R getRight() {
    return right;
  }

  public L getLeft() {
    return left;
  }

  @Override
  public String toString() {
    return String.format("Tuple: [%s -> %s]", right, left);
  }
}

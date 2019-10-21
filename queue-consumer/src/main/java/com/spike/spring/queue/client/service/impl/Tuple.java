package com.spike.spring.queue.client.api.impl;

class Tuple<L, R> {

  private R right;
  private L left;

  private Tuple(R right, L left) {
    this.right = right;
    this.left = left;
  }

  public R getRight() {
    return right;
  }

  public L getLeft() {
    return left;
  }

  public static <L, R> Tuple<L, R> tupleWith(L left, R right) {
    return new Tuple<>(right, left);
  }
}

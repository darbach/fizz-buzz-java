package edu.cnm.deepdive;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class FizzBuzzTest {

  static final Object[][] testCases = {
      {0, "FizzBuzz"}, //auto-boxing compiler wraps a primitive into an object
      {4, "4"},
      {6, "Fizz"},
      {10, "Buzz"},
      {15, "FizzBuzz"},
      {101, "101"}
  };

  @Test
  void getFizzBuzz() {
    for (Object[] testCase : testCases) {
      int value = (Integer) testCase[0]; //coerce the compiler to class cast & auto-unbox to int
      String expected = (String) testCase[1];
      String actual = FizzBuzz.getFizzBuzz(value);
      System.out.printf("Input: %d; expected: %s; actual: %s%n", value, expected, actual);
      assertEquals(expected, actual);
    }
  }
}
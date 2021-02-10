package edu.cnm.deepdive;

import java.util.Scanner;

public class FizzBuzz {

  public static void main(String[] args) {
    int upperLimit;
    if (args.length > 0) {
      upperLimit = Integer.parseInt(args[0]);
      emitResults(upperLimit);
    } else {
      do {
        upperLimit = getUpperLimit();
        emitResults(upperLimit);
      } while (upperLimit > 0);
    }
  }

  private static void emitResults(int upperLimit) {
    for (int i = 1; i <= upperLimit; i++) {
      System.out.println(getFizzBuzz(i));
    }
  }

  /**
   *
   * @param value
   * @return Divisible by 3 & 5 is "FizzBuzz"; divisible by only 3 is "Fizz"
   */
  public static String getFizzBuzz(int value) {
    String result;
    if (value % 15 == 0) {
      result = "FizzBuzz";
    } else if (value % 5 == 0) {
      result = "Buzz";
    } else if (value % 3 == 0) {
      result = "Fizz";
    } else {
      result = Integer.toString(value);
    }
    return result;
  }

  private static int getUpperLimit() {
    int result;
    Scanner scanner = new Scanner(System.in);
    do {
      System.out.print("Enter a number (1 or greater): ");
      result = scanner.nextInt();
    } while (result < 0);
    return result;
  }
}

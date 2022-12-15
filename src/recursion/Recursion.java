package recursion;

public class Recursion {

  // Problem 1 - Fibonacci of a number
  public int fibonacci(int n) {
    if(n < 0) {
      return -1;
    }
    if(n == 0 || n == 1) {
      return n;
    }
    return fibonacci(n - 1) + fibonacci(n - 2);
  }

  // Problem 2 - Sum of digits
  public int sumOfDigits(int n) {
    if(n < 0) {
      return -1;
    }
    if(n == 0) {
      return 0;
    }
    return n % 10 + sumOfDigits(n/10);
  }

  // Problem 3 - Power of a number
  public int powerOfNumber(int base, int exp) {
    if(exp < 0) {
      return -1;
    }
    if(exp == 0) {
      return 1;
    }
    return base * powerOfNumber(base, exp - 1);
  }

  // Problem 4 - Greatest of common divisor
  public int greatestCommonDivisor(int a, int b) {
    if(a < 0 || b < 0) {
      return -1;
    }
    if(b == 0) {
      return a;
    }
    return greatestCommonDivisor(b, a%b);
  }

  // Problem 5 - Convert Decimal to binary
  public int decimalToBinary(int n) {
    if(n == 0) {
      return 0;
    }
    return n % 2 + (10 * decimalToBinary(n/2));
  }
}


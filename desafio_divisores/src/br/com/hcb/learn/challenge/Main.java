package br.com.hcb.learn.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    StringTokenizer st = new StringTokenizer(br.readLine());
    int divisor = Integer.parseInt(st.nextToken());
    int notDivisor = Integer.parseInt(st.nextToken());
    int multiply = Integer.parseInt(st.nextToken());
    int notMultiply = Integer.parseInt(st.nextToken());
    br.close();

    int mysteriousNumber = -1;

    int num;
    int sqrt = (int) Math.sqrt(multiply);
    for (int i = 1; i <= sqrt; i = i + 1) {
      num = divisor * i;
      if (num % notDivisor == 0) {
        continue;
      }
      if (multiply % num != 0) {
        continue;
      }

      if (notMultiply % num == 0) {
        continue;
      }
      mysteriousNumber = num;
      break;
    }
    System.out.println(mysteriousNumber);
  }
}

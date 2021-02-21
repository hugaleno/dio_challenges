package br.com.hcb.learn.challenge;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    String line;

    while ((line = br.readLine()) != null) {
      boolean isRepeated = false;
      for (int i = 1; i < line.length(); i++) {
        String sub1 = line.substring(0, i);
        String sub2 = line.substring(i);
        if (sub1.endsWith(sub2)) {
          System.out.println(sub1);
          isRepeated = true;
        }
      }
      if (!isRepeated) {
        System.out.println(line);
      }
    }
  }
}
